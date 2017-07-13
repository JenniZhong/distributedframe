package com.xh.frame.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xh.frame.entity.User;
import com.xh.frame.repository.UserRepository;

@RestController
@RequestMapping("userDao")
public class UserDao extends BaseDao<User,Integer>{
	
	UserRepository userRepository;
	
	@Autowired
	public UserDao(UserRepository userRepository) {
		super(userRepository);
		this.userRepository = userRepository;
	}
}
