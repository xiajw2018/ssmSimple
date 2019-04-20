package com.xiajw.ssmSimple.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xiajw.ssmSimple.pojo.User;

@Repository
public interface UserMapper {

	public List<User> getUserList();
}
