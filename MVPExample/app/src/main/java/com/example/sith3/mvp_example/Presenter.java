package com.example.sith3.mvp_example;

/**
 * Created on 1/13/2018.
 */

public interface Presenter {

    public void onCreate();

    public void onStart();

    public void onRestart();

    public void onStop(boolean s);

    public void onResume();

    public void onPause();

    public void onDestroy();

}
