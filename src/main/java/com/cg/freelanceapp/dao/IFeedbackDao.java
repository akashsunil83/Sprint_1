package com.cg.freelanceapp.dao;

import java.util.List;

import com.cg.freelanceapp.entities.Feedback;
import com.cg.freelanceapp.entities.Freelancer;

public interface IFeedbackDao {
	
	int averageRating(Freelancer freelancer);
	Feedback findById(Long id);
	List<Feedback> findFeedbacksByFreelancer(Freelancer freelancer);
	Feedback save(Feedback feedback);
	Feedback update(Feedback feedback);
}
