package com.echo.user.config;

import com.echo.user.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置拦截器
 * 1.声明该类是一个java配置类
 * 2.实现WebMvcConfigurer接口
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Autowired  //注入拦截器
    private MyInterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器。  addPathPatterns("/**") 添加拦截路径
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");
    }
}
