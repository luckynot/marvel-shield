package com.songxh.shield;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * app starter
 *
 * @author hexiaosong
 * @date 2019-03-31
 */
@SpringBootApplication
@EnableEurekaServer
public class ShieldApp {

    public static void main(String[] args) {
        SpringApplication.run(ShieldApp.class, args);
    }
}
