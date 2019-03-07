package com.th.tms.controller;



import com.th.tms.entity.*;
import com.th.tms.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import net.sf.json.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * 运单管理
 */
@RestController
@RequestMapping("/tms")
public class TmsTransController {

    @Autowired
    private TmsTransServiceImpl tmsTransService;

    @Autowired
    BasicCarrierServiceImpl basicCarrierServiceImpl;
    @Autowired
    BasicCityServiceImpl basicCityServiceImpl;
    @Autowired
    BasicCustomerServiceImpl basicCustomerServiceImpl;
    @Autowired
    BasicTruckServiceImpl basicTruckServiceImpl;
    @Autowired
    BasicGoodsServiceImpl basicGoodsServiceImpl;
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
        return returnMap;
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

    /**
     * 返回所有的承运商信息
     * @return
     */
    @RequestMapping(path = "/find_all_basic_carrier", method = RequestMethod.POST)
    public List<BasicCarrierEntity> findAllBasicCarrier(){
        return basicCarrierServiceImpl.findAllBasicCarrier();
    }

    /**
     * 返回所有的城市信息
     * @return
     */
    @RequestMapping(path = "/find_all_basic_city", method = RequestMethod.POST)
    public List<BasicCityEntity> findAllBasicCity(){
        return basicCityServiceImpl.findAllBasicCity();
    }


    /**
     * 返回所有委托客户信息
     * @return
     */
    @RequestMapping(path = "/find_all_basic_cust", method = RequestMethod.POST)
    public List<BasicCustomerEntity> findAllBasicCustomer(){
        return basicCustomerServiceImpl.findAllBasicCustomer();
    }

    /**
     * 返回所有车辆信息
     * @return
     */
    @RequestMapping(path = "/find_all_basic_truck", method = RequestMethod.POST)
    public List<BasicTruckEntity> findAllBasicTruck(){
       return basicTruckServiceImpl.findAllBasicTruck();
    }

    /**
     * 返回所有的物料信息
     * @return
     */
    @RequestMapping(path = "/find_all_basic_goods", method = RequestMethod.POST)
    public List<BasicGoodsEntity> findAllBasicGoods(){
        return basicGoodsServiceImpl.findAllBasicGoods();
    }


    @ResponseBody
    @RequestMapping(value = "/back_pic_upload", method = RequestMethod.POST)
    public Map<String,String> getOrderDtl(@RequestParam(value = "files") MultipartFile files[], HttpServletRequest request, @RequestParam String signId){

        //String path = request.getSession().getServletContext().getRealPath("/") + "/upload";
        String path = "/Users/caixiaowei/Desktop";

        return tmsTransService.getOrderDtl(files,path,signId);

    }

}
