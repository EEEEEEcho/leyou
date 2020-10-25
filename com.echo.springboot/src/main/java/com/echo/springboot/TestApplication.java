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
/**
    注解
 1.@RestController
 2.@EnableAutoConfiguration 开启自动配置
 3.@ComponentScane 注解扫描
 4.@SpringBootApplication 组合注解 *
 5.@SpringBootConfiguration
 6.@Configuration 声明一个类是java配置类，相当于一个xml配置文件 *
 7.@PropertySource
 8.@Bean *  作用在一个方法上，将方法的返回值注入到spring容器。
 9.@Value   注入参数，需要配合资源文件注解@ProperySource 读取配置文件
 10.@ConfigurationProperties(prefix="jdbc") * 声明一个类是一个属性读取类，通过set方法读取配置文件中的参数,会读取默认的application.yml
 11.@EnableConfigurationProperties(属性读取类.class) * 要使用属性读取类，需要这个注解，启用属性读取类
    1)@Autowired注入
    2)通过构造方法注入
    3)通过@Bean方法参数注入
    4)直接在@Bean方法上使用@ConfigurationProperties(prefix="jdbc")
 */