package com.techindustan.mvpdemo.di.module;

import android.content.Context;


import com.techindustan.mvpdemo.di.annotation.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by shruti on 9/1/18.
 */

@Module
public class ActivityModule {
    Context context;

    public ActivityModule(Context context) {
        this.context = context;
    }

    @Provides
    @ActivityContext
    Context getActivityContext() {
        return context;
    }


}
