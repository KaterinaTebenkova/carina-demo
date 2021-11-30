package com.qaprosoft.carina.demo.test1;

import com.qaprosoft.carina.core.foundation.utils.R;

public class UserService {

    public User getUser(){
        User user = new User();
        user.setEmail(R.TESTDATA.get("email"));
        user.setPassword(R.TESTDATA.get("password"));
        return user;
    }
}
