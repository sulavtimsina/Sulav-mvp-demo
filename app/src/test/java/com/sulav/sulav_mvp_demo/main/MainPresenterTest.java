package com.sulav.sulav_mvp_demo.main;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class MainPresenterTest {

    @Mock
    MainContract.MvpView mvpView;

    MainPresenter mainPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mainPresenter = new MainPresenter(mvpView);
    }

    @Test
    public void handleSignInButtonClick() {
        mainPresenter.handleSignInButtonClick("sulav@gmail.com", "sulavpass");
        verify(mvpView).signInSuccess();
    }
}