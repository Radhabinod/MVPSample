
package com.techindustan.mvpdemo.model.login;

import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("access_token")
    private String mAccessToken;
    @SerializedName("auth")
    private String mAuth;

    public String getAccessToken() {
        return mAccessToken;
    }

    public void setAccessToken(String accessToken) {
        mAccessToken = accessToken;
    }

    public String getAuth() {
        return mAuth;
    }

    public void setAuth(String auth) {
        mAuth = auth;
    }

}
