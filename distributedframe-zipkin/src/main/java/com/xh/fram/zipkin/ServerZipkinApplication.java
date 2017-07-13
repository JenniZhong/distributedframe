package com.xh.fram.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

/**
 * ZIPKIN服务，用于接收服务追踪日志并存储
 * @author xh
 *
 */
@SpringBootApplication
@EnableZipkinServer	//开启ZIPKIN服务追踪
public class ServerZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerZipkinApplication.class, args);
    }
}
