package com.losileeya.mvpdemp.base;

/**
 * User: Losileeya (847457332@qq.com)
 * Date: 2016-09-11
 * Time: 14:04
 * 类描述：
 *
 * @version :
 */
public interface BaseMvpView {
    /**
     * 显示进度条
     * @param msg   进度条加载内容
     */
    void showLoding(String msg);

    /**
     * 隐藏进度条
     */
    void hideLoding();

    /**
     * 显示加载错误
     * @param err 错误内容
     */
    void showErr(String err);
}
