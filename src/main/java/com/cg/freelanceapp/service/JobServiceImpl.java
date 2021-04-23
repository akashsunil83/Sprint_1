package com.cg.freelanceapp.service;

import java.util.stream.Collectors;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IJobDao;
import com.cg.freelanceapp.entities.Job;
import com.cg.freelanceapp.entities.Skill;



@Service
public class JobServiceImpl implements IJobService {

	@Autowired
	IJobDao jobdao;
	
	@Override
	public Job postJob(Job job)
	{
		return jobdao.save(job);
	}
	
	
	@Override
	public Job findById(Long id)
	{
		return jobdao.findById(id).get();
		
	}
	
	@Override
	
	public List<Job> findJobsBySkill(Skill skill)
	{
		return jobdao.findAll().stream().filter(e -> e.getSkill().equals(skill)).collect(Collectors.toList());
			
	}
	public void close(Job job)
	{
		close(job);
	}


	
	
	
}
