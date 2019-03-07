package com.th.tms.service.impl;

import com.th.tms.entity.BasicCityEntity;
import com.th.tms.repository.BasicCityRepository;
import com.th.tms.repository.impl.BasicCityRepositoryImpl;
import com.th.tms.service.BasicCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BasicCityServiceImpl implements BasicCityService {

    @Autowired
    private BasicCityRepository basicCityRepository;
    @Autowired
    private BasicCityRepositoryImpl basicCityRepositoryImpl;

    /**
     * 所有城市信息
     * @return
     */
    public List<BasicCityEntity> findAllBasicCity(){
        return basicCityRepository.findByUDelete(1);
    }
}
