package com.infoigain.brs.services.impl;

import com.infoigain.brs.models.User;
import com.infoigain.brs.repo.UserRepository;
import com.infoigain.brs.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepositoryImpl = null;

    @Autowired
    public UserServiceImpl(UserRepository userRepositoryImpl){
        this.userRepositoryImpl = userRepositoryImpl;
    }
    @Override
    public User getUserById(Long id) {
        if(this.userRepositoryImpl.findById(id).isPresent()){
            return this.userRepositoryImpl.findById(id).get();
        }
        return null;
    }

    @Override
    public User saveUser(User user) {
        return this.userRepositoryImpl.save(user);
    }
}
