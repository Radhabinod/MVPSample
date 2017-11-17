package com.techindustan.mvpdemo.network;

import com.techindustan.mvpdemo.model.login.Login;
import com.techindustan.mvpdemo.model.users.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by binod on 14/11/17.
 */

public interface APIService {
    @FormUrlEncoded
    @POST("auth/login")
    Call<Login> getUsers(@Field("device_type") String device_type, @Field("device_token") String device_token, @Field("email") String email);
    @POST("logos")
    Call<String> getLogos(@Query("auth")String auth);
    @GET("linkedin")
    Call<String> getLinkedinusers();


}
