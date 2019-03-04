package com.th.tms.controller;



import com.th.tms.service.impl.TmsTransServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/tms")
public class TmsTransController {

    @Autowired
    private TmsTransServiceImpl tmsTransService;


    /**
     * 新增运单
     * @param jsonpObject
     * @return
     */
    @RequestMapping(path = "/save_trans", method = RequestMethod.POST)
   public Map saveTrans(@RequestBody net.sf.json.JSONObject jsonpObject){

        System.out.println("jsonpObject:" + jsonpObject.toString());
       return null;
    }

    /**
     * 删除运单--->通过id删除
     * @param id
     * @return
     */
    @RequestMapping(path = "/delete_by_id", method = RequestMethod.GET)
    public Map deleteById(@RequestParam String id){
        System.out.println("id"+ id);
        return null;
    }

    /**
     * 更新指定的一条运单数据
     * @param id
     * @return
     */
    @RequestMapping(path = "/find_by_id", method = RequestMethod.GET)
    public Map findByIdAndUpdataTrans(@RequestParam String id){
        System.out.println("id:" + id);
        return null;
    }

    /**
     * 查询全部数据或者通过指定的条件查询数据
     * @return
     */
    @RequestMapping(path = "/find_all", method = RequestMethod.POST)
    public Map findAllTrans(){


        return null;
    }
}
