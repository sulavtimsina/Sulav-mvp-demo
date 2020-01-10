package com.sulav.sulav_mvp_demo.main;

/*
* Defines the contract between the View {@link MainActivity} and the Presenter {@link MainPresenter}
* */
public interface MainContract {
    interface MvpPresenter{
        void handleSignInButtonClick();
        void handleSignUpButtonClick();
    }

    interface MvpView{
        void navigateToSignIn();
        void navigateToSignUp();
    }
}
