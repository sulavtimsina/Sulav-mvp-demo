package com.sulav.sulav_mvp_demo.main;

/*
* Defines the contract between the View {@link MainActivity} and the Presenter {@link MainPresenter}
* */
public interface MainContract {
    interface MvpPresenter{
        void handleSignInButtonClick(String email, String password);
    }

    interface MvpView{
        void signInSuccess();
        void signInError();
    }
}
