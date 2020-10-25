package com.echo.user.controller;

import com.echo.user.pojo.User;
import com.echo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")     //占位符参数使用@PathVariable()注解来接收，即/user/1
                            // 而url中附带的参数，即？后的参数，用@Param来接收
    @ResponseBody
    public User queryUserById(@PathVariable("id") Integer id){
        return this.userService.queryUserById(id);
    }

    @GetMapping("all")
    public String toUsers(Model model){
        List<User> users = this.userService.queryUserAll();
        model.addAttribute("users",users);
        return "users";
    }

    @GetMapping("test")
    @ResponseBody   //响应json数据
    public String test(){
        return "Hello user";
    }
}
