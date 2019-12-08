package com.itmuma.controller;

import com.itmuma.pojo.User;
import com.itmuma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

@RestController
public class JdbcController {

    @Qualifier("dataSource")
    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("jdbc")
    public List<User> jdbcController(){
        return userService.selectAll();
    }
    @GetMapping("user/{id}")
    public User findById(@PathVariable Integer id){
        return userService.findById(id);
    }


    @GetMapping("redis")
    public String redisTest(){
        redisTemplate.boundValueOps("string").set("string1");
        redisTemplate.boundValueOps("string").set("string2");
        System.out.println(redisTemplate.opsForValue().get("string"));
        return "redis";
    }

}
