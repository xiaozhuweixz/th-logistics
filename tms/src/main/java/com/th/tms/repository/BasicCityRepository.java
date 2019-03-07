package com.th.tms.repository;

import com.th.tms.entity.BasicCityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BasicCityRepository extends JpaRepository<BasicCityEntity, String> {


    List<BasicCityEntity> findByUDelete(Integer uDelete);
}
