package com.techindustan.mvpdemo.network;



import com.techindustan.mvpdemo.model.home.HomeResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by shruti on 11/12/17.
 */

public interface ApiCalls {
    @GET("home.php")
    Call<HomeResponse> getHomeDetail();
}
