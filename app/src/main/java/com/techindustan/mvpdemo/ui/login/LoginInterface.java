package com.techindustan.mvpdemo.ui.login;

/**
 * Created by binod on 10/11/17.
 */

public interface LoginInterface {
    boolean validateEmail(String email);
    void logIn();
    void validateAndLogin(String email);
}
