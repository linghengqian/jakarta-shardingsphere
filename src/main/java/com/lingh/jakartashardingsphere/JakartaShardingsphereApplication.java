package com.lingh.jakartashardingsphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lingh.jakartashardingsphere.mapper")
public class JakartaShardingsphereApplication {

    public static void main(String[] args) {
        SpringApplication.run(JakartaShardingsphereApplication.class, args);
    }

}
