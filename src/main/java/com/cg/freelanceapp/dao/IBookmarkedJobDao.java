package com.cg.freelanceapp.dao;

import java.util.List;

import com.cg.freelanceapp.entities.BookmarkedJob;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Skill;

public interface IBookmarkedJobDao {

	List<BookmarkedJob> findBookmarkedJobsBySkill(Skill skill, Freelancer freelancer);

	BookmarkedJob findById(Long id);

	void remove(BookmarkedJob job);

	BookmarkedJob save(BookmarkedJob job);
	
}
