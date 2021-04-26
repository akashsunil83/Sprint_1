package com.cg.freelanceapp.dao;

import java.util.List;

import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.entities.Skill;

public interface IBookmarkedFreelancerDao {

	List<BookmarkedFreelancer> findBookmarkedFreelancerBySkill(Skill skill);

	void remove(BookmarkedFreelancer bookmarked);

	BookmarkedFreelancer save(BookmarkedFreelancer bookmarked);
}
