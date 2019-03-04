package com.th.oms.service.impl;


import com.th.oms.entity.BasicCarrierEntity;
import com.th.oms.repository.BasicCarrierRepository;
import com.th.oms.repository.impl.BasicCarrierRepositoryImpl;
import com.th.oms.service.BasicCarrierService;
import org.springframework.beans.factory.annotation.Autowired;

public class BasicCarrierServiceImpl implements BasicCarrierService {

    @Autowired
    private BasicCarrierRepository basicCarrierRepository;
    @Autowired
    private BasicCarrierRepositoryImpl basicCarrierRepositoryImpl;



    @Override
    public void save(BasicCarrierEntity basicCarrier) {
        basicCarrierRepository.save(basicCarrier);
    }
}
