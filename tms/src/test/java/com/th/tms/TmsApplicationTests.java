package com.th.tms;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.th.tms.entity.TmsTransDetailedEntity;
import com.th.tms.entity.TmsTransEntity;
import com.th.tms.repository.TmsTransDetailedRepository;
import com.th.tms.repository.TmsTransRepository;
import com.th.tms.service.impl.TmsTransServiceImpl;
import com.th.tms.util.UUIDGenerator;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TmsApplication.class})
public class TmsApplicationTests {

	@Autowired
	private TmsTransServiceImpl tmsTransService;
	@Autowired
	private TmsTransDetailedRepository tmsTransDetailedRepository;
	@Autowired
	TmsTransRepository tmsTransRepository;
	@Test
	public void contextLoads() {
		Random random = new Random();
		JSONObject returnJsonObect = new JSONObject();
		JSONObject jsonObjectTrans = new JSONObject();
		JSONArray jsonArray = new JSONArray();
//
//		jsonObjectTrans.put("transCustNo","test00001");
//		jsonObjectTrans.put("transWaybillNo","test00001");
//		jsonObjectTrans.put("transState","未审核");
//		jsonObjectTrans.put("transType","陆运");
//		jsonObjectTrans.put("custId", UUIDGenerator.getUUID());
//		jsonObjectTrans.put("custName","牡丹江");
//		jsonObjectTrans.put("shipperId",UUIDGenerator.getUUID());
//		jsonObjectTrans.put("shipperName","牡丹江货主");
//		jsonObjectTrans.put("recieverId",UUIDGenerator.getUUID());
//		jsonObjectTrans.put("recieverName","牡丹江收货人");
//		jsonObjectTrans.put("carrierId",UUIDGenerator.getUUID());
//		jsonObjectTrans.put("carrierName","牡丹江司机");
//		jsonObjectTrans.put("truckCode","鄂A88888");
//		jsonObjectTrans.put("driverId",UUIDGenerator.getUUID());
//		jsonObjectTrans.put("driverName","牡丹江司机");
//		jsonObjectTrans.put("driverMobile","138899999");
//		jsonObjectTrans.put("transBPro","test00001");
//		jsonObjectTrans.put("transBCity","test00001");
//		jsonObjectTrans.put("transEArea","test00001");
//		jsonObjectTrans.put("transBZip","test00001");
//		jsonObjectTrans.put("transBAddr","test00001");
//		jsonObjectTrans.put("transBShipper","test00001");
//		jsonObjectTrans.put("transBShipperPhone","test00001");
//		jsonObjectTrans.put("transEPro","test00001");
//		jsonObjectTrans.put("transECity","test00001");
//		jsonObjectTrans.put("transEZip","test00001");
//		jsonObjectTrans.put("transEAddr","test00001");
//		jsonObjectTrans.put("transVol",random.nextDouble() * 100);
//		jsonObjectTrans.put("transWeight",random.nextDouble() * 50);
//		jsonObjectTrans.put("transWeightfee",random.nextDouble() * 10);
//		jsonObjectTrans.put("transNum", random.nextDouble() * 90);
//
//		for (int i=0; i<10; i++) {
//			JSONObject jsonObjectTransDeilt= new JSONObject();
//			Random rand = new Random();
//			jsonObjectTransDeilt.put("goodsId",UUIDGenerator.getUUID());
//			jsonObjectTransDeilt.put("goodsVol",i+rand.nextDouble() * 5);
//			jsonObjectTransDeilt.put("goodsWeight",i+rand.nextDouble() * 5);
//			jsonObjectTransDeilt.put("goodsNum",i+rand.nextDouble() * 5);
//			jsonObjectTransDeilt.put("goodsWeightfeeT",i+rand.nextDouble() * 5);
//			jsonArray.add(jsonObjectTransDeilt);
//		}
//
//		returnJsonObect.put("trans",jsonObjectTrans);
//		returnJsonObect.put("transDteil",jsonArray);
//		System.out.println("jsonObjectTrans :" + returnJsonObect.toString());

		TmsTransEntity tmsTransEntity = tmsTransRepository.findOne("c94e78cd42614bf0bf0765a279eb87c8");
		tmsTransEntity.setuDelete(1);
		List<TmsTransDetailedEntity> tmsTransDetailedEntities =  tmsTransDetailedRepository.findByTransIdAndUDelete(tmsTransEntity.getId(),0);
		for (TmsTransDetailedEntity tmsTransDetailedEntity:tmsTransDetailedEntities) {
			tmsTransDetailedEntity.setuDelete(1);
		}
		returnJsonObect.put("trans",JSONObject.fromObject(tmsTransEntity));
		returnJsonObect.put("transDtel",JSONArray.fromObject(tmsTransDetailedEntities));
		tmsTransService.findByIdAndUpdataTrans(returnJsonObect);
	}


	@Test
	public void deleteByIdTest(){
		String id = "c94e78cd42614bf0bf0765a279eb87c8";
		tmsTransService.deleteById(id);
	}

	@Test
	public void getAllTransDteli(){

		//PageHelper.startPage(1,5);
		//List<TmsTransDetailedEntity> tmsTransDetailedEntities = tmsTransDetailedRepository.findAll();
		Sort sort = new Sort(Sort.Direction.ASC,"uTime"); //设置根据uTime倒序排列
		Pageable pageable = new PageRequest(1,5,sort);
		Page<TmsTransDetailedEntity> page = tmsTransDetailedRepository.findAll(pageable);    //根据这个分页对象获取分页对象

		System.out.println(page.getNumber());  //当前页start
		System.out.println(page.getNumberOfElements());  //当前页start
		System.out.println(page.getSize());   //每页数量size
		System.out.println(page.getTotalElements());  //总数量
		System.out.println(page.getTotalPages());    //总页数
		System.out.println(page.getContent().toString());
		//PageInfo<TmsTransDetailedEntity> pageInfo = new PageInfo<>(tmsTransDetailedEntities);
		//System.out.println("pageInfo:" + pageInfo.toString());

	}


}
