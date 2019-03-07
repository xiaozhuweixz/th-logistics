package com.th.tms.service.impl;
import com.th.tms.entity.*;
import com.th.tms.repository.TmsDispatchRepository;
import com.th.tms.repository.TmsSignRepository;
import com.th.tms.repository.TmsTransDispatchRepository;
import com.th.tms.repository.TmsTransRepository;
import com.th.tms.repository.impl.TmsSignRepositoryImpl;
import com.th.tms.service.TmsSignService;
import com.th.tms.util.BaseUtil;
import com.th.tms.util.MathUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TmsSignServiceImpl implements TmsSignService {

    @Autowired
    private TmsSignRepository tmsSignRepository;
    @Autowired
    private TmsSignRepositoryImpl tmsSignRepositoryImpl;
    @Autowired
    private TmsTransRepository tmsTransRepository;
    @Autowired
    private TmsDispatchRepository tmsDispatchRepository;
    @Autowired
    private TmsTransDispatchRepository tmsTransDispatchRepository;
    /**
     * 全部签收和部分签收及拒签
     *
     * @param jsonObject
     * @return 返回签收结果
     */
    @Override
    public Map<String, String> saveSign(JSONObject jsonObject) {
        Map<String, String> returnMap = new HashMap<>();
        returnMap.put("suc", "执行成功");
        int count = 0;
        Double signNum = 0.0;
        Double rejectNum = 0.0;
        JSONObject master_list = jsonObject.getJSONObject("master_list");  //主单信息
        JSONArray detl_list = jsonObject.getJSONArray("detl_list");  //明细信息
        BaseUtil.Base_CheckHasValue("主单信息", master_list);
        List<TmsSignDetailedEntity> tmsSignDetailedEntities = new ArrayList<>();
        try {
            TmsSignEntity tmsSignEntity  = (TmsSignEntity) JSONObject.toBean(master_list, TmsSignEntity.class);
            TmsTransEntity tmsTransEntity = tmsTransRepository.findOne(master_list.getString("transId"));//运单信息
            List<TmsTransDispatchEntity> tmsTransDispatchEntities = tmsTransDispatchRepository.findByTransIdAndUDelete(tmsTransEntity.getId(),1);//查出运单下所挂的调度信息
            List<TmsTransDispatchEntity> tmsTransDispatchEntityList =  tmsTransDispatchRepository.findByDispatchIdAndUDelete(tmsTransDispatchEntities.get(0).getDispatchId(),1);//查出调度下面所有的运单信息
            TmsDispatchEntity tmsDispatchEntity = tmsDispatchRepository.findOne(tmsTransDispatchEntityList.get(0).getDispatchId());
            tmsTransEntity.setTransState("SIGNTRANS");
            for (TmsTransDispatchEntity dispatchEntity: tmsTransDispatchEntityList) {   //循环运单信息
                //由于一个调度单下面可能挂多个运单，如果这个调度下面的运单没有全部签收完，就显示为部分签收
                TmsTransEntity tmsTransEntityNew = tmsTransRepository.findOne(dispatchEntity.getTransId());
                if (tmsTransEntityNew.getTransState().equals("SIGNTRANS")) {
                    count ++;
                }
            }
            if (MathUtil.sub(count,tmsTransDispatchEntityList.size()) == 0) {   // 如果运单的签收数量等于中间表的总数，证明已经全部签收完，直接把调度的状态改成已签收

                tmsDispatchEntity.setDispatchState("SIGNTRANS");
            }else {
                tmsDispatchEntity.setDispatchState("部分签收");
            }
            for(int i=0; i<detl_list.size(); i++){
                JSONObject detlJsonObject = detl_list.getJSONObject(i);
                TmsSignDetailedEntity tmsSignDetailedEntity = (TmsSignDetailedEntity) JSONObject.toBean(detlJsonObject,TmsSignDetailedEntity.class);
                signNum += tmsSignDetailedEntity.getSignNum();          //签收数量
                rejectNum += tmsSignDetailedEntity.getRefuseSignNum();  //拒签数量
                tmsSignDetailedEntities.add(tmsSignDetailedEntity);
            }
            tmsSignEntity.setSignNum(MathUtil.sub(signNum, rejectNum));
            tmsSignEntity.setRefuseSignNum(rejectNum);
            tmsSignRepository.save(tmsSignEntity);
            tmsDispatchRepository.save(tmsDispatchEntity);
            tmsTransRepository.save(tmsTransEntity);
        } catch (Exception e) {
            returnMap.put("error", "单据有问题请检查单据/" + e);
            return returnMap;
        }
        return returnMap;
    }
}
