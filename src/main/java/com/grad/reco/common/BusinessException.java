package com.grad.reco.common;

/**
 * @description: ...
 * @author: nixekgnaww
 * @date: 3/23/2021 9:00 PM
 */
public class BusinessException extends Exception{
    private CommonError commonError;

    public BusinessException(EmBusinessError emBusinessError){
        super();
        this.commonError = new CommonError(emBusinessError);
    }

    public CommonError getCommonError() {
        return commonError;
    }

    public void setCommonError(CommonError commonError) {
        this.commonError = commonError;
    }
}
