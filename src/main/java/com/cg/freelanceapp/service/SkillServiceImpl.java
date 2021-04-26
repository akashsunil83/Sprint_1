package com.cg.freelanceapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.ISkillDao;
import com.cg.freelanceapp.entities.Skill;

@Service
public class SkillServiceImpl implements ISkillService {

	@Autowired
	ISkillDao skillDao;

	@Override
	public Skill findById(Long id) {
		return skillDao.findById(id).get();
	}

	@Override
	public void remove(Skill skill) {
		skillDao.delete(skill);
	}

	@Override
	public Skill save(Skill skill) {

		return skillDao.save(skill);
	}

	@Override
	public Skill update(Skill skill) {
		return skillDao.save(skill);
	}

}