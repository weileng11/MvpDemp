package com.losileeya.mvpdemp.view;

import com.losileeya.mvpdemp.base.BaseMvpView;

/**
 * User: Losileeya (847457332@qq.com)
 * Date: 2016-09-11
 * Time: 14:15
 * 类描述：
 *
 * @version :
 */
public interface LoginView extends BaseMvpView{
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

    /**
     * 显示登录的结果
     * @param result
     */
    void showResult(String result);
}
