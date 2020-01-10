package com.sulav.sulav_mvp_demo.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sulav.sulav_mvp_demo.R;

public class MainActivity extends AppCompatActivity implements MainContract.MvpView{

    private MainContract.MvpPresenter presenter;
    private EditText etEmail, etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);
        initViews();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();
                if(TextUtils.isEmpty(email) || TextUtils.isEmpty(password)){
                    signInError();
                }else{
                    presenter.handleSignInButtonClick(email, password);
                }
            }
        });
    }

    private void initViews(){
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
    }

    @Override
    public void signInSuccess() {
        Toast.makeText(this, "Sign In Successful", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void signInError() {
        Toast.makeText(this, "Incorrect/Empty Login Credentials", Toast.LENGTH_SHORT).show();
    }

}
