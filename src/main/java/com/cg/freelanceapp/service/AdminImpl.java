package com.cg.freelanceapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IAdminDao;
import com.cg.freelanceapp.entities.Admin;
import com.cg.freelanceapp.exceptions.IdNotFoundException;

@Service
public class AdminImpl implements IAdminService {
	
	@Autowired
	IAdminDao adminDao;
	
	public Admin save(Admin admin)
	{
		return adminDao.save(admin);
	}
	
	@Override
	public Admin update(Long id, Admin admin)
	{
		if(adminDao.existsById(id))
		{
			return adminDao.save(admin);
		}
		else {
			throw new IdNotFoundException();
		}
		
	}
	
	
	
	@Override 
	public Admin findById(Long id)
	{
		return adminDao.findById(id).get();
		
	}
	

}
