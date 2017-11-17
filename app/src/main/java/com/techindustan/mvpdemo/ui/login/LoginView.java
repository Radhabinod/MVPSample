package com.techindustan.mvpdemo.ui.login;

/**
 * Created by binod on 10/11/17.
 */

public interface LoginView {
    void goToNextScreen();
    void showMessage(String message);
    void showProgressDialog();
    void hideProgressDialog();
}
