package com.th.tms.service.impl;

import com.th.tms.entity.TmsSignEntity;
import com.th.tms.entity.TmsTransDetailedEntity;
import com.th.tms.entity.TmsTransEntity;
import com.th.tms.repository.TmsSignRepository;
import com.th.tms.repository.TmsTransDetailedRepository;
import com.th.tms.repository.TmsTransRepository;
import com.th.tms.repository.impl.TmsTransRepositoryImpl;
import com.th.tms.service.TmsTransService;
import com.th.tms.util.BaseUtil;
import com.th.tms.util.DateUtil;
import com.th.tms.util.UUIDGenerator;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.*;
@Component
public class TmsTransServiceImpl implements TmsTransService {

    @Autowired
    TmsTransRepository tmsTransRepository;
    @Autowired
    TmsTransRepositoryImpl tmsTransRepositoryImpl;
    @Autowired
    TmsTransDetailedRepository tmsTransDetailedRepository;
    @Autowired
    TmsSignRepository tmsSignRepository;

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
     * 回单上传
     * @param files,path
     * @param path
     * @return
     */
    @Override
    public Map<String, String> getOrderDtl(MultipartFile[] files, String path, String signId) {
        Map<String,String> returnMap = new HashMap<>();
        returnMap.put("suc","回单上传成功。");
        String sqlPath = "";
        File uploadDirectory = new File(path);
        if (uploadDirectory.exists()) {
            if (!uploadDirectory.isDirectory()) {
                uploadDirectory.delete();
            }
        } else {
            uploadDirectory.mkdir();
        }
        //这里可以支持多文件上传
        if (files != null && files.length >= 1) {
            BufferedOutputStream bw = null;
            try {
                for (MultipartFile file : files) {
                    String fileName = file.getOriginalFilename();
                    //判断是否有文件且是否为图片文件
                    if(fileName!=null && !"".equalsIgnoreCase(fileName.trim()) && com.th.tms.util.FileUtils.isImageFile(fileName)) {
                        String newPath = path + "/" + DateUtil.getLoctTimeToStr() + com.th.tms.util.FileUtils.getFileType(fileName);
                        System.out.println("newPath:" + newPath);
                        //创建输出文件对象
                        File outFile = new File(newPath);
                        //拷贝文件到输出文件对象
                        FileUtils.copyInputStreamToFile(file.getInputStream(), outFile);
                        sqlPath += newPath + ";";
                    }
                }
                sqlPath = sqlPath.substring(0,sqlPath.length() - 1);
                TmsSignEntity tmsSignEntity = tmsSignRepository.findOne(signId);
                TmsTransEntity tmsTransEntity = tmsTransRepository.findOne(tmsSignEntity.getTransId());
                tmsSignEntity.setTransPhotoPath(sqlPath);
                tmsTransEntity.setTransPhotoPath(sqlPath);
                tmsTransEntity.setTransState("回单已上传");
                tmsSignEntity.setState("回单已上传");
                tmsSignRepository.save(tmsSignEntity);
                tmsTransRepository.save(tmsTransEntity);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bw != null) {
                        bw.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
