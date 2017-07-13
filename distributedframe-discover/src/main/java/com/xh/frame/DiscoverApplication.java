package com.xh.frame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xh
 * Eureka注册中心
 * 必须最先启动
 */
@EnableEurekaServer
@SpringBootApplication
public class DiscoverApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoverApplication.class, args);
    }
}
