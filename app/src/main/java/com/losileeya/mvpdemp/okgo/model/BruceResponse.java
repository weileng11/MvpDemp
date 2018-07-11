package com.losileeya.mvpdemp.okgo.model;

import java.io.Serializable;

/**
 * @name thinkine
 * @class com.losileeya.mvpdemp.okgo.model
 * @class describe
 * @anthor ${bruce} QQ:275762645
 * @time 2018/7/11
 * @change
 * @chang time
 * @class describe
 */
public class BruceResponse<T> implements Serializable {

    private static final long serialVersionUID = 5213230387175987834L;

    public int code;
    public String msg;
    public T data;

    @Override
    public String toString() {
        return "BruceResponse{\n" +//
                "\tcode=" + code + "\n" +//
                "\tmsg='" + msg + "\'\n" +//
                "\tdata=" + data + "\n" +//
                '}';
    }

}
