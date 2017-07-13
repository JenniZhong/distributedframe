package com.xh.frame.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix //开启断路由
@EnableHystrixDashboard //开启断路由仪表盘
@EnableFeignClients //开启Feign
public class RestServerApplication {
	 public static void main(String[] args) {
        SpringApplication.run(RestServerApplication.class, args);
    }
	 
	/**
	* @Title: restTemplate 
	* @Description: TODO(注入restTemplate,@LoadBalanced表示开启负载均衡) 
	* @param @return  
	* @return RestTemplate    返回类型 
	* @author xh
	* @date 2017年7月4日
	 */
	/*@Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }*/
}
