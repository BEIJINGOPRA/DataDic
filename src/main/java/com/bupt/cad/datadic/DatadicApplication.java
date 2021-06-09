package com.bupt.cad.datadic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication

public class DatadicApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatadicApplication.class, args);
    }

}
