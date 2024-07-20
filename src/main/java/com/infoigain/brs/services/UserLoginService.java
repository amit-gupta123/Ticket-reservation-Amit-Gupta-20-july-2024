package com.infoigain.brs.services;

import com.infoigain.brs.models.User;

public interface UserLoginService {
   boolean authenticateUser(String userName, String passWord);
}
