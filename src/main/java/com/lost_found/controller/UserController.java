package com.lost_found.controller;

import com.lost_found.common.ServerResponse;
import com.lost_found.dao.UserMapper;
import com.lost_found.pojo.User;
import com.lost_found.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping("/login")
    public ServerResponse login(String code){
          return  userService.login(code);
    }

//    @GetMapping("/register")
//    public ServerResponse register(String code){
//        return  userService.login(code);
//    }
}
