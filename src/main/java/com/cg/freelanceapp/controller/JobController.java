package com.cg.freelanceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.dto.JobDTO;
import com.cg.freelanceapp.entities.Job;
import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.exceptions.InvalidJobException;
import com.cg.freelanceapp.service.IJobService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * 
 * @author   Akash Sunil Kumar
 * Description: This class is the controller for the job module 
 * Created Date: 18 April, 2021 
 * Version : v1.0.0
 */

@Api("Job Controller")
@RestController
@RequestMapping("portal/job")
public class JobController {
	
	@Autowired
	IJobService jobService;
	
	@ApiOperation(value="post a job")
	
	/**
	 * 
	 * @param        jobDto
	 * @return       Response Entity of Object type
	 * Description : This method posts a new job.
	 * @PostMapping: Annotation for mapping HTTP POST requests onto specific handler methods.
	 * 
	 */
	
	@PostMapping("/postJob")
	public ResponseEntity<Object> job(@RequestBody JobDTO jobDto) {
		
		jobService.postJob(jobDto);
		return new ResponseEntity<>("Job Successfully", HttpStatus.ACCEPTED);
	}
	
	
	/**
	 * 
	 * @param        id
	 * @return       Response Entity of Job type
	 * Description : This method finds a job by id
	 * @GetMapping: Annotation for mapping HTTP GET requests onto specific handler methods.
	 * 
	 */
	
	
	@ GetMapping(value = "/findById/{id}")
	public Job findById(@PathVariable Long id)
	{
		try
		{
			return jobService.findById(id);
		}
		catch(InvalidJobException exception)
		{
			throw new InvalidJobException("The id doesn't exist");
		}
		
	}
	
	/**
	 * 
	 * @param        name
	 * @return       Response Entity of Object type
	 * Description : This method finds a job by Skill
	 * @GetMapping: Annotation for mapping HTTP GET requests onto specific handler methods.
	 * 
	 */
	
	@GetMapping(value="/findJobsBySkill/{name}")
	public ResponseEntity<Object> findbyskill(@PathVariable String name)
	{
		try
		{
			jobService.findJobsBySkillName(name);
			return new ResponseEntity<>("Found Succesfully",HttpStatus.ACCEPTED);
		}
		catch(InvalidJobException exception)
		{
			throw new InvalidJobException("no job with this skill found");
		}
	
		
	}
	
	/**
	 * 
	 * @param        job
	 * @return       Response Entity of String type
	 * Description : This method closes the job module.
	 * @PostMapping: Annotation for mapping HTTP POST requests onto specific handler methods.
	 * 
	 */
	
	@PostMapping("/close")
	public String close(@RequestBody Job job) {
		
		jobService.close(job);
		return "closed successfully";
		
	}
	
	
	
}


