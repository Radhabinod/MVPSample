package com.techindustan.mvpdemo.ui.user;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.techindustan.mvpdemo.R;
import com.techindustan.mvpdemo.SampleApplication;
import com.techindustan.mvpdemo.base.BaseActivity;
import com.techindustan.mvpdemo.di.module.ApplicationModule;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class UserActivity extends BaseActivity implements UserView {

    @Inject
    Retrofit retrofit;
    UserPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        presenter = new UserPresenter(this, retrofit);
        Log.e("retrofit",retrofit+"");

    }


    @Override
    public void updateList() {

    }

    @Override
    public void showMessage(String message) {
        showToast(message);
    }
}
