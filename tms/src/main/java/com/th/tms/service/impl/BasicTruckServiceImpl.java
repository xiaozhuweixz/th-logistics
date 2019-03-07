package com.th.tms.service.impl;

import com.th.tms.entity.BasicTruckEntity;
import com.th.tms.repository.BasicTruckRepository;
import com.th.tms.repository.impl.BasicTruckRepositoryImpl;
import com.th.tms.service.BasicTruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BasicTruckServiceImpl implements BasicTruckService {

    @Autowired
    private BasicTruckRepository basicTruckRepository;
    @Autowired
    private BasicTruckRepositoryImpl basicTruckRepositoryImpl;

    /**
     * 获取所有车辆信息
     * @return
     */
    @Override
    public List<BasicTruckEntity> findAllBasicTruck() {
        return basicTruckRepository.findByUDelete(1);
    }
}
