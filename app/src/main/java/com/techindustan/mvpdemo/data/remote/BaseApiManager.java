package com.techindustan.mvpdemo.data.remote;



import com.techindustan.mvpdemo.network.ApiCalls;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by shruti on 10/1/18.
 */

public class BaseApiManager {

    private static final String BASE_URL = "http://agiledevelopers.in/instasell/";


    private static Retrofit mRetrofit;

    private static ApiCalls apiService;


    @Inject
    public BaseApiManager() {

        apiService = createApi(BASE_URL, ApiCalls.class);
    }


    public static void init() {

    }

    private static <T> T createApi(String baseUrl, Class<T> clazz) {

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                //   .addInterceptor(interceptor)
                .build();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                // .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        return mRetrofit.create(clazz);
    }

    public ApiCalls getAuthService() {
        return apiService;
    }



}