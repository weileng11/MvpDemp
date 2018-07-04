package com.losileeya.mvpsimpledemo.presenter;

import com.losileeya.mvpsimpledemo.model.CallBack;
import com.losileeya.mvpsimpledemo.model.UserModel;
import com.losileeya.mvpsimpledemo.view.LoginView;

/**
 * User: Losileeya (847457332@qq.com)
 * Date: 2016-09-09
 * Time: 11:39
 * 类描述：
 *
 * @version :
 */
public class LoginPresenter {
    private UserModel userModel;//model层具体实现类
    private LoginView loginView;//loginView接口

    public LoginPresenter(UserModel userModel, LoginView loginView) {
        this.userModel = userModel;
        this.loginView = loginView;
    }
    public void login(){
        loginView.showLoding("正在登录中...");//loginView的ui逻辑处理
        userModel.login(loginView.getUsername(), loginView.getPassword(), new CallBack() {
            @Override
            public void onSuccess() {
                loginView.hideLoding();
                loginView.showResult("登录成功");
            }

            @Override
            public void onFilure(String fail) {
                loginView.hideLoding();
                loginView.showErr(fail);
            }
        });
    }
}
