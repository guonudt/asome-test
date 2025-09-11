package com.test.demo;

public class TagRecordServiceClient {

    private static CacheMap stringTagRecordDoMap = new CacheMap();

    public String getTagRecordDo(String code){
        CacheMap cacheMap = new CacheMap();
        String tagRecord  = cacheMap.get(code);
        if(tagRecord != null){
            return tagRecord;
        }else{
            tagRecord = code+"_"+System.currentTimeMillis();
            // 本地缓存
            stringTagRecordDoMap.put(code, tagRecord);
            return tagRecord;
        }
    }
}
