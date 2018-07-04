package com.losileeya.mvpdemp.view;

import android.os.Bundle;
import android.support.v4.content.Loader;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.losileeya.mvpdemp.R;
import com.losileeya.mvpdemp.base.BaseMvpActivity;
import com.losileeya.mvpdemp.model.UserModel;
import com.losileeya.mvpdemp.model.UserModel3;
import com.losileeya.mvpdemp.presenter.LoginPresenter;
import com.losileeya.mvpdemp.utils.PresenterFactory;
import com.losileeya.mvpdemp.utils.PresenterLoder;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseMvpActivity<LoginPresenter, LoginView> implements LoginView, View.OnClickListener{

    @BindView(R.id.username)
    EditText username;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.login)
    Button login;
//    private EditText username;
//    private EditText password;
//    private Button login;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void listenter() {

    }

    @Override
    protected void initData() {
//        initView();
    }

    /**
     * 创建LoginPresenter实例
     *
     * @param id
     * @param args
     * @return
     */
    @Override
    public Loader<LoginPresenter> onCreateLoader(int id, Bundle args) {
        return new PresenterLoder<>(this, new PresenterFactory<LoginPresenter>() {
            @Override
            public LoginPresenter crate() {
                return new LoginPresenter(new UserModel(), new UserModel3());
            }
        });
    }

    @Override
    public String getUsername() {
        return username.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return password.getText().toString().trim();
    }

    @Override
    public void showResult(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }

//    private void initView() {
//        username = (EditText) findViewById(R.id.username);
//        password = (EditText) findViewById(R.id.password);
//        login = (Button) findViewById(R.id.login);
//
////        login.setOnClickListener(this);
//    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.login:
//                presenter.login();//登录操作
//                break;
//        }
//    }



    @OnClick(R.id.login)
    public void onViewClicked() {
        presenter.login();//登录操作
    }

    @Override
    public void onClick(View v) {

    }
}
