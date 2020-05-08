package com.vp.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
@Table(name="user")
public class User {
	@Id
	@GeneratedValue
    private Integer userid;
	@NotBlank(message=" enter a username ")
	String username;
	@NotEmpty(message="password cannot be empty")
	String password;
	@NotEmpty(message="email cannot be empty")
	@javax.validation.constraints.Email(message="email should format should be abc@gmail.com")
	String email;
	String usertype;
	
	
}
