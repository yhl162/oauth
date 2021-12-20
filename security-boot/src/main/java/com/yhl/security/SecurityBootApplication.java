package com.yhl.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yhl.security.mapper")
public class SecurityBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityBootApplication.class, args);
    }

}
