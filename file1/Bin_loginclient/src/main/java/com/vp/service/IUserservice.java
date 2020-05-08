package com.vp.service;

import java.util.List;

import com.vp.dto.UserDto;
import com.vp.model.User;

public interface IUserservice {
	
	public List<User> getAllUser();
	public void saveUser(User user);
	public User getUserByid(int userid);
	public User getUserByEmail(String email);
	public String createUser(UserDto user);
}
