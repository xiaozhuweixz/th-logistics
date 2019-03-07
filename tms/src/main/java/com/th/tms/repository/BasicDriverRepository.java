package com.th.tms.repository;

import com.th.tms.entity.BasicDriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BasicDriverRepository extends JpaRepository<BasicDriverEntity, String> {

    List<BasicDriverEntity> findByUDelete(Integer uDelete);
}
