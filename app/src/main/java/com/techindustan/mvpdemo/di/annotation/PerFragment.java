package com.techindustan.mvpdemo.di.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by shruti on 9/1/18.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerFragment {
}