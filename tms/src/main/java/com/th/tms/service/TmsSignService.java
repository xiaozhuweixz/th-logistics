package com.th.tms.service;

import net.sf.json.JSONObject;

import java.util.Map;

public interface TmsSignService {

    Map<String,String> saveSign(JSONObject jsonObject);
}
