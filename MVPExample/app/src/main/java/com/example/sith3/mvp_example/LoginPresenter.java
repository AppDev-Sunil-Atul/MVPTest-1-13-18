package com.example.sith3.mvp_example;

/**
 * Created on 1/13/2018.
 */

public class LoginPresenter implements Presenter {
    LoginCallback mLoginCallback;

    public void setLoginCallback(LoginCallback loginCallback) {
        this.mLoginCallback = loginCallback;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onRestart() {

    }

    @Override
    public void onStop(boolean s) {
        boolean status = s;
        mLoginCallback.setCallback(status);
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onDestroy() {

    }
}
