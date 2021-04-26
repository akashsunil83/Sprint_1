package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Admin;

@Repository
public interface IAdminDao extends JpaRepository<Admin, Long>{
	
	@Query(value = "select hibernate_id_seq.currval from dual", nativeQuery = true)
	 Long getCurrentSeriesId();
	

}
