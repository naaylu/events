package com.example.events.ui.auth;

import android.os.Bundle;
import android.widget.Button;

import com.example.events.R;
import com.example.events.base.BaseActivity;

import butterknife.BindView;

public class LoginActivity extends BaseActivity {
    @BindView(R.id.btn_signup)
    Button btnSignup;
    @BindView(R.id.btn_login)
    Button btnSignup;

    @Override
    protected int layoutRes() {
        return R.layout.activity_login;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}