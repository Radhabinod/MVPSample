package com.techindustan.mvpdemo.ui.login;

import com.techindustan.mvpdemo.base.MvpPresenter;

/**
 * Created by binod on 10/11/17.
 */

public interface LoginInterface <V extends LoginView> extends MvpPresenter<V> {
    boolean validateEmail(String email);
    void logIn();
    void validateAndLogin(String email);
}
