package com.job.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.job.model.Jobdetails;

public interface IJobSearchService {

	List <Jobdetails> findSortedJobs(String paramForSorted);
	
	List <Jobdetails>getJobsByJobskills( String jobskills1);
	
	List <Jobdetails>getJobsByJobname( String jobname1);
	
	List <Jobdetails>getJobsByCompanyname( String companyname1);
	
	List <Jobdetails>getJobsBySalary( String salary1);
}
