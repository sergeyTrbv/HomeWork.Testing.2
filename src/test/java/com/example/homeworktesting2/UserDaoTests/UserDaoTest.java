package com.example.homeworktesting2.UserDaoTests;

import com.example.homeworktesting2.UserDao.UserDao;
import com.example.homeworktesting2.UserDao.UserDaoImpl;
import com.example.homeworktesting2.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDaoTest {

    private final UserDao userDao = new UserDaoImpl();


    @Test
    public void shouldReturnCorrectStringOfNameUser() {

        User user = userDao.getUserByName("Anna");

        Assertions.assertNotNull(user);
        Assertions.assertEquals(user.getName(),"Anna");
    }

    @Test
    public void shouldReturnNameIsNull(){

        Assertions.assertNull(userDao.getUserByName("BabaYaga"));
    }
}
