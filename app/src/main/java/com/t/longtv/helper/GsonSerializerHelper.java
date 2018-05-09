package com.t.longtv.helper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 作者：龙昊
 * 日期：2018/4/12 23:12
 * 描述：
 */

public class GsonSerializerHelper {

    private static class GsonSerializerHelperHolder {
        private static GsonSerializerHelper instance = new GsonSerializerHelper();
    }

    public static GsonSerializerHelper getInstance() {
        return GsonSerializerHelperHolder.instance;
    }

    private GsonSerializerHelper() {
        mGson = new GsonBuilder()
//                .excludeFieldsWithoutExposeAnnotation() //不导出实体中没有用@Expose注解的属性
                .enableComplexMapKeySerialization() //支持Map的key为复杂对象的形式
                .setDateFormat("yyyy-MM-dd HH:mm:ss") //时间转化为特定格式
                .setPrettyPrinting() //对json结果格式化.
//                .serializeNulls()
                .setVersion(1.0) //有的字段不是一开始就有的,会随着版本的升级添加进来,那么在进行序列化和反序列化的时候就会根据版本号来选择是否要序列化.
                //@Since(版本号)能完美地实现这个功能.还的字段可能,随着版本的升级而删除,那么
                //@Until(版本号)也能实现这个功能,GsonBuilder.setVersion(double)方法需要调用.
                .create();
    }

    private Gson mGson = null;

    /**
     * Serialize an object to Json.
     *
     * @param object to serialize.
     */
    public String serialize(Object object, Class clazz) {
        return mGson.toJson(object, clazz);
    }

    /**
     * Deserialize a json representation of an object.
     *
     * @param string A json string to deserialize.
     */
    public <T> T deserialize(String string, Class<T> clazz) {
        return mGson.fromJson(string, clazz);
    }

    public Gson getGson() {
        return mGson;
    }
}
