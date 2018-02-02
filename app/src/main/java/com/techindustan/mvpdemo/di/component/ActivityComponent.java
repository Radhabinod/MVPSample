package com.techindustan.mvpdemo.di.component;

import android.content.Context;


import com.techindustan.mvpdemo.di.annotation.PerActivity;
import com.techindustan.mvpdemo.di.module.ActivityModule;
import com.techindustan.mvpdemo.ui.login.LoginActivity;

import dagger.Component;

/**
 * Created by shruti on 9/1/18.
 */

@PerActivity
@Component(dependencies = SampleAppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(LoginActivity activity);

}
