package com.techindustan.mvpdemo.ui.login;

import com.techindustan.mvpdemo.base.MvpView;

/**
 * Created by binod on 10/11/17.
 */

public interface LoginView extends MvpView{
    void goToNextScreen();
    void showMessage(String message);
    void showProgressDialog();
    void hideProgressDialog();
}
