package com.grad.reco.common;

/**
 * @description: ...
 * @author: nixekgnaww
 * @date: 3/23/2021 8:24 PM
 */
public class CommonRes {

    private String status;

    private Object data;

    //general object handle
    public static CommonRes create(Object result){
        return CommonRes.create(result,"success");
    }

    public static CommonRes create(Object result,String status){
        CommonRes commonRes = new CommonRes();
        commonRes.setStatus(status);
        commonRes.setData(result);

        return commonRes;

    }

    public String getStatus() {
        return status;
    }

    public Object getData() {
        return data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
