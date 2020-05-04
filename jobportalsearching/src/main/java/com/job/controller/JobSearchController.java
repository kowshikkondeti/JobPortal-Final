package com.job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.job.model.Jobdetails;
import com.job.service.IJobSearchService;

@RestController
public class JobSearchController {
	
	@Autowired
	IJobSearchService iJobSearchService;
	
	@GetMapping("getallsortedjobs/{sortedParam}")
	public List<Jobdetails> getAllSortedJobs(@PathVariable String sortedParam){
		 return iJobSearchService.findSortedJobs(sortedParam);
		
	}

	@GetMapping("getalljobsbyjobskills/{jobskills}")
	public List<Jobdetails> getJobsByJobskills(@PathVariable String jobskills){
		 return iJobSearchService.getJobsByJobskills(jobskills);
		
	}
	
	@GetMapping("getalljobsbyjobname/{jobname}")
	public List<Jobdetails> getJobsByJobname(@PathVariable String jobname){
		 return iJobSearchService.getJobsByJobname(jobname);
		
	}
	
	@GetMapping("getalljobsbycompanyname/{companyname}")
	public List<Jobdetails> getJobsByCompanyname(@PathVariable String companyname){
		 return iJobSearchService.getJobsByCompanyname(companyname);
		
	}
	@GetMapping("getalljobsbysalary/{salary}")
	public List<Jobdetails> getJobsBySalary(@PathVariable String salary){
		 return iJobSearchService.getJobsBySalary(salary);
		
	}
	}
