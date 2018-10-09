package com.losileeya.mvpdemp.model;

import android.app.Activity;

import com.losileeya.mvpdemp.okgo.net.OkGoHttpListenter;
import com.losileeya.mvpdemp.okgo.net.OkGoHttpManager;
import com.losileeya.mvpdemp.okgo.net.response.LoginDataResponse;
import com.losileeya.mvpdemp.okgo.utils.Urls;
import com.lzy.okgo.model.HttpParams;

/**
 * User: Losileeya (847457332@qq.com)
 * Date: 2016-09-11
 * Time: 14:20
 * 类描述：
 *
 * @version :
 */
public class UserModel implements IUserModel {
//    private Handler handler = new Handler(Looper.getMainLooper());//主线程handler一步处理

    private Activity activity;

    public UserModel(Activity context) {
        activity = context;
    }

    /**
     * model层业务逻辑处理
     *
     * @param username 用户名
     * @param password 密码
     * @param callBack 结果回调
     */
    @Override
    public void login(final String username, final String password, final CallBack callBack) {
        HttpParams httpParams = new HttpParams();
        httpParams.put("login", username);
        httpParams.put("password", password);

        OkGoHttpManager.getInstance().doHttpPostRequest(LoginDataResponse.class,activity, Urls.Login_Thinkine, httpParams,new OkGoHttpListenter() {
            @Override
            public void onSuccess(Object content) {
                LoginDataResponse longbean=(LoginDataResponse)content;
                callBack.onSuccess(longbean);
            }

            @Override
            public void onError(String message) {
                callBack.onFailure(message);
            }
        });

//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                if (username.equals("123") && password.equals("123"))
//                    callBack.onSuccess();
//                else
//                    callBack.onFailure("帐号或者密码不正确");
//            }
//        }, 2000);
    }
}
