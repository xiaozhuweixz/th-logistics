package com.th.wms.repository;


import com.th.wms.entity.BasicGoodsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicCarrierRepository extends JpaRepository<BasicGoodsEntity,String> {

}
