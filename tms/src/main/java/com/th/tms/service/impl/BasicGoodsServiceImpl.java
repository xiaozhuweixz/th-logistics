package com.th.tms.service.impl;

import com.th.tms.entity.BasicGoodsEntity;
import com.th.tms.repository.BasicGoodsRepository;
import com.th.tms.repository.impl.BasicGoodsRepositoryImpl;
import com.th.tms.service.BasicGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BasicGoodsServiceImpl implements BasicGoodsService {
    @Autowired
    private BasicGoodsRepository basicGoodsRepository;
    @Autowired
    private BasicGoodsRepositoryImpl basicGoodsRepositoryImpl;

    @Override
    public List<BasicGoodsEntity> findAllBasicGoods() {
        return basicGoodsRepository.findByUDelete(1);
    }
}
