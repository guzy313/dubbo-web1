package com.my.controller;

import com.my.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gzy
 * @version 1.0
 * @Description
 */
@RestController
@RequestMapping("/dubboweb")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/hihi")
    public String hihi(){
        return userService.hihi();
    }



}
