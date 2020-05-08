package com.vp.dto;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class UserDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5049730970690887263L;
	
	private Integer userid;
	@NotBlank(message = " enter a username ")
	String username;
	@NotEmpty(message = "password cannot be empty")
	String password;
	@NotEmpty(message="mail shoud not be null")
	@javax.validation.constraints.Email(message = "email should format should be abc@gmail.com")
	String email;
	String usertype;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

}
