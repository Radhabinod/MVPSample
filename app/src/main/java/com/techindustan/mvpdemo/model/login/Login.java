
package com.techindustan.mvpdemo.model.login;

import com.google.gson.annotations.SerializedName;


public class Login {

    @SerializedName("response")
    private Response mResponse;
    @SerializedName("status")
    private Long mStatus;

    public Response getResponse() {
        return mResponse;
    }

    public void setResponse(Response response) {
        mResponse = response;
    }

    public Long getStatus() {
        return mStatus;
    }

    public void setStatus(Long status) {
        mStatus = status;
    }

}
