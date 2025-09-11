public class TagRecordServiceClient {

    private static CacheMap stringTagRecordDoMap = new CacheMap();

    public String getTagRecordDo(String code){
        String tagRecord  = stringTagRecordDoMap.get(code);
        if(tagRecord != null){
            return tagRecord;
        }
        if(tagRecord != null){
            // 本地缓存
            stringTagRecordDoMap.put(code, tagRecord);
            return tagRecord;
        }
        try{

                // 本地缓存
            stringTagRecordDoMap.put(code, code+"_"+System.currentTimeMillis());
            return stringTagRecordDoMap.get(code);
        }catch(Exception e){
            return null;
        }

    }
}
