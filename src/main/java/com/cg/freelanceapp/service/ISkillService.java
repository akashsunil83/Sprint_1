package com.cg.freelanceapp.service;

import com.cg.freelanceapp.entities.Skill;

public interface ISkillService {

	Skill findById(Long id);

	void remove(Skill skill);

	Skill save(Skill skill);
	
	Skill update(Skill skill);

}
