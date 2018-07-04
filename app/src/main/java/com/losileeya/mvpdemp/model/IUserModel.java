package com.losileeya.mvpdemp.model;

/**
 * User: Losileeya (847457332@qq.com)
 * Date: 2016-09-11
 * Time: 14:19
 * 类描述：
 *
 * @version :
 */
public interface IUserModel {
    /**
     *  登录逻辑处理
     * @param username   用户名
     * @param password   密码
     * @param callBack   结果回调
     */
    void login(String username,String password,CallBack  callBack);
}
