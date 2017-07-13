package com.xh.frame.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

/**
 * ZUUL路由负载均衡
 * @author xh
 *
 */
@EnableZuulProxy	//开启ZUUL路由
@EnableEurekaClient
@SpringBootApplication
@ComponentScan
public class GatewayApplication {
	
	//通过Gateway转发到server url 样例:http://localhost:8080/api/test?name=acx
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	 
}
