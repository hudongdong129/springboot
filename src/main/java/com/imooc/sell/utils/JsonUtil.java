package com.imooc.sell.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtil {


    /**
     * @Author: hudongdong
     * @Description:将对象转换成json格式
     * @Date:14:21 2018/5/12
     */
    public  static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
