package com.cg.freelanceapp.service;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.FreelancerDTO;
import com.cg.freelanceapp.entities.Freelancer;

@Service
public interface IFreelancerService {

	Freelancer findById(Long id);

	Freelancer save(FreelancerDTO freelancerDto);

	Freelancer update(Freelancer freelancer);
}
