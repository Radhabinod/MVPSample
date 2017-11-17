package com.techindustan.mvpdemo.di.module;

import android.app.Application;
import android.content.Context;

import com.squareup.picasso.Picasso;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by binod on 16/11/17.
 */
@Module(includes = {ApplicationModule.class})
public class PicassoModule {
    @Provides
    @Singleton
    public Picasso getPiccasso(Context context) {
        return new Picasso.Builder(context).build();
    }
}
