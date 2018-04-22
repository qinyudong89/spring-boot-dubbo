package com.goku.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by nbfujx on 2017-11-23.
 */
@SpringBootApplication
@ComponentScan(value = "com.goku.demo.api.service")
@MapperScan(value = "com.goku.demo.mapper")
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
