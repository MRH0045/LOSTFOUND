package com.lost_found.explore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.lost_found")
@MapperScan(basePackages = {"com.lost_found.dao"})
public class ExploreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExploreApplication.class, args);
    }

}
