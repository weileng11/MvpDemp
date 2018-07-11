package com.losileeya.mvpdemp.okgo.utils;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.DateTypeAdapter;

import java.util.Date;

/**
 * @name thinkine
 * @class com.losileeya.mvpdemp.okgo.utils
 * @class describe
 * @anthor ${bruce} QQ:275762645
 * @time 2018/7/11
 * @change
 * @chang time
 * @class describe
 */
public class JsonConvertor {
    private static Gson gson = null;

    private JsonConvertor() {
    }

    public static Gson getInstance() {
        if (gson == null) {
            gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .registerTypeAdapter(Date.class, new DateTypeAdapter())
                    .create();
        }
        return gson;
    }
}
