package com.xh.frame;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 数据库访问服务
 * @author xh
 * @see 实时刷新配置通过spring-boot-starter-actuator完成，但要只能实现单个刷新，要实现分布式刷新须使用Srping Cloud bus
 * 以及消息中间件RabbitMQ
 */
//@RefreshScope //开启该类实时刷新配置功能，通过访问ip:port/refresh 来刷新配置
@ComponentScan
@SpringBootApplication  
@EnableEurekaClient //注册eureka客户端
@RestController
@EnableTransactionManagement // 启注解事务管理
public class DataBaseAccessApplication {
	
	
	public static void main(String[] args) {
	    SpringApplication.run(DataBaseAccessApplication.class, args);
	}
	
	@Value("${server.port}")
	String port;
	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
	    return "hi "+name+",i am from port:" +port;
	}
	
	/*@Value("${foo}") //测试远程配置
    String foo;
    @RequestMapping(value = "/testConfig")
    public String hi(){
        return foo;
    }*/
}
