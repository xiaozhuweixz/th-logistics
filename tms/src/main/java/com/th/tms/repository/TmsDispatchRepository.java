package com.th.tms.repository;

import com.th.tms.entity.TmsDispatchEntity;
import com.th.tms.entity.TmsTransDispatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TmsDispatchRepository extends JpaRepository<TmsDispatchEntity, String> {
}
