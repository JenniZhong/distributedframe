package com.xh.frame.server.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 调用数据访问服务接口，让Feign实现调用服务的负债均衡
 * value:服务名
 * @author xh
 */
@FeignClient(value = "distributedframe-db")
public interface UserClient {

	//@RequestMapping服务的请求路径
	@RequestMapping(value="userDao")
    public String getMethods();
	
	@RequestMapping(value="userDao/get/{id}")
	public String getUserById(@PathVariable("id")Integer id);
}
