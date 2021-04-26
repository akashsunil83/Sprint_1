package com.cg.freelanceapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Job;




@Repository
public interface IJobDao extends JpaRepository<Job, Long> {
	
	public List<Job> findJobBySkillName(String name);
	
	@Query(value = "select hibernate_id_seq.currval from dual", nativeQuery = true)
	 Long getCurrentSeriesId();


}
