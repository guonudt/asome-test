package com.test.demo;

public class TagRecordServiceClient {

    private static CacheMap stringTagRecordDoMap = new CacheMap();

    static {
        stringTagRecordDoMap.put("tag1", "123_123");
        stringTagRecordDoMap.put("tag2", "456_456");
        stringTagRecordDoMap.put("tag3", "789_789");
        stringTagRecordDoMap.put("tag4", "889_889");
        stringTagRecordDoMap.put("tag5", "778_978");
        stringTagRecordDoMap.put("tag6", "678_978");
    }

    public CacheMap getTagRecordDo(String code){
        if (code == null) {
            return null;
        }
        String tagRecord  = stringTagRecordDoMap.get(code);
        if(tagRecord != null){
            CacheMap cacheMap = new CacheMap();
            cacheMap.put(code, tagRecord);
            return cacheMap;
        }
        return null;
    }
}
