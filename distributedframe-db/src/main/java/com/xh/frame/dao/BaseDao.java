package com.xh.frame.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BaseDao<T,ID extends Serializable> {

protected final Logger logger = LoggerFactory.getLogger(BaseDao.class);
	
	private JpaRepository<T,ID> baseRepository;
	protected List<Map<String,String>> methodRemark = new ArrayList<>();

	public BaseDao(JpaRepository<T,ID> baseRepository){
		this.baseRepository = baseRepository;
	}
	
	@RequestMapping
	public String getMethods() throws JsonProcessingException{
		StringBuilder sb = new StringBuilder("[");
		sb.append("{methodName:'saveOrUpdate',remark:'保存或更新'},");
		sb.append("{methodName:'delete',remark:'根据条件删除一条数据'},");
		sb.append("{methodName:'deleteById',remark:'根据ID删除'},");
		sb.append("{methodName:'get',remark:'根据ID获得一条数据'},");
		sb.append("{methodName:'getAll',remark:'获取所有数据'}");
		if(methodRemark.size()>0){
			sb.append(",");
			ObjectMapper mapper = new ObjectMapper(); //转换器  
			for (Map<String, String> map : methodRemark) {
				sb.append(mapper.writeValueAsString(map)); //将对象转换成json  )
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
	@RequestMapping("saveOrUpdate")
	public T saveOrUpdate(@RequestBody T entity){
		return baseRepository.save(entity);
	}
	
	@RequestMapping("delete")
	public void delete(@RequestBody T entity){
		baseRepository.delete(entity);
	}
	
	@RequestMapping(value="deleteById/{id}", method=RequestMethod.GET)
	public void deleteById(@PathVariable("id") ID id){
		baseRepository.delete(id);
	}
	
	@RequestMapping(value="get/{id}", method=RequestMethod.GET)
	public T get(@PathVariable("id") ID id){
		return baseRepository.findOne(id);
	}
	
	@RequestMapping("getAll")
	public List<T> getAll(){
		return baseRepository.findAll();
	}
}
