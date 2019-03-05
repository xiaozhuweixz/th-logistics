package com.th.tms.service.impl;


import com.th.tms.repository.BasicCarrierRepository;
import com.th.tms.repository.impl.BasicCarrierRepositoryImpl;
import com.th.tms.service.BasicCarrierService;
import org.springframework.beans.factory.annotation.Autowired;

public class BasicCarrierServiceImpl implements BasicCarrierService {

    @Autowired
    private BasicCarrierRepository basicCarrierRepository;
    @Autowired
    private BasicCarrierRepositoryImpl basicCarrierRepositoryImpl;


}
