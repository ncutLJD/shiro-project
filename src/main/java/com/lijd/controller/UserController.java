package com.lijd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lijunda on 2018/11/14.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("login")
    public String login(){
        System.out.println("可以访问");
        return "login";
    }
}
