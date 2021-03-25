package com.grad.reco.controller;

import com.grad.reco.common.BusinessException;
import com.grad.reco.common.CommonError;
import com.grad.reco.common.CommonRes;
import com.grad.reco.common.EmBusinessError;
import com.grad.reco.model.UserModel;
import com.grad.reco.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller("/user")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("/index.html");
        return modelAndView;
    }

    @RequestMapping("/get")
    @ResponseBody
    public CommonRes getUser(@RequestParam(name="id") Integer id) throws BusinessException {
        UserModel userModel = userService.getUser(id);
        if(userModel==null){
//            return CommonRes.create(new CommonError(EmBusinessError.No_OBJECT_FOUND),"fail");
            throw new BusinessException(EmBusinessError.NO_OBJECT_FOUND);
        }
        return CommonRes.create(userModel);
    }
}
