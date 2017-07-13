/*package com.xh.frame.server.common;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.client.RestTemplate;

import com.ideal.uam.filter.JsonNameFilter;
import com.ideal.uam.service.entity.ContractRoot;
import com.ideal.uam.service.entity.TcpCont;
import com.ideal.uam.spring.configuration.URLProperties;
import com.xh.frame.server.entity.ServiceError;

public class BaseServiceImpl {
	private ServiceError error;
	protected org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	*//**
	* @Title: ResponseJson 
	* @Description: TODO 返回包含必要信息的JSON结果
	* @param @param svcCont 要返回的JSON数据
	* @return String    返回类型 
	* @author xh
	* @date 2017年6月9日
	 *//*
	public String ResponseJson(Object svcCont){
		Map<String,Object> map = new HashMap<>();
		ContractRoot contractRoot = new ContractRoot();
		TcpCont tcpCont = new TcpCont();
		tcpCont.setResTime(new Date().getTime()+"");
		tcpCont.setSign("xxxxxxxxxx");
		tcpCont.setTransactionId("5012010008201602021234567890");
		contractRoot.setTcpCont(tcpCont);
		contractRoot.setSvcCont(svcCont);
		map.put("contractRoot", contractRoot);
		return JSONObject.toJSONString(map,nameFilter);
	}

	public String NullParamException(){
		error.setMessage("参数不能为空！");
		error.setErrorCode(ErrorContract.NULL_PARAM_ERROR_CODE);
		return error;
	}
	
	
	public String UnknowParamException(){
		error.setMessage("无法识别的参数！");
		error.setErrorCode(ErrorContract.PARAM_ERROR_CODE);
		return error;
	}
	
	public String ServiceRuntimeException(Exception e){
		error.setMessage("调用接口出错！异常信息："+e.getMessage());
		error.setErrorCode(ErrorContract.SERVICE_ERROR_CODE);
		return error;
	}
	
	public String ServiceException(String errorCode,String msg){
		error.setMessage(msg);
		error.setErrorCode(errorCode);
		return error;
	}
}
*/