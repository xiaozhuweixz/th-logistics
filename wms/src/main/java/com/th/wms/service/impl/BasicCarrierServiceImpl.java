package com.th.wms.service.impl;



import com.th.wms.entity.BasicGoodsEntity;
import com.th.wms.repository.BasicCarrierRepository;
import com.th.wms.repository.impl.BasicCarrierRepositoryImpl;
import com.th.wms.service.BasicCarrierService;
import org.springframework.beans.factory.annotation.Autowired;

public class BasicCarrierServiceImpl implements BasicCarrierService {

    @Autowired
    private BasicCarrierRepository basicCarrierRepository;
    @Autowired
    private BasicCarrierRepositoryImpl basicCarrierRepositoryImpl;



    @Override
    public void save(BasicGoodsEntity basicCarrier) {
        basicCarrierRepository.save(basicCarrier);
    }
}
