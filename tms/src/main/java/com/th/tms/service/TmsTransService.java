package com.th.tms.service;



import com.th.tms.entity.TmsTransEntity;
import net.sf.json.JSONObject;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface TmsTransService {

    Map<String, String> saveTrans(JSONObject jsonObject);
    Map<String, String> deleteById(String id);
    Page<TmsTransEntity> findAllTransPage(int start, int size);
    List<Map<String, Object>> findByIdATrans(String id);
    Map<String,String> findByIdAndUpdataTrans(JSONObject jsonObject);

    Map<String,String> getOrderDtl(MultipartFile file[], String path, String signId);
}
