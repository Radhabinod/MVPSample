package com.techindustan.mvpdemo.base;

/**
 * Created by binod on 10/11/17.
 */

public interface BaseActivityCallback {
    void showProgress();
    void hideProgress();
    void showToast(String message);
}
