package com.th.tms.repository;

import com.th.tms.entity.TmsTransDispatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TmsTransDispatchRepository extends JpaRepository<TmsTransDispatchEntity, String> {

    List<TmsTransDispatchEntity> findByTransIdAndUDelete(String transId, Integer udelete);
    List<TmsTransDispatchEntity> findByDispatchIdAndUDelete(String dispatchId, Integer udelete);
}
