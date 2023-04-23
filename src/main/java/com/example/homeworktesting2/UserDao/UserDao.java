package com.example.homeworktesting2.UserDao;

import com.example.homeworktesting2.model.User;

import java.util.List;

public interface UserDao {



    List<User> findAllUsers();
    User getUserByName(String name);
}
