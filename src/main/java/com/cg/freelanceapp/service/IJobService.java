package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.JobDTO;
import com.cg.freelanceapp.entities.Job;
import com.cg.freelanceapp.entities.Skill;

@Service
public interface IJobService {
	
	Job postJob(JobDTO jobDto);

	Job findById(Long id);
	
	List<Job> findJobsBySkillName(String name);
	
	void close(Job job);
	
}
