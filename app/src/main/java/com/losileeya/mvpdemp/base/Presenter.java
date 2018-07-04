package com.losileeya.mvpdemp.base;

/**
 * User: Losileeya (847457332@qq.com)
 * Date: 2016-09-11
 * Time: 14:03
 * 类描述：
 *
 * @version :
 */
public interface Presenter<V extends BaseMvpView> {
    /**
     * presenter和对应的view绑定
     * @param mvpView  目标view
     */
    void attachView(V mvpView);

    /**
     * presenter与view解绑
     */
    void detachView();
}
