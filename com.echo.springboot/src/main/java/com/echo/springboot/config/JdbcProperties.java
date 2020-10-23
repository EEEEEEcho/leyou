package com.echo.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 使用springboot中提供的@ConfigurationProperties注解，来将JdbcProperties中的
 * classDriverName url username password,配置到这个类中
 * 然后使用时，从这个类中进行读取，从而避免了其他类中使用需重新定义的冗余
 */

@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    //添加setter方法之后，springboot会自动通过setter方法将application.properties中读取到的
    //前缀为jdbc的配置加载到这个类定义的属性中。注意，类中定义的属性的字段名要和配置文件中的字段名
    //保持一致，否则读取不到。
    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
