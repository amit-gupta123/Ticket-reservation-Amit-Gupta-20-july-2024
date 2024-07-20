package com.infoigain.brs.services.impl;

import com.infoigain.brs.models.User;
import com.infoigain.brs.repo.UserRepository;
import com.infoigain.brs.services.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserLoginServiceImpl implements UserLoginService {

    private UserRepository userRepositoryImpl = null;

    @Autowired
    public UserLoginServiceImpl(UserRepository userRepositoryImpl){
        this.userRepositoryImpl = userRepositoryImpl;
    }

    // this method is just simulating authentication, it can be improved using spring security and a robust login module can be implemented

    public boolean authenticateUser(String userName, String passWord){
           User user = userRepositoryImpl.findByUserName(userName);
           String pass = user.getPassWord();
           if(passWord.equals(pass)){
               return true;
            }
        return false;
    }

}
