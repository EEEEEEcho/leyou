package com.echo.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                 //声明 controller
@RequestMapping("hello")        //声明 requestMapping
@EnableAutoConfiguration        //声明 启用了自动配置
public class HelloController {

    @GetMapping("show")
    public String test(){
        return "hello spring boot 1";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class,args);
    }
}
