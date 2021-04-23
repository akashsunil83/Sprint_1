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

import com.cg.freelanceapp.entities.Job;
import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.service.IJobService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Job Controller")
@RestController
@RequestMapping("portal/job")
public class JobController {
	
	@Autowired
	IJobService jobService;
	
	@ApiOperation(value="post a job")
	
	@PostMapping("/postJob")
	public ResponseEntity<Object> job(@RequestBody Job job) {
		
		jobService.postJob(job);
		return new ResponseEntity<>("Job Successfully", HttpStatus.ACCEPTED);
	}
	
	@ GetMapping(value = "/findById")
	public Job findById(@PathVariable Long id)
	{
		return jobService.findById(id);
	}
	
	@GetMapping(value="/findJobsBySkill")
	public ResponseEntity<Object> findbyskill(@RequestBody Skill skill)
	{
		jobService.findJobsBySkill(skill);
		return new ResponseEntity<>("job found Successfully", HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/close")
	public String close(@RequestBody Job job) {
		
		jobService.close(job);
		return "closed successfully";
		
	}
	
	
	
}


