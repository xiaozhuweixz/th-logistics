package com.th.tms.controller;


import com.th.tms.service.impl.TmsDispatchServiceImpl;
import com.th.tms.service.impl.TmsTransDispatchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/tms")
public class TmsTransDispatchController {

    @Autowired
    TmsDispatchServiceImpl tmsDispatchService;
    /**
     * 调度运单
     * @param id   运单id
     * @return
     */
    @RequestMapping(path = "/save_trans_dispatch", method = RequestMethod.POST)
    public Map saveTransDispatch(@RequestParam String id){
        Map<String, String> returnMap = tmsDispatchService.saveTransDispatch(id);
        return returnMap;
    }

    /**
     * 调度单发车
     * @param id   调度单id
     * @return
     */
    @RequestMapping(path = "/save_trans_depart", method = RequestMethod.POST)
    public Map saveTransDepart(@RequestParam String id, @RequestParam String departDate){
        Map<String, String> returnMap = tmsDispatchService.saveTransDepart(id,departDate);
        return returnMap;
    }

}
