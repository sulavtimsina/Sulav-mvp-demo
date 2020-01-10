package com.sulav.sulav_mvp_demo.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sulav.sulav_mvp_demo.R;

public class MainActivity extends AppCompatActivity implements MainContract.MvpView{

    private MainContract.MvpPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void navigateToSignIn() {

    }

    @Override
    public void navigateToSignUp() {

    }
}
