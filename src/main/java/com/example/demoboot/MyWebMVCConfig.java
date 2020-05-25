package com.example.demoboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by sang on 16-12-20.
 */
@Configuration
//@EnableWebMvc//无需使用该注解，否则会覆盖掉SpringBoot的默认配置值
public class MyWebMVCConfig implements WebMvcConfigurer {

    @Autowired
    MyInterceptor MmyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(MmyInterceptor).addPathPatterns("/**");
    }


//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/register").setViewName("/register");
//        registry.addViewController("/login").setViewName("/login");
//        registry.addViewController("/header").setViewName("/header");
//        registry.addViewController("/footer").setViewName("/footer");
//        registry.addViewController("/myfavorite").setViewName("/myfavorite");
//        registry.addViewController("/fanvoriterank").setViewName("/fanvoriterank");
//    }

}
