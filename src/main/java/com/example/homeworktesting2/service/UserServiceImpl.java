package com.example.homeworktesting2.service;

import com.example.homeworktesting2.UserDao.UserDao;
import com.example.homeworktesting2.model.User;
import org.springframework.stereotype.Service;

public class UserServiceImpl implements UserService {


    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public boolean checkUserExist(User user){
        return userDao.getUserByName(user.getName()) != null;
    }
}
