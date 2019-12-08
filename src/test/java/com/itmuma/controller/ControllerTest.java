package com.itmuma.controller;

import com.itmuma.pojo.User;
import com.itmuma.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class ControllerTest {

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        User byId = userService.findById(2);
        System.out.println(byId);
    }
}
