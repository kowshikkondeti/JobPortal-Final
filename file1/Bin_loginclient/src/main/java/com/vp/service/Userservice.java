package com.vp.service;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vp.dto.UserDto;
import com.vp.model.User;
import com.vp.repository.Userrepository;
@Service
@Transactional
public class Userservice implements IUserservice{
@Autowired
	Userrepository userrepository;
	
	
public List<User> getAllUser(){
	return (List<User>) userrepository.findAll();
}

public void saveUser(User user) {
	
	userrepository.save(user);
}
@Override
public User getUserByid(int userid) {
	// TODO Auto-generated method stub
	return userrepository.findByUserid(userid);
}

@Override
public User getUserByEmail(String email) {
	// TODO Auto-generated method stub
	return userrepository.findByEmail(email);
}
public String createUser(UserDto user) {
	Optional<User> userOtion=userrepository.findById(user.getUserid());
	if(!userOtion.isPresent()) {
	ModelMapper maper=new ModelMapper();
	maper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	User user1=maper.map(user, User.class);
	userrepository.save(user1);
	return "Created Successfully";
	
}
	else
	{
		throw new UserNotFoundException();
	}
}
