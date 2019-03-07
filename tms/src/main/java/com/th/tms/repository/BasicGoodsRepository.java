package com.th.tms.repository;

import com.th.tms.entity.BasicGoodsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BasicGoodsRepository extends JpaRepository<BasicGoodsEntity, String> {

    List<BasicGoodsEntity> findByUDelete(Integer uDelete);
}
