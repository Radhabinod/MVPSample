package com.techindustan.mvpdemo;

import android.app.Application;
import android.content.Context;
import com.techindustan.mvpdemo.di.component.DaggerNetComponent;
import com.techindustan.mvpdemo.di.component.NetComponent;
import com.techindustan.mvpdemo.di.module.ApplicationModule;
import com.techindustan.mvpdemo.di.module.NetModule;

/**
 * Created by binod on 13/11/17.
 */

public class SampleApplication extends Application {
    private NetComponent mNetComponent;

    public static SampleApplication get(Context context) {
        return (SampleApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerNetComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .netModule(new NetModule("https://api.github.com/users/"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
