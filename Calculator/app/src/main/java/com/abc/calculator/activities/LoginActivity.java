package com.abc.calculator.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.abc.calculator.R;

/**
 * Created by Linchpin25 on 6/28/2016.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvForgotPass, tvSignIn, tvRegister;
    public EditText etEmail, etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        etEmail = (EditText) findViewById(R.id.et_email);
        etPass = (EditText) findViewById(R.id.et_pass);
        tvForgotPass = (TextView) findViewById(R.id.tv_forgot_pass);
        tvForgotPass.setOnClickListener(this);
        tvSignIn = (TextView) findViewById(R.id.tv_sign_in);
        tvSignIn.setOnClickListener(this);
        tvRegister = (TextView) findViewById(R.id.tv_register);
        tvRegister.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_forgot_pass:
                startActivity(new Intent(LoginActivity.this, ForgotPasswordActivity.class));
                break;
            case R.id.tv_sign_in:
                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                break;
            case R.id.tv_register:
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                break;


        }

    }
}
