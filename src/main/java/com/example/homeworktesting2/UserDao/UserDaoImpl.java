package com.example.homeworktesting2.UserDao;

import com.example.homeworktesting2.exception.UserExistsException;
import com.example.homeworktesting2.model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private final List<User> users;

    public UserDaoImpl() {
        this.users = Arrays.asList(
                new User("Anna"),
                new User("Bob"),
                new User("German"));
    }

    @Override
    public User getUserByName(String name) {
        for (User user: users){
            if (user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }
}
