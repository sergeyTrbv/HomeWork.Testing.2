package com.example.homeworktesting2.serviceTest;

import com.example.homeworktesting2.UserDao.UserDao;
import com.example.homeworktesting2.model.User;
import com.example.homeworktesting2.service.UserService;
import com.example.homeworktesting2.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserDao userDao;

    @InjectMocks
    private UserServiceImpl userServiceImplTest;

    @Test
    public void TestCheckUserExistTrue() {

        when(userDao.getUserByName("Anna"))
                .thenReturn(new User("Anna"));

        boolean userExist = userServiceImplTest.checkUserExist(new User("Anna"));
        verify(userDao, times(1)).getUserByName("Anna");
        assertTrue(userExist);
    }

    @Test
    public void TestCheckUserexistFalse(){

        when(userDao.getUserByName("Anna"))
                .thenReturn(null);

        boolean userExist = userServiceImplTest.checkUserExist(new User("Anna"));
        assertFalse(userExist);
    }


}



