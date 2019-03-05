package com.th.tms.repository;

import com.th.tms.entity.TmsTransEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TmsTransRepository extends JpaRepository<TmsTransEntity, String> {

        List<TmsTransEntity> findByIdAndUDelete(String id, Integer udelete);
}
