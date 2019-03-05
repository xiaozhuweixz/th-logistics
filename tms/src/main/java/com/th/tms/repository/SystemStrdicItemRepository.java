package com.th.tms.repository;

import com.th.tms.entity.SystemStrdicItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SystemStrdicItemRepository extends JpaRepository<SystemStrdicItemEntity, String> {

    List<SystemStrdicItemEntity> findByDictIdAndUDelete(String DictId, Integer udelete);
}
