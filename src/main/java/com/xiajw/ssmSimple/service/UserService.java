package com.xiajw.ssmSimple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiajw.ssmSimple.mapper.UserMapper;
import com.xiajw.ssmSimple.pojo.User;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;

	public List<User> getAllUser() {
		return userMapper.getUserList();
	}
	
}
