package com.techindustan.mvpdemo.login;

/**
 * Created by binod on 10/11/17.
 */

public class LoginPresenter implements LoginInterface {
    LoginView view;

    LoginPresenter(LoginView view) {
        this.view = view;
    }


    @Override
    public boolean validateEmail(String email) {
        if (email.trim().length() == 0)
            return false;
        return true;
    }

    @Override
    public void logIn() {

    }

    @Override
    public void validateAndLogin(String email) {
        if (validate(email))
            view.showMessage("Success");
        else
            view.showMessage("Fail");
    }

    boolean validate(String email) {
        return email.length() == 0 ? false : true;
    }
}
