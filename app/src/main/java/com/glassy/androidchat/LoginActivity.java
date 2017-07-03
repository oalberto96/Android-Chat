package com.glassy.androidchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {
    @Bind(R.id.editTxtMail) EditText inputEmail;
    @Bind(R.id.editTxtPassword) EditText inputPassword;
    @Bind(R.id.btnSignup) Button btnSignup;
    @Bind(R.id.btnSignIn) Button btnSignin;
    @Bind(R.id.progressBar) ProgressBar progressBar;
    @Bind(R.id.layoutMainContainer) RelativeLayout container;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSignIn)
    public void handleSignin(){

    }

    @OnClick(R.id.btnSignup)
    public void handleSignup(){

    }
}
