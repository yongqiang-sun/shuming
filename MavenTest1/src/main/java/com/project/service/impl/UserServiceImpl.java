package com.project.service.impl;

import com.project.mapper.UserMapper;
import com.project.model.User;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public User getUserById(Integer userId) {
		User user = userMapper.selectByPrimaryKey(userId);
		return user;
	}

	@Override
	public List<User> getUserAll() {
		return userMapper.selectAll();
	}

}
