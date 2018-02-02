package com.techindustan.mvpdemo.ui.login;

import android.util.Log;
import android.util.Patterns;

import com.techindustan.mvpdemo.base.BasePresenter;
import com.techindustan.mvpdemo.data.DataManager;
import com.techindustan.mvpdemo.data.listeners.DataListener;
import com.techindustan.mvpdemo.model.home.HomeResponse;
import com.techindustan.mvpdemo.model.login.Login;
import com.techindustan.mvpdemo.network.APIService;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by binod on 10/11/17.
 */

public class LoginPresenter<V extends LoginView> extends BasePresenter<V> implements LoginInterface<V> {


    @Inject
    DataManager dataManager;

    @Inject
    public LoginPresenter() {
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
        Log.e("presenter", getMvpView() + "");

        if (validate(email)) {
            login(email);
        } else {
            getMvpView().showMessage("Fail");
        }
    }

    boolean validate(String email) {
        if (email.length() > 0) {
            if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                return true;
            } else {
                getMvpView().showMessage("Invalid Email address");
                return false;
            }
        }
        return false;
    }

    void login(String email) {
        getMvpView().showProgressDialog();
        Log.e("dataManger", dataManager + "");
        dataManager.getHomeDetail(new DataListener() {
            @Override
            public void onResponse(HomeResponse response) {
                getMvpView().hideProgressDialog();
                Log.e("dataaa", response.getStatus() + "");
            }

            @Override
            public void onError(String error) {
                getMvpView().hideProgressDialog();
            }
        });
    }


    void homeApi() {

    }
}
