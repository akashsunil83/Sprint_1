package com.cg.freelanceapp.dao;

import com.cg.freelanceapp.entities.SkillExperience;

public interface ISkillExperienceDao {
	
	void remove(SkillExperience experience);
	
	SkillExperience save(SkillExperience experience);
	
	SkillExperience update(SkillExperience experience);
	
}
