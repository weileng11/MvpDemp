package com.losileeya.mvpsimpledemo.model;

/**
 * User: Losileeya (847457332@qq.com)
 * Date: 2016-09-09
 * Time: 11:32
 * 类描述：
 *
 * @version :
 */
public interface CallBack {
    /**
     * model处理逻辑：成功回调
     */
    void onSuccess();
    /**
     * model处理逻辑：失败回调
     */
    void onFilure(String fail);
}
