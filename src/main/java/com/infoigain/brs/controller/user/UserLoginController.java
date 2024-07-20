package com.infoigain.brs.controller.user;

import com.infoigain.brs.services.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/auth")
public class UserLoginController {

    private UserLoginService userLoginServiceImpl = null;
    @Autowired
    UserLoginController(UserLoginService userLoginServiceImpl){
        this.userLoginServiceImpl = userLoginServiceImpl;
    }

    @GetMapping("/")
    public boolean Login(String userName, String passWord){
        return this.userLoginServiceImpl.authenticateUser(userName,passWord);
    }

}
