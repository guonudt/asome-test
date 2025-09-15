package com.test.demo;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CacheMapBuilder {

    // 使用不可变Map提高安全性
    private static final Map<String, String> TAG_RECORD_MAP;

    static {
        Map<String, String> tempMap = new ConcurrentHashMap<>();
        tempMap.put("tag1", "123_123");
        tempMap.put("tag2", "456_456");
        tempMap.put("tag3", "789_789");
        tempMap.put("tag4", "889_889");
        tempMap.put("tag5", "778_978");
        tempMap.put("tag6", "678_978");
        TAG_RECORD_MAP = Collections.unmodifiableMap(tempMap);
    }

    public CacheMap buildCacheMap(List<String> codes){
        if (codes == null || codes.isEmpty()) {
            return null;
        }
        CacheMap cacheMap = new CacheMap();
        for (String code : codes) {
            String tagRecord  = TAG_RECORD_MAP.get(code);
            if(tagRecord != null){
                cacheMap.put(code, tagRecord);
            }
        }
        return cacheMap;
    }
}
