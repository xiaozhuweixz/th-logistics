package com.th.wms.repository.impl;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class BasicCarrierRepositoryImpl {

    @PersistenceContext
    EntityManager entityManager;

    public void Test(){
        entityManager.createNativeQuery("");
    }
}
