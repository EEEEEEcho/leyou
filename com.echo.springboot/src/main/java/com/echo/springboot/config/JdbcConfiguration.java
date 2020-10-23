package com.echo.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * jdbc的java配置类
 */
@Configuration  //声明一个类是java配置类，相当于一个xml配置文件
//@PropertySource("classpath:jdbc.properties")    //使用这个注解读取资源文件，因为配置了application.properties
                                            //启动时加载，所以不需要再读取单独资源文件
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration {

    //@Configuration 声明一个类作为配置类，代替xml文件
    //@Bean 声明在方法上，将方法的返回值加入Bean容器，代替<bean>标签
    //@Value 属性注入
    //@PropertySource 指定外部属性文件

    //因为设置了JdbcProperties类在加载时从application.properties中读取配置信息，所以这里就不用使用@Value进行注入了
    //直接实例化JdbcProperties
//    @Value("${jdbc.driverClassName}")   //通过@Value注解将资源文件中的配置进行注入
//    private String driverClassName;
//    @Value("${jdbc.url}")
//    private String url;
//    @Value("${jdbc.username}")
//    private String username;
//    @Value("${jdbc.password}")
//    private String password;

    //第一种构造方式，属性注入
//    @Autowired
//    private JdbcProperties jdbcProperties;  //定义为自动注入后，要启用自动注入配置 @EnableConfigurationProperties
//
//    //第二种构造方式，构造方法注入
//    public JdbcConfiguration(JdbcProperties jdbcProperties){
//        this.jdbcProperties = jdbcProperties;
//    }

//    @Bean               //@Bean注解将方法的返回值注入到Spring容器
//    public DataSource dataSource(){
//        //生成连接池对象
//        DruidDataSource druidDataSource = new DruidDataSource();
//        //连接池四大天王：驱动器，连接url，用户名，密码
//        druidDataSource.setDriverClassName(this.jdbcProperties.getDriverClassName());
//        druidDataSource.setUrl(this.jdbcProperties.getUrl());
//        //this关键字用来区分全局变量和局部变量
//        druidDataSource.setUsername(this.jdbcProperties.getUsername());
//        druidDataSource.setPassword(this.jdbcProperties.getPassword());
//        return druidDataSource;
//    }

    //第三种构造方式，方法形参注入
//    @Bean               //@Bean注解将方法的返回值注入到Spring容器
//    public DataSource dataSource(JdbcProperties jdbcProperties){
//        //生成连接池对象
//        DruidDataSource druidDataSource = new DruidDataSource();
//        //连接池四大天王：驱动器，连接url，用户名，密码
//        druidDataSource.setDriverClassName(jdbcProperties.getDriverClassName());
//        druidDataSource.setUrl(jdbcProperties.getUrl());
//        //this关键字用来区分全局变量和局部变量
//        druidDataSource.setUsername(jdbcProperties.getUsername());
//        druidDataSource.setPassword(jdbcProperties.getPassword());
//        return druidDataSource;
//    }

    //第四种，最优雅注入
    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
