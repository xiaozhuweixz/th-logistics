package com.th.tms.util;

import com.th.tms.entity.SystemStrdicItemEntity;
import com.th.tms.repository.SystemStrdicItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 字典类
 */
@Component
public class DicUtil {
    @Autowired
    private SystemStrdicItemRepository systemStrdicItemRepository;

    public Map<String,String> getDictStrId(String dictId, int udelete){
        Map<String,String> dictMap = new HashMap<>();
        List<SystemStrdicItemEntity> systemStrdicItemEntityList = systemStrdicItemRepository.findByDictIdAndUDelete(dictId,udelete);
        for (SystemStrdicItemEntity systemStrdicItemEntity: systemStrdicItemEntityList) {
            dictMap.put(systemStrdicItemEntity.getDictItemName(),systemStrdicItemEntity.getDictItemId());
        }
        return dictMap;
    }
    public Map<String,String> getDictStrName(String dictId, int udelete){
        Map<String,String> dictMap = new HashMap<>();
        List<SystemStrdicItemEntity> systemStrdicItemEntityList = systemStrdicItemRepository.findByDictIdAndUDelete(dictId,udelete);
        for (SystemStrdicItemEntity systemStrdicItemEntity: systemStrdicItemEntityList) {
            dictMap.put(systemStrdicItemEntity.getDictItemId(),systemStrdicItemEntity.getDictItemName());
        }
        return dictMap;
    }
}
