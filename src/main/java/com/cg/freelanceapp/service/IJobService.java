package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.Job;
import com.cg.freelanceapp.entities.Skill;

@Service
public interface IJobService {
	
	Job postJob(Job job);

	Job findById(Long id);
	
	List<Job> findJobsBySkill(Skill skill);
	
	void close(Job job);
	
}
