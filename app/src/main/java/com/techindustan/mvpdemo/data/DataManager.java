package com.techindustan.mvpdemo.data;

import android.util.Log;


import com.techindustan.mvpdemo.data.listeners.DataListener;
import com.techindustan.mvpdemo.data.local.PreferenceHelper;
import com.techindustan.mvpdemo.data.remote.BaseApiManager;
import com.techindustan.mvpdemo.model.home.HomeResponse;
import com.techindustan.mvpdemo.network.ApiCalls;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by shruti on 10/1/18.
 */


public class DataManager {

    PreferenceHelper helper;
    BaseApiManager baseApiManager;

    @Inject
    public DataManager(PreferenceHelper helper, BaseApiManager manager) {
        this.helper = helper;
        this.baseApiManager = manager;
    }


    public void getHomeDetail(final DataListener listener) {
        ApiCalls apiCalls = baseApiManager.getAuthService();

        Call<HomeResponse> call = apiCalls.getHomeDetail();

        call.enqueue(new Callback<HomeResponse>() {
            @Override
            public void onResponse(Call<HomeResponse> call, Response<HomeResponse> response) {

                listener.onResponse(response.body());
                Log.e("resposneeee", response.body().getStatus() + "");
            }

            @Override
            public void onFailure(Call<HomeResponse> call, Throwable t) {
                listener.onError(t.getMessage());
            }
        });
    }

}
