package com.th.tms.service.impl;


import com.th.tms.entity.*;
import com.th.tms.repository.*;
import com.th.tms.service.TmsDispatchService;
import com.th.tms.util.BaseUtil;
import com.th.tms.util.DateUtil;
import com.th.tms.util.DicUtil;
import com.th.tms.util.UUIDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TmsDispatchServiceImpl implements TmsDispatchService {

    @Autowired
    TmsTransRepository tmsTransRepository;
    @Autowired
    DicUtil dicUtil;
    @Autowired
    TmsTransDispatchRepository tmsTransDispatchRepository;
    @Autowired
    TmsDispatchRepository tmsDispatchRepository;
    @Autowired
    TmsTransDetailedRepository tmsTransDetailedRepository;
    @Autowired
    TmsSignRepository tmsSignRepository;
    @Autowired
    TmsSignDetailedRepository tmsSignDetailedRepository;
    /**
     * 调度同时查询调度单信息
     * @param id
     * @return
     */
    @Override
    @Transactional
    public Map<String, String> saveTransDispatch(String id) {
        Map<String, String> returnMap = new HashMap<>();
        String dispathchId = UUIDGenerator.getUUID();
        returnMap.put("suc","运单保存成功。");
        BaseUtil.Base_CheckHasValue("运单id",id);
        Map<String,String> dicMap  = dicUtil.getDictStrName("TG_STATE",1);
        TmsTransEntity tmsTransEntity = tmsTransRepository.findOne(id);
        //System.out.println("dicMap:" + dicMap.get(tmsTransEntity.getTransState()));
        if (!dicMap.get(tmsTransEntity.getTransState()).equals("计划(未调度)")) {  //如果运单状态不等于计划未调度
            returnMap.put("error","单据状态不在--->计划(未调度)。");
            return returnMap;
        }
        TmsDispatchEntity tmsDispatchEntity = new TmsDispatchEntity();
        TmsTransDispatchEntity tmsTransDispatchEntity = new TmsTransDispatchEntity();
        tmsDispatchEntity.setId(dispathchId);
        tmsDispatchEntity.setDispatchNo(UUIDGenerator.getUUID());
        tmsDispatchEntity.setDispatchMan("管理员");
        tmsDispatchEntity.setDispatchState("MANAGE");
        tmsDispatchEntity.setSourceSystem("TMS");
        tmsDispatchEntity.setDriverId(UUIDGenerator.getUUID());
        tmsDispatchEntity.setTruckCode(tmsTransEntity.getTruckCode());

        tmsTransEntity.setTransState("MANAGE");

        tmsTransDispatchEntity.setId(UUIDGenerator.getUUID());
        tmsTransDispatchEntity.setTransId(tmsTransEntity.getId());
        tmsTransDispatchEntity.setDispatchId(dispathchId);
        tmsTransDispatchEntity.setuDelete(1);
        tmsTransDispatchRepository.save(tmsTransDispatchEntity);
        tmsTransRepository.save(tmsTransEntity);
        tmsDispatchRepository.save(tmsDispatchEntity);
        return returnMap;
    }


    /**
     * 发车 ------------>修改运单调度单状态和增加发车时间
     * @param id,departDate
     * @return
     */
    @Override
    @Transactional
    public Map<String, String> saveTransDepart(String id, String departDate) {
        Map<String, String> returnMap = new HashMap<>();
        TmsSignEntity tmsSignEntity = new TmsSignEntity();

        List<TmsSignDetailedEntity> tmsSignDetailedEntities = new ArrayList<>();
        returnMap.put("suc","运单保存成功。");
        BaseUtil.Base_CheckHasValue("调度单ID:", id);
        BaseUtil.Base_CheckHasValue("发车时间", departDate);
        List<TmsTransEntity> tmsTransEntities = new ArrayList<>();
        Map<String,String> dicMap = dicUtil.getDictStrName("TP_STATE",1);
        TmsDispatchEntity tmsDispatchEntity = tmsDispatchRepository.findOne(id);
        System.out.println("dicMap.get(tmsDispatchEntity.getDispatchState()):" + tmsDispatchEntity.getDispatchState());
        if (!dicMap.get(tmsDispatchEntity.getDispatchState()).equals("已调度")) {  //如果运单状态不等于计划未调度
            returnMap.put("error","单据状态不在--->已调度。");
            return returnMap;
        }
        List<TmsTransDispatchEntity> tmsTransDispatchEntityList = tmsTransDispatchRepository.findByDispatchIdAndUDelete(id,1); //查询运单和调度单中间表
        BaseUtil.Base_CheckHasValue("调度单运单中间表数据",tmsTransDispatchEntityList);
        for (int i=0; i<tmsTransDispatchEntityList.size(); i++) {
            TmsTransDispatchEntity tmsTransDispatchEntity = tmsTransDispatchEntityList.get(i);
            TmsTransEntity tmsTransEntity = tmsTransRepository.findOne(tmsTransDispatchEntity.getTransId());  //调度数据
            tmsTransEntity.setTransState("NOWTRANS");
            tmsTransEntity.setTransDepartExp(DateUtil.parseDateTime(departDate));
            tmsTransEntities.add(tmsTransEntity);
        }
        for (TmsTransEntity tmsTransEntity:tmsTransEntities) {
            String singId = UUIDGenerator.getUUID();
            tmsSignEntity.setId(singId);
            tmsSignEntity.setTransId(tmsTransEntity.getId());
            tmsSignEntity.setState("NOWTRANS");
            tmsSignEntity.setSignVol(tmsTransEntity.getTransVol());
            tmsSignEntity.setSignNum(tmsTransEntity.getTransNum());
            tmsSignEntity.setSignWeight(tmsTransEntity.getTransWeight());
            tmsSignEntity.setSignWeightfeeT(tmsTransEntity.getTransWeightfeeT());
            tmsSignEntity.setuDelete(1);
            List<TmsTransDetailedEntity> tmsTransDetailedEntities = tmsTransDetailedRepository.findByTransIdAndUDelete(tmsTransEntity.getId(),1);
            for (TmsTransDetailedEntity tmsTransDetailedEntity : tmsTransDetailedEntities) {
                TmsSignDetailedEntity tmsSignDetailedEntity = new TmsSignDetailedEntity();
                tmsSignDetailedEntity.setId(UUIDGenerator.getUUID());
                tmsSignDetailedEntity.setSignId(singId);
                tmsSignDetailedEntity.setGoodsId(tmsTransDetailedEntity.getGoodsId());
                tmsSignDetailedEntity.setGoodsName(tmsTransDetailedEntity.getGoodsName());
                tmsSignDetailedEntity.setSignNum(tmsTransDetailedEntity.getGoodsNum());
                tmsSignDetailedEntity.setSignVol(tmsTransDetailedEntity.getGoodsVol());
                tmsSignDetailedEntity.setSignWeight(tmsTransDetailedEntity.getGoodsWeight());
                tmsSignDetailedEntity.setSignWeightfeeT(tmsTransDetailedEntity.getGoodsWeightfeeT());
                tmsSignDetailedEntity.setRefuseSignNum(0.00);
                tmsSignDetailedEntity.setuDelete(1);
                tmsSignDetailedEntities.add(tmsSignDetailedEntity);
            }
        }

        tmsDispatchEntity.setDispatchState("NOWTRANS");
        tmsDispatchRepository.save(tmsDispatchEntity);
        tmsTransRepository.save(tmsTransEntities);
        tmsSignRepository.save(tmsSignEntity);
        tmsSignDetailedRepository.save(tmsSignDetailedEntities);
        return returnMap;
    }
}
