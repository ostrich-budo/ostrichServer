package com.ostrich.model;

/**
 * Created by alparslanb
 * on 24/05/15.
 */
public class BaseResponse {

    private boolean success;
    private String errMsg;
    private String errId;

    public BaseResponse(boolean success, String errMsg, String errId) {
        this.success = success;
        this.errMsg = errMsg;
        this.errId = errId;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public String getErrId() {
        return errId;
    }
}
