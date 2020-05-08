package com.vp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.vp.exception.ArgumentsMissingException;
//import com.job.controller.JobsRecordNotFoundException;
//import com.job.model.Jobdetails;
import com.vp.exception.UserNotFoundException;
import com.vp.model.User;
import com.vp.dto.UserDto;
import com.vp.service.IUserservice;

@RestController
public class Usercontroller {

	@Autowired
	IUserservice userservice;
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return userservice.getAllUser();
	}

//	@GetMapping("/user/{userid}")
//	public User getUserById(@Valid @PathVariable int userid){
////		List<Jobdetails> jobDetails=	iJobSearchService.getJobsByJobname(jobname);
////		  if(jobDetails.isEmpty()) {
////			  throw new JobsRecordNotFoundException();
////		  }
////		  return jobDetails;
//		User user=userservice.getUserByid(userid);
//		if(user==null) {
//			throw new UserNotFoundException();
//		}
//		
//		return user;
//	}
//	@GetMapping("/user/{obj}")
//	public User getUserById(@Valid @PathVariable Object obj) {
////		List<Jobdetails> jobDetails=	iJobSearchService.getJobsByJobname(jobname);
////		  if(jobDetails.isEmpty()) {
////			  throw new JobsRecordNotFoundException();
////		  }
////		  return jobDetails;
//		if (obj instanceof Integer) {
//			User user = userservice.getUserByid((Integer) obj);
//			if (user == null) {
//				throw new UserNotFoundException();
//			}
//
//			return user;
//		} else if (obj instanceof String) {
//			User user = userservice.getUserByEmail((String) obj);
//			if (user == null) {
//				throw new UserNotFoundException();
//			}
//
//			return user;
//		}
//
//		return null;
//
//	}

	@PostMapping("/postuser")
	public String insertUser(@Valid @RequestBody UserDto user) {
//		if(user.getUserid()<=1||user.getEmail()==null||user.getPassword()==null||user.getUsername()==null||user.getUsertype()==null) {
//			throw new ArgumentsMissingException();
//		}
//		else {
//		userservice.saveUser(user);
//		}
//		userservice.saveUser(user);
		return userservice.createUser(user);
		
	}

}
