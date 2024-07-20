package com.infoigain.brs.services;

import com.infoigain.brs.models.User;

public interface UserService {
   public User getUserById(Long id);

   User saveUser(User user);
}
