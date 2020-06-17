package com.spring.rest.response;


/**
 * Created by cahyocayo
 */

public class CommonRs {

    private String responseCode;
    private String simpleResult;
    private String resultCode;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getSimpleResult() {
        return simpleResult;
    }

    public void setSimpleResult(String simpleResult) {
        this.simpleResult = simpleResult;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }
}
