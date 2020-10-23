package com.echo.springboot;

import com.echo.springboot.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

//@EnableAutoConfiguration ////声明 启用了自动配置，springboot会根据依赖猜测你需要的配置,但是自动配置也是全局的，
                        // 不要启用多个自动配置
//@ComponentScan          //包扫描。类似于<context:component-scan base-pacakge=""> 不指定具体的包，会扫描该类所在的包
                        //以及子子孙孙包
/**
 * 引导类，是springboot的入口
 */
@SpringBootApplication  //组合注解，包含以上注解的所有功能相当于@EnableAutoConfiguratin 和 @ComponentScan
                        // 和 @SpringBootConfiguration（相当于Spring的@Configuration，标明java配置）
public class TestApplication {
    //注意是无法有两个main方法的，所以，他是全局的，应该只出现在引导类中
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class,args);
    }
}
