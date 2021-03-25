package com.grad.reco.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: ...
 * @author: nixekgnaww
 * @date: 3/23/2021 11:17 PM
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public CommonRes handleError(HttpServletRequest servletRequest, HttpServletResponse servletResponse,Exception ex){
        if (ex instanceof BusinessException){
            return CommonRes.create(((BusinessException) ex).getCommonError(),"fail");
        }
        else if (ex instanceof ServletRequestBindingException){
            CommonError commonError = new CommonError(EmBusinessError.PARAMETER_ERROR);
            return CommonRes.create(commonError,"fail");
        }
        else if (ex instanceof NoHandlerFoundException){
            CommonError commonError = new CommonError(EmBusinessError.NO_HANDLER_FOUND);
            return CommonRes.create(commonError,"fail");
        }
        else {
            CommonError commonError = new CommonError(EmBusinessError.UNKNOWN_ERROR);
            return CommonRes.create(commonError,"fail");
        }
    }
}
