package com.techindustan.mvpdemo.ui.login;

import android.util.Log;
import android.util.Patterns;

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

public class LoginPresenter implements LoginInterface {
    LoginView view;
    Retrofit retrofit;

    public LoginPresenter(LoginView view, Retrofit retrofit) {
        this.view = view;
        this.retrofit = retrofit;
        Log.e("retrofit",retrofit+"");
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
        if (validate(email)) {
            login(email);
        } else {
            view.showMessage("Fail");
        }
    }

    boolean validate(String email) {
        if (email.length() > 0) {
            if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                return true;
            } else {
                view.showMessage("Invalid Email address");
                return false;
            }
        }
        return false;
    }

    void login(String email) {
        view.showProgressDialog();
        Call<Login> user = retrofit.create(APIService.class).getUsers("1", "fJJMDOffAP8:APA91bGd7z2S2f4djeQlO-WrQD70xe92cnvHkKx7yHBBVRGBXDYBSLUZtf5lOx0SLf_gTYMz0GVBDWexE7gX2FU8nXn-g8pBepMHTRy0E4vO7mwGr9SOCRL_V7Fu_dzxX7sGLIhSj8QF", "abc@gmail.com");
        user.enqueue(new Callback<Login>() {
            @Override
            public void onResponse(Call<Login> call, Response<Login> response) {
                view.showMessage("Success");
                view.hideProgressDialog();
                view.goToNextScreen();
                Log.e("success", response.body().getResponse().getAuth() + "");
            }

            @Override
            public void onFailure(Call<Login> call, Throwable t) {
                view.showMessage("Fail");
                view.hideProgressDialog();
                Log.e("error", t.getMessage());
            }
        });
    }
}
