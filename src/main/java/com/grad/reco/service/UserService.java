package com.grad.reco.service;

import com.grad.reco.model.UserModel;

public interface UserService {
    UserModel getUser(Integer id);

    UserModel register(UserModel registerUser);


}
