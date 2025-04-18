package com.navigram.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NaviGramApplication {
    public static void main(String[] args) {
        SpringApplication.run(NaviGramApplication.class, args);
    }
}