package com.techindustan.mvpdemo;

import android.app.Application;
import android.content.Context;

import com.techindustan.mvpdemo.di.component.DaggerSampleAppComponent;
import com.techindustan.mvpdemo.di.component.SampleAppComponent;
import com.techindustan.mvpdemo.di.module.ApplicationModule;
import com.techindustan.mvpdemo.di.module.NetModule;

import timber.log.Timber;

/**
 * Created by binod on 13/11/17.
 */

public class SampleApplication extends Application {
    private SampleAppComponent mSampleAppComponent;

    public static SampleApplication get(Context context) {
        return (SampleApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
        mSampleAppComponent = DaggerSampleAppComponent.builder().applicationModule(new ApplicationModule(this)).netModule(new NetModule()).build();
    }

    public SampleAppComponent getNetComponent() {
        return mSampleAppComponent;
    }
}
