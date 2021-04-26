package com.cg.freelanceapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IAdminDao;
import com.cg.freelanceapp.entities.Admin;
import com.cg.freelanceapp.exceptions.IdNotFoundException;



/**
 * 
 * @author   Akash Sunil Kumar       
 * Description: This is a service implementation class for Admin Entity
 *
 */
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
			Admin admin2=new Admin();
			admin2.setFirstName(admin.getFirstName());
			admin2.setLastName(admin.getLastName());
			admin2.setPassword(admin.getPassword());
	
			return adminDao.save(admin2);
			
		}
		else {
			throw new IdNotFoundException();
		}
		
	}
	
	@Override 
	public Admin findById(Long id)
	{
		if(adminDao.existsById(id))
		{
			return adminDao.findById(id).get();
		}
		else
		{
			throw new IdNotFoundException();
		}
		
	}
	

}
