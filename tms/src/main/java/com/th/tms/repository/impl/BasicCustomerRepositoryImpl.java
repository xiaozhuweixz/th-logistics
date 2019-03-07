package com.th.tms.repository.impl;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class BasicCustomerRepositoryImpl {


    @PersistenceContext
    private EntityManager entityManager;
}
