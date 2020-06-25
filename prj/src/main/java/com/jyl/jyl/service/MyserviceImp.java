package com.jyl.jyl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jyl.jyl.dao.userMapper;
import com.jyl.jyl.domain.User;


@Service
public class MyserviceImp implements MyService{	
	
	@Autowired
	private userMapper UserMapper;

	public User fun(int id) {
		User user = null;
		try {
			user = UserMapper.fun(id);
		}catch(Exception e)
		{
		
		}
		return user;
	}
}
