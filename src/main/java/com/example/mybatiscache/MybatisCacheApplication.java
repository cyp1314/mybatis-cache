package com.example.mybatiscache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mybatiscache.mapper")
@SpringBootApplication
public class MybatisCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisCacheApplication.class, args);
    }

}
