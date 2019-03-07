package com.th.tms.repository;


import com.th.tms.entity.BasicTruckEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BasicTruckRepository extends JpaRepository<BasicTruckEntity, String> {
    List<BasicTruckEntity> findByUDelete(Integer uDelete);
}
