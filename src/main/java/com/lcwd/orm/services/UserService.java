package com.lcwd.orm.services;

import com.lcwd.orm.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User updateUser(User user,int userid);
    void deleteUser(int userId);
    List<User> getAllUser();
    User get(int usedId);

}
