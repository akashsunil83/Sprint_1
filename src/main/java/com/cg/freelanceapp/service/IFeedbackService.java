package com.cg.freelanceapp.service;

import java.util.List;

import com.cg.freelanceapp.entities.Feedback;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Recruiter;

public interface IFeedbackService {

	int averageRating(Freelancer freelancer);

	Feedback createFeedback(Recruiter recruiter, Freelancer freelancer, int rating, String review);

	List<Feedback> findFeedbacksByFreelancer(Freelancer freelancer);
}
