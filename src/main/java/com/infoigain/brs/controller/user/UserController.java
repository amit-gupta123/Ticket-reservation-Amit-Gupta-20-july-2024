package com.infoigain.brs.controller.user;

import com.infoigain.brs.models.User;
import com.infoigain.brs.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService userServiceImpl = null;
    @Autowired
    public UserController(UserService userServiceImpl){
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable  Long id){
        return userServiceImpl.getUserById(id);
    }

    @PostMapping("/")
    public User addUser(User user){
        return this.userServiceImpl.saveUser(user);
    }

}
