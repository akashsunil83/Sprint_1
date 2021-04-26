package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.cg.freelanceapp.dao.IAdminDao;
import com.cg.freelanceapp.dao.IFreelancerDao;
import com.cg.freelanceapp.dao.IJobDao;
import com.cg.freelanceapp.dao.IRecruiterDao;
import com.cg.freelanceapp.dao.ISkillDao;
import com.cg.freelanceapp.dto.FreelancerDTO;
import com.cg.freelanceapp.dto.JobDTO;
import com.cg.freelanceapp.dto.RecruiterDTO;
import com.cg.freelanceapp.entities.Admin;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Job;
import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.exceptions.InvalidJobException;
import com.cg.freelanceapp.service.IAdminService;
import com.cg.freelanceapp.service.IBookmarkedFreelancerService;
import com.cg.freelanceapp.service.IFreelancerService;
import com.cg.freelanceapp.service.IJobService;
import com.cg.freelanceapp.service.IRecruiterService;
import com.cg.freelanceapp.service.ISkillService;


/**************************************************************************************
 * @author Akash Sunil Kumar 
 * Description: This is the JUNIT class for Admin and Job module. 
 * Created Date: 24 April, 2021 
 * Version : v1.0.0
 *************************************************************************************/

@SpringBootTest
class OnlineJobPortalApplicationTests {

	@Autowired
	IJobService jobService;
	
	
	@Autowired
	IAdminService adminService;
	
	@Autowired
	IJobDao jobDao;	
	
	@Autowired
	IAdminDao adminDao;
	
	@Autowired
	ISkillDao skillDao;
	
	@Autowired
	ISkillService skillService;
	
	
	@Test
	void testUpdateAdmin() {
	Long id = 1062L;
	Admin admin2 = new Admin();
	admin2.setFirstName("akash");
	adminService.update(id, admin2);
	assertEquals("akash", admin2.getFirstName());
	}
	
	
	@Test
	void testGetAdmin() 
	{
		Admin a= new Admin(1062L,"akash","kumar","12345");
		String a2=a.getFirstName();
		assertEquals(a.getFirstName(),a2);
	}
	
	@Test
	void testSaveAdmin()
	{
		Admin admin2= new Admin(105l,"akash","khan","passwd");
		assertEquals(admin2.getPassword(),adminService.save(admin2).getPassword());
	}
	
	@Test
	void testpostJob()
	{
		JobDTO j2= new JobDTO();
		j2.setSkillId(1L);
		j2.setFreelancerid(1L);
		j2.setRecruiterId(1L);
		assertEquals("Python Skill", jobService.findById(1L).getSkill().getDescription());
	}

}
