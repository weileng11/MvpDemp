package com.losileeya.mvpsimpledemo.view;

/**
 * User: Losileeya (847457332@qq.com)
 * Date: 2016-09-12
 * Time: 13:22
 * 类描述：
 *
 * @version :
 */
public interface LoginView {
    /**
     * 显示进度条
     * @param msg   进度条加载内容
     */
    void showLoding(String msg);
    /**
     * 隐藏进度条
     */
    void  hideLoding();
    /**
     * 显示登录的结果
     * @param result
     */
    void showResult(String result);
    /**
     * 显示加载错误
     * @param err 错误内容
     */
    void showErr(String err);
    /**
     * 获得界面上用户名的值
     * @return
     */
    String getUsername();
    /**
     * 获得界面上密码的值
     * @return
     */
    String getPassword();
}
