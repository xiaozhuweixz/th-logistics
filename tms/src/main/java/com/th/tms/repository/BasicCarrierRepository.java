package com.th.tms.repository;


import com.th.tms.entity.BasicCarrierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BasicCarrierRepository extends JpaRepository <BasicCarrierEntity,String> {
    List<BasicCarrierEntity> findByUDelete(Integer uDelete);
}
