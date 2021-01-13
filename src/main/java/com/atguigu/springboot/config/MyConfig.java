package com.atguigu.springboot.config;

import com.atguigu.springboot.component.MyLocaleResolver;
import org.apache.tomcat.jni.Local;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyConfig implements WebMvcConfigurer{
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
