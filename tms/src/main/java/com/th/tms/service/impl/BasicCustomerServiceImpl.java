package com.th.tms.service.impl;

import com.th.tms.entity.BasicCustomerEntity;
import com.th.tms.repository.BasicCustomerRepository;
import com.th.tms.repository.impl.BasicCustomerRepositoryImpl;
import com.th.tms.service.BasicCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BasicCustomerServiceImpl implements BasicCustomerService {

    @Autowired
    private BasicCustomerRepository basicCustomerRepository;
    @Autowired
    private BasicCustomerRepositoryImpl basicCustomerRepositoryImpl;

    /**
     * 返回所有委托客户信息
     * @return
     */
    @Override
    public List<BasicCustomerEntity> findAllBasicCustomer() {
        return basicCustomerRepository.findByUDelete(1);
    }
}
