package com.lcwd.orm.services.impl;

import com.lcwd.orm.entity.User;
import com.lcwd.orm.repositeries.UserRepository;
import com.lcwd.orm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    Logger logger=LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        User save = userRepository.save(user);
        logger.info("User Saved: {}", save.getId());
        return save;
    }

    @Override
    public User updateUser(User user, int userid) {
        User oldUser=userRepository.findById(userid).orElseThrow(()-> new RuntimeException("User with given id not found"));
        oldUser.setCity(user.getCity());
        oldUser.setAge(user.getAge());
        oldUser.setName(user.getName());
        User user1=userRepository.save(oldUser);
        return user1;
    }

    @Override
    public void deleteUser(int userId) {
        User user=userRepository.findById(userId).orElseThrow(()-> new RuntimeException("User with given id not found"));
        userRepository.delete(user);
        logger.info("user deleted");
    }

    @Override
    public List<User> getAllUser() {
       List<User> users=userRepository.findAll();
        return users;
    }

    @Override
    public User get(int usedId) {
        Optional<User> userOptional= userRepository.findById(usedId);
       User user=userOptional.orElseThrow(()-> new RuntimeException("User with given id not found"));
        return user;
    }
}
