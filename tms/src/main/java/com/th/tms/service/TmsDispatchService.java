package com.th.tms.service;

import java.util.Map;

public interface TmsDispatchService {
    Map<String,String>saveTransDispatch(String id);
    Map<String,String>saveTransDepart(String id,String departDate);
}
