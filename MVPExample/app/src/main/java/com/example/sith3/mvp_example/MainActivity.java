package com.example.sith3.mvp_example;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends BaseActivity implements LoginCallback {

    LoginPresenter mLoginPresenter;
    Button btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn1);
        mLoginPresenter = new LoginPresenter();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLoginPresenter.onStop(true);
            }
        });


        mLoginPresenter.setLoginCallback(this);

    }

    @Override
    public void setCallback(boolean loginCallback) {

        Toast.makeText(this, "Status: " + loginCallback, Toast.LENGTH_SHORT).show();
    }
}
