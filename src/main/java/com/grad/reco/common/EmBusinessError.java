package com.grad.reco.common;

import org.omg.CORBA.UNKNOWN;

/**
 * @description: ...
 * @author: nixekgnaww
 * @date: 3/23/2021 8:38 PM
 */
public enum EmBusinessError {

    //error code start from 1000
    NO_OBJECT_FOUND(1001,"The requested object does not exist"),
    NO_HANDLER_FOUND(1003,"The handler for request not found"),
    PARAMETER_ERROR(1004,"Request parameter error"),
    UNKNOWN_ERROR(1002,"Unknown error");

    private Integer errCode;

    private String errMsg;


    EmBusinessError(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
