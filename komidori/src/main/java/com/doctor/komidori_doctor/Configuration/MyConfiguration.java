package com.doctor.komidori_doctor.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *  设置可以跨域请求
 */
@Configuration
public class MyConfiguration {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {

            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*")
                        //是否允许证书 不再默认开启
                        .allowCredentials(true)
                        //设置允许的方法
                        .allowedMethods("*")
                        //跨域允许时间
                        .maxAge(3600);
            }
        };
    }
}
