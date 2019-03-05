package com.th.tms.repository;

import com.th.tms.entity.TmsTransDetailedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TmsTransDetailedRepository extends JpaRepository<TmsTransDetailedEntity,String> {

    List<TmsTransDetailedEntity> findByTransIdAndUDelete(String transId, Integer udelete);
}
