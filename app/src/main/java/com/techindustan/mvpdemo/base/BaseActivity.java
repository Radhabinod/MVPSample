package com.techindustan.mvpdemo.base;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.techindustan.mvpdemo.SampleApplication;
import com.techindustan.mvpdemo.di.component.ActivityComponent;
import com.techindustan.mvpdemo.di.component.DaggerActivityComponent;
import com.techindustan.mvpdemo.di.module.ActivityModule;

public class BaseActivity extends AppCompatActivity implements BaseActivityCallback {
    private ProgressDialog progress;
    ActivityComponent activityComponent;
    public ActivityComponent getActivityComponent() {
        if (activityComponent == null) {
            activityComponent = DaggerActivityComponent.builder().sampleAppComponent(((SampleApplication) (this.getApplicationContext())).getNetComponent()).activityModule(new ActivityModule(this)).build();
        }
        return activityComponent;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void showProgress() {
        if (progress == null) {
            progress = new ProgressDialog(this, ProgressDialog.STYLE_SPINNER);
            progress.setCancelable(false);
        }
        progress.show();
    }

    @Override
    public void hideProgress() {
        if (progress != null && progress.isShowing()) {
            progress.dismiss();
        }

    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
