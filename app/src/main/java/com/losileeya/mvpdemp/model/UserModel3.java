package com.losileeya.mvpdemp.model;

import android.os.Handler;
import android.os.Looper;

/**
 * User: Losileeya (847457332@qq.com)
 * Date: 2016-09-11
 * Time: 14:20
 * 类描述：
 *
 * @version :
 */
public class UserModel3 implements IUserModel {
    private Handler handler=new Handler(Looper.getMainLooper());//主线程handler一步处理

    /**
     * model层业务逻辑处理
     * @param username   用户名
     * @param password   密码
     * @param callBack   结果回调
     */
    @Override
    public void login(final String username, final String password, final CallBack callBack) {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(username.equals("123")&&password.equals("123")) {
//                    callBack.onSuccess();
                } else {
                    callBack.onFailure("帐号或者密码不正确");
                }
            }
        }, 2000);
    }
}
