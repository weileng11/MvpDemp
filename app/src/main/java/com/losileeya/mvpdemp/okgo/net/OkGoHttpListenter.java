package com.losileeya.mvpdemp.okgo.net;

/**
 * @name thinkine
 * @class com.losileeya.mvpdemp.okgo.net
 * @class describe
 * @anthor ${bruce} QQ:275762645
 * @time 2018/7/11
 * @change
 * @chang time
 * @class describe
 */
public interface OkGoHttpListenter<T>{
    public void onSuccess(T content);
    public void onError(String message);
}
