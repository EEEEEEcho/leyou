package com.echo.user.service;

import com.echo.user.mapper.UserMapper;
import com.echo.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Integer id){
        return this.userMapper.selectByPrimaryKey(id);
    }

    @Transactional  //开启事务
    public void deleteUserById(Integer id){
        this.userMapper.deleteByPrimaryKey(id);
    }

    public List<User> queryUserAll() {
        return this.userMapper.selectAll();
    }
}
