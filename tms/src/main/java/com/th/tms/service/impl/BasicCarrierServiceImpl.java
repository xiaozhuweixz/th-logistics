package com.th.tms.service.impl;


import com.th.tms.entity.BasicCarrierEntity;
import com.th.tms.repository.BasicCarrierRepository;
import com.th.tms.repository.impl.BasicCarrierRepositoryImpl;
import com.th.tms.service.BasicCarrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class BasicCarrierServiceImpl implements BasicCarrierService {

    @Autowired
    private BasicCarrierRepository basicCarrierRepository;
    @Autowired
    private BasicCarrierRepositoryImpl basicCarrierRepositoryImpl;

    /**
     * 所有承运商信息
     * @return
     */
    public List<BasicCarrierEntity> findAllBasicCarrier(){
        return basicCarrierRepository.findByUDelete(1);
    }

}
