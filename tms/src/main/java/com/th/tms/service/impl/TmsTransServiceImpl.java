package com.th.tms.service.impl;

import com.th.tms.entity.TmsTransDetailedEntity;
import com.th.tms.entity.TmsTransEntity;
import com.th.tms.repository.TmsTransDetailedRepository;
import com.th.tms.repository.TmsTransRepository;
import com.th.tms.repository.impl.TmsTransRepositoryImpl;
import com.th.tms.service.TmsTransService;
import com.th.tms.util.BaseUtil;
import com.th.tms.util.UUIDGenerator;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TmsTransServiceImpl implements TmsTransService {

    @Autowired
    TmsTransRepository tmsTransRepository;
    @Autowired
    TmsTransRepositoryImpl tmsTransRepositoryImpl;
    @Autowired
    TmsTransDetailedRepository tmsTransDetailedRepository;


    @Override
    @Transactional
    public Map<String, String> saveTrans(JSONObject jsonObject) {
        Map<String,String> returnMap = new HashMap<>();
        returnMap.put("suc","运单保存成功。");
        if (!BaseUtil.Base_HasValue(jsonObject)) {
            returnMap.put("error","运单保存失败。");
            return returnMap;
        }
        String id = UUIDGenerator.getUUID();
        TmsTransEntity tmsTransEntities = this.getTmsTransEntity(jsonObject,id);
        List<TmsTransDetailedEntity> tmsTransDetailedEntities = new ArrayList<>();
        tmsTransDetailedEntities = this.getTmsTransDetailedEntity(jsonObject,id);
        try {
            tmsTransRepository.save(tmsTransEntities);
            tmsTransDetailedRepository.save(tmsTransDetailedEntities);
        }catch (Exception e) {
            returnMap.put("error","运单保存失败。:" + e);
        }
        return returnMap;
    }


    @Override
    @Transactional
    public Map<String, String> deleteById(String id) {
        Map<String,String> returnMap = new HashMap<>();
        returnMap.put("suc","运单保存成功。");
        if (!BaseUtil.Base_HasValue(id)) {
            returnMap.put("error","运单ID为空。");
            return returnMap;
        }
        TmsTransEntity tmsTransEntity = tmsTransRepository.findOne(id);
        if (!BaseUtil.Base_HasValue(tmsTransEntity)){
            returnMap.put("error","运单ID不存在，找不到相应的运单。");
            return returnMap;
        }
        List<TmsTransDetailedEntity> tmsTransDetailedEntities = tmsTransDetailedRepository.findByTransIdAndUDelete(id,1);
        if (!BaseUtil.Base_HasValue(tmsTransDetailedEntities)) {
            returnMap.put("error","运单ID不存在，找不到相应的运单明细。");
            return returnMap;
        }
        try {
            tmsTransEntity.setuDelete(0);
            for (TmsTransDetailedEntity tmsTransDetailedEntity: tmsTransDetailedEntities) {
                tmsTransDetailedEntity.setuDelete(0);
            }
            tmsTransRepository.save(tmsTransEntity);
            tmsTransDetailedRepository.save(tmsTransDetailedEntities);
        }catch (Exception e){
            returnMap.put("error","运单保存异常，请检查单据。:" + e);
            return returnMap;
        }
        return returnMap;
    }

    @Override
    @Transactional
    public Page<TmsTransEntity> findAllTransPage(int start, int size) {
        Sort sort = new Sort(Sort.Direction.ASC,"uTime"); //设置根据uTime倒序排列
        Pageable pageable = new PageRequest(start,size,sort);
        Page<TmsTransEntity> page = tmsTransRepository.findAll(pageable);    //根据这个分页对象获取分页对象
        return page;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public List<Map<String, Object>> findByIdATrans(String id) {
        Map<String,Object> returnMap = new HashMap<>();
        List<Map<String, Object>> returnList = new ArrayList<>();
        BaseUtil.Base_CheckHasValue("运单ID",id);
        TmsTransEntity tmsTransEntity = tmsTransRepository.findOne(id);
        BaseUtil.Base_CheckHasValue("运单",tmsTransEntity);
        List<TmsTransDetailedEntity> tmsTransDetailedEntities = tmsTransDetailedRepository.findByTransIdAndUDelete(id,1);
        BaseUtil.Base_CheckHasValue("运单明细",tmsTransDetailedEntities);

        returnMap.put("trans",tmsTransEntity);
        returnMap.put("transDteil",tmsTransDetailedEntities);
        returnList.add(returnMap);
        return returnList;
    }

    @Override
    @Transactional
    public Map<String, String> findByIdAndUpdataTrans(JSONObject jsonObject) {
        Map<String,String> returnMap = new HashMap<>();
        List<TmsTransDetailedEntity> list = new ArrayList<>();
        returnMap.put("suc","运单保存成功。");
        BaseUtil.Base_CheckHasValue("更新数据", jsonObject);
        JSONObject transJsoObjet = jsonObject.getJSONObject("trans");
        JSONArray  transDetilJsonArray = jsonObject.getJSONArray("transDtel");
        BaseUtil.Base_CheckHasValue("运单数据", jsonObject);
        BaseUtil.Base_CheckHasValue("运单明细数据", jsonObject);

        try {
            TmsTransEntity tmsTransEntity = (TmsTransEntity) JSONObject.toBean(transJsoObjet,TmsTransEntity.class);
            if (!tmsTransEntity.equals("制单")) {
                returnMap.put("error","不是制单单据不能进行修改。");
            }
            for (int i=0; i<transDetilJsonArray.size(); i++) {
                JSONObject transDetilJsonObject = transDetilJsonArray.getJSONObject(i);
                TmsTransDetailedEntity tmsTransDetailedEntity = (TmsTransDetailedEntity) JSONObject.toBean(transDetilJsonObject, TmsTransDetailedEntity.class);
                list.add(tmsTransDetailedEntity);
            }
            tmsTransRepository.save(tmsTransEntity);
            tmsTransDetailedRepository.save(list);
        }catch (Exception e) {
            returnMap.put("error","单据有问题不能进行修改。");
        }

        return returnMap;
    }


    /**
     * 解析JSONOBJECT
     * @param jsonObject
     * @return
     */
    public TmsTransEntity getTmsTransEntity(JSONObject jsonObject, String id){
        TmsTransEntity tmsTransEntity = new TmsTransEntity();
        String transCustNo = (String) jsonObject.get("transCustNo");
        String transWaybillNo = (String) jsonObject.get("transWaybillNo");
        String transState = (String) jsonObject.get("transState");
        String transType = (String) jsonObject.get("transType");
        String custId = (String) jsonObject.get("custId");
        String custName = (String) jsonObject.get("custName");
        String shipperId = (String) jsonObject.get("shipperId");
        String shipperName = (String) jsonObject.get("shipperName");
        String recieverId = (String) jsonObject.get("recieverId");
        String recieverName = (String) jsonObject.get("recieverName");
        String carrierId = (String) jsonObject.get("carrierId");
        String carrierName = (String) jsonObject.get("carrierName");
        String truckCode = (String) jsonObject.get("truckCode");
        String driverId = (String) jsonObject.get("driverId");
        String driverName = (String)  jsonObject.get("driverName");
        String driverMobile = (String)  jsonObject.get("driverMobile");
        String transBPro = (String)  jsonObject.get("transBPro");
        String transBCity = (String)  jsonObject.get("transBCity");
        String transEArea = (String)  jsonObject.get("transEArea");
        String transBZip = (String) jsonObject.get("transBZip");
        String transBAddr = (String) jsonObject.get("transBAddr");
        String transBShipper = (String)  jsonObject.get("transBShipper");
        String transBShipperPhone = (String)  jsonObject.get("transBShipperPhone");
        String transEPro = (String)  jsonObject.get("transEPro");
        String transECity = (String)  jsonObject.get("transECity");
        String transEZip = (String)  jsonObject.get("transEZip");
        String transEAddr = (String)  jsonObject.get("transEAddr");
        Double transvol = (Double) jsonObject.get("transVol");
        Double transWeight = (Double) jsonObject.get("transWeight");
        Double transWeightfee = (Double) jsonObject.get("transWeightfee");
        Double transNum = (Double) jsonObject.get("transNum");
        tmsTransEntity.setTransVol(transvol);
        tmsTransEntity.setTransWeightfee(transWeightfee);
        tmsTransEntity.setTransNum(transNum);
        tmsTransEntity.setTransWeight(transWeight);
        tmsTransEntity.setTransCustNo(transCustNo);
        tmsTransEntity.setTransWaybillNo(transWaybillNo);
        tmsTransEntity.setTransState(transState);
        tmsTransEntity.setTransType(transType);
        tmsTransEntity.setCustId(custId);
        tmsTransEntity.setCustName(custName);
        tmsTransEntity.setShipperId(shipperId);
        tmsTransEntity.setShipperName(shipperName);
        tmsTransEntity.setRecieverName(recieverName);
        tmsTransEntity.setRecieverId(recieverId);
        tmsTransEntity.setCarrierId(carrierId);
        tmsTransEntity.setCarrierName(carrierName);
        tmsTransEntity.setTruckCode(truckCode);
        tmsTransEntity.setDriverId(driverId);
        tmsTransEntity.setDriverName(driverName);
        tmsTransEntity.setDriverMobile(driverMobile);
        tmsTransEntity.setTransBPro(transBPro);
        tmsTransEntity.setTransBCity(transBCity);
        tmsTransEntity.setTransEArea(transEArea);
        tmsTransEntity.setTransBZip(transBZip);
        tmsTransEntity.setTransBAddr(transBAddr);
        tmsTransEntity.setTransBShipper(transBShipper);
        tmsTransEntity.setTransBShipperPhone(transBShipperPhone);
        tmsTransEntity.setTransEPro(transEPro);
        tmsTransEntity.setTransCustNo(transECity);
        tmsTransEntity.setTransEZip(transEZip);
        tmsTransEntity.setTransEAddr(transEAddr);
        tmsTransEntity.setId(id);
        tmsTransEntity.setuDelete(1);
        return tmsTransEntity;
    }

    /**
     * 获取运单明细信息
     * @param jsonObject
     * @return
     */
    public List<TmsTransDetailedEntity> getTmsTransDetailedEntity(JSONObject jsonObject, String id) {
        List<TmsTransDetailedEntity> list = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray("transDelit");
        for (int i=0; i<jsonArray.size(); i++) {
            TmsTransDetailedEntity tmsTransDetailedEntity = new TmsTransDetailedEntity();
            JSONObject detl = jsonArray.getJSONObject(i);
            String goodsId = (String) detl.get("goodsId");
            Double goodsVol = (Double) detl.get("goodsVol");
            Double goodsWeight = (Double) detl.get("goodsWeight");
            Double goodsNum = (Double) detl.get("goodsNum");
            Double goodsWeightfeeT = (Double) detl.get("goodsWeightfeeT");
            tmsTransDetailedEntity.setId(UUIDGenerator.getUUID());
            tmsTransDetailedEntity.setGoodsId(goodsId);
            tmsTransDetailedEntity.setGoodsVol(goodsVol);
            tmsTransDetailedEntity.setGoodsWeight(goodsWeight);
            tmsTransDetailedEntity.setGoodsNum(goodsNum);
            tmsTransDetailedEntity.setGoodsWeightfeeT(goodsWeightfeeT);
            tmsTransDetailedEntity.setTransId(id);
            tmsTransDetailedEntity.setuDelete(1);
            list.add(tmsTransDetailedEntity);
        }
        return list;
    }
}
