package com.th.tms.controller;



import com.th.tms.entity.TmsTransEntity;
import com.th.tms.service.impl.TmsTransServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import net.sf.json.*;
@RestController
@RequestMapping("/tms")
public class TmsTransController {

    @Autowired
    private TmsTransServiceImpl tmsTransService;


    /**
     * 新增运单
     * @param jsonObject
     * @return
     */
    @RequestMapping(path = "/save_trans", method = RequestMethod.POST)
   public Map saveTrans(@RequestBody JSONObject jsonObject){
        Map<String, String> returnMap = tmsTransService.saveTrans(jsonObject);
       return returnMap;
    }

    /**
     * 删除运单--->通过id删除
     * @param id
     * @return
     */
    @RequestMapping(path = "/delete_by_id", method = RequestMethod.GET)
    public Map deleteById(@RequestParam String id){
        Map<String, String> returnMap = tmsTransService.deleteById(id);
        return null;
    }

    /**
     * 更新指定的一条运单数据
     * @param jsonObject
     * @return
     */
    @RequestMapping(path = "/find_by_up_id", method = RequestMethod.POST)
    public Map findByIdAndUpdataTrans(@RequestBody JSONObject jsonObject){
        Map<String,String> returnMap = tmsTransService.findByIdAndUpdataTrans(jsonObject);
        return returnMap;
    }

    /**
     *  查询一条运单数据
     * @param id
     * @return
     */
    @RequestMapping(path = "/find_by_id", method = RequestMethod.GET)
    public List<Map<String,Object>> findByIdATrans(@RequestParam String id){
        List<Map<String,Object>> mapList = tmsTransService.findByIdATrans(id);
        return mapList;
    }

    /**
     * 查询全部数据或者通过指定的条件查询数据,分页查询，默认从0开始，每页显示5条数据
     * @return
     */
    @RequestMapping(path = "/find_all", method = RequestMethod.POST)
    public Page<TmsTransEntity> findAllTransPage(@RequestParam(value="start",defaultValue="0")int start, @RequestParam(value = "size", defaultValue = "5") int size){
        Page<TmsTransEntity> tmsTransEntityPage = tmsTransService.findAllTransPage(start,size);
        return tmsTransEntityPage;
    }
}
