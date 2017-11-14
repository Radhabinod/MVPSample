package com.techindustan.mvpdemo.ui.user;

import android.util.Log;

import com.techindustan.mvpdemo.model.login.Login;
import com.techindustan.mvpdemo.model.users.User;
import com.techindustan.mvpdemo.network.APIService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by binod on 14/11/17.
 */

public class UserPresenter implements UserInterface {
    UserView view;
    Retrofit retrofit;

    UserPresenter(UserView view, Retrofit retrofit) {
        this.view = view;
        this.retrofit = retrofit;
    }

    @Override
    public void getUser() {
        /*Call<Login> user = retrofit.create(APIService.class).getUsers("1", "fJJMDOffAP8:APA91bGd7z2S2f4djeQlO-WrQD70xe92cnvHkKx7yHBBVRGBXDYBSLUZtf5lOx0SLf_gTYMz0GVBDWexE7gX2FU8nXn-g8pBepMHTRy0E4vO7mwGr9SOCRL_V7Fu_dzxX7sGLIhSj8QF", "abc@gmail.com");
        user.enqueue(new Callback<Login>() {
            @Override
            public void onResponse(Call<Login> call, Response<Login> response) {
                view.showMessage("Success");
                Log.e("success", response.body().getResponse()+"");
            }

            @Override
            public void onFailure(Call<Login> call, Throwable t) {
                view.showMessage("Fail");
                Log.e("error", t.getMessage());
            }
        });*/
       /* Call<String> auth = retrofit.create(APIService.class).getLogos("33448899Favens99884433");
        auth.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.e("success", response.raw().toString());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.e("success", t.getMessage());
            }
        });*/
        Call<String> linkedin=retrofit.create(APIService.class).getLinkedinusers();
        linkedin.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.e("success", response.raw().toString());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.e("fail", t.getMessage());
            }
        });
    }
}
