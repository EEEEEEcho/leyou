package com.echo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController                 //声明 controller
@RequestMapping("hello")        //声明 requestMapping
@EnableAutoConfiguration        //声明 启用了自动配置，springboot会根据依赖猜测你需要的配置
public class HelloController {

    @Autowired
    private DataSource dataSource;  //使用@Autowired自动注入数据源

    @GetMapping("show")
    public String test(){
        return "hello spring boot 1";
    }

}
