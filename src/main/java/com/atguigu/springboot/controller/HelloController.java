package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping({"/","/login.html"})
    public String loginController(){
        return "login";
    }
    @ResponseBody
    @RequestMapping("/hello")
    public String helloController(){
        return "hello world";
    }
    //查出一些数据，在页面展示
    @RequestMapping("success")
    public String sucess(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        /*classpath:/templates/success.html*/
        return "success";
    }
}
