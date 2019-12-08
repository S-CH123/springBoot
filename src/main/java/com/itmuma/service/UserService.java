package com.itmuma.service;

import com.itmuma.mapper.UserMapper;

import com.itmuma.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public List<User> selectAll(){

        System.out.println("进入service");
        return userMapper.selectAll();
    }

    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
