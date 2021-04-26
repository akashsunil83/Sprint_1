package com.cg.freelanceapp.dao;

import com.cg.freelanceapp.entities.JobApplication;

public interface IJobApplicationDao {
	
	void remove(JobApplication jobApplication);

	JobApplication save(JobApplication jobApplication);

	JobApplication update(JobApplication jobApplication);
}
