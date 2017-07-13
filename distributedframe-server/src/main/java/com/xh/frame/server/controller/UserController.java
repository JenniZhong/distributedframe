package com.xh.frame.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xh.frame.server.client.UserClient;

@RestController
@RequestMapping("userController")
public class UserController {
	@Autowired
	UserClient userClient;
	
	@HystrixCommand(fallbackMethod = "repErrorMsg")//报错返回指定方法里的内容
	@RequestMapping("/test")
	public String getItems(){
        return userClient.getMethods();
    }
	
	@RequestMapping("/get/{id}")
	public String getUserById(@PathVariable("id")Integer id){
		return userClient.getUserById(id);
	}
	
	/**
	* @Title: repErrorMsg 
	* @Description: TODO(返回异常的方法，返回类型要和触发方法一致，需要异常信息在参数中加Throwable) 
	* @param e
	* @return String    返回类型 
	* @author xh
	* @date 2017年7月10日
	 */
	public String repErrorMsg(Throwable e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
        return "sorry,error!";
    }
}
