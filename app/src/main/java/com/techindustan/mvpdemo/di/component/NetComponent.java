package com.techindustan.mvpdemo.di.component;

import com.techindustan.mvpdemo.di.module.ApplicationModule;
import com.techindustan.mvpdemo.di.module.NetModule;
import com.techindustan.mvpdemo.ui.user.UserActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by binod on 14/11/17.
 */
@Singleton
@Component(modules = {ApplicationModule.class, NetModule.class})
public interface NetComponent {
    void inject(UserActivity activity);
}
