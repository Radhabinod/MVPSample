package com.techindustan.mvpdemo.di.module;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.techindustan.mvpdemo.di.component.SampleAppComponent;
import com.techindustan.mvpdemo.network.APIService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by binod on 17/11/17.
 */
@Module(includes = NetModule.class)
public class SampleAppServiceModule {
    @Provides
    @Singleton
    public APIService getAppService(Retrofit gitHubRetrofit) {
        return gitHubRetrofit.create(APIService.class);
    }

    @Provides
    @Singleton
    public Gson gson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.create();
        return gsonBuilder.create();
    }

    @Provides
    @Singleton
    public Retrofit retrofit(OkHttpClient okHttpClient, Gson gson) {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .baseUrl("https://api.github.com/")
                .build();
    }
}
