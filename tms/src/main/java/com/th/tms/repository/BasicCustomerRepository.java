package com.th.tms.repository;

import com.th.tms.entity.BasicCustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BasicCustomerRepository extends JpaRepository<BasicCustomerEntity,String> {
    List<BasicCustomerEntity> findByUDelete(Integer uDelete);
}
