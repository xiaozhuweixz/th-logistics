package com.th.tms.repository;

import com.th.tms.entity.TmsTransEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TmsTransRepository extends JpaRepository<TmsTransEntity, String> {

}
