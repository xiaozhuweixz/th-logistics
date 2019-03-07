package com.th.tms.service;

import com.th.tms.entity.BasicCustomerEntity;

import java.util.List;

public interface BasicCustomerService {
    List<BasicCustomerEntity> findAllBasicCustomer();
}
