package com.th.tms.controller;

import com.th.tms.service.impl.TmsSignServiceImpl;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 签收管理
 */
@RestController
@RequestMapping("/tms")
public class TmsSignController {
    @Autowired
    TmsSignServiceImpl tmsSignServiceImpl;



    /**
     * 签收
     * @return   返回签收结果
     */
    @RequestMapping("/saveSign")
    @ResponseBody
    public Map<String,String>  saveSign(@RequestBody JSONObject jsonObject){
        Map<String,String> returnMap = tmsSignServiceImpl.saveSign(jsonObject);
        return returnMap;
    }



}
