package com.techindustan.mvpdemo.di.module;

import android.app.Application;
import android.content.Context;

import com.techindustan.mvpdemo.di.Qualifiers.ApplicationContextQualifier;

import javax.inject.Qualifier;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by binod on 13/11/17.
 */
@Module
public class ApplicationModule {
    private final Application mApplication;

    public ApplicationModule(Application app) {
        mApplication = app;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    @ApplicationContextQualifier
    Context provideContext() {
        return mApplication;
    }
}
