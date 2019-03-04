package com.th.tms.service.impl;

import com.th.tms.repository.TmsTransRepository;
import com.th.tms.repository.impl.TmsTransRepositoryImpl;
import com.th.tms.service.TmsTransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TmsTransServiceImpl implements TmsTransService {

    @Autowired
    TmsTransRepository tmsTransRepository;
    @Autowired
    TmsTransRepositoryImpl tmsTransRepositoryImpl;

}
