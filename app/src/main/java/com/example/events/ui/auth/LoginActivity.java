package com.example.events.ui.auth;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.events.R;
import com.example.events.base.BaseActivity;
import com.example.events.ui.event.MainActivity;

import butterknife.BindView;

public class LoginActivity extends BaseActivity {
    @BindView(R.id.btn_signup)
    Button signupButton;
    @BindView(R.id.btn_login)
    Button loginButton;
    @BindView(R.id.input_email)
    EditText emailInput;
    @BindView(R.id.input_password)
    EditText passwordInput;


    @Override
    protected int layoutRes() {
        return R.layout.activity_login;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loginButton.setOnClickListener(view -> {

        });

        signupButton.setOnClickListener(view -> {
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(i);
        });
    }
}