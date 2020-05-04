package com.job.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="jobdetails")
public class Jobdetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Jobid;
	private String jobname;
	private String jobskills;
	private String companyname;
	private String salary;
	
}
