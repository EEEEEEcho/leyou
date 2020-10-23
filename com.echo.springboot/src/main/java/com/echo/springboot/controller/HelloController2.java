package com.echo.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                 //声明 controller
@RequestMapping("hello2")        //声明 requestMapping
//@EnableAutoConfiguration        //声明 启用了自动配置，但是自动配置也是全局的，不要启用多个自动配置
public class HelloController2 {

    @GetMapping("show2")
    public String test(){
        return "hello spring boot 2";
    }


}
