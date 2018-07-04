package com.losileeya.mvpdemp.model;

/**
 * User: Losileeya (847457332@qq.com)
 * Date: 2016-09-11
 * Time: 14:18
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
    void onFailure(String fail);
}
