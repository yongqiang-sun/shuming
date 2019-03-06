package com.project.service;

import com.project.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

	User getUserById(Integer userId);

	List<User> getUserAll();

}
