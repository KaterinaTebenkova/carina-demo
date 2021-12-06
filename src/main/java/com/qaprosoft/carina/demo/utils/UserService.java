package com.qaprosoft.carina.demo.utils;

import com.qaprosoft.carina.core.foundation.utils.R;

public class UserService {

    public User getUser(){
        User user = new User();
        user.setEmail(R.TESTDATA.get("email"));
        user.setPassword(R.TESTDATA.get("password"));
        return user;
    }

    public User wrongLogin(){
        User user = new User();
        user.setWrongEmail(R.TESTDATA.get("wrong_email"));
        user.setPassword(R.TESTDATA.get("password"));
        return user;
    }
}
