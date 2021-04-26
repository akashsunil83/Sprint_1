package com.cg.freelanceapp.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class SkillExperience {

	@Id
	@Column(name="skill_exp_id")
	Long id;

	@OneToOne
	Skill skill;
	Integer years;

	@ManyToOne(targetEntity = Freelancer.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "freelancer_id")
	Freelancer freelancer;

	public SkillExperience() {
		super();
	}

	public SkillExperience(Long id, Skill skill, Integer years, Freelancer freelancer) {
		super();
		this.id = id;
		this.skill = skill;
		this.years = years;
		this.freelancer = freelancer;
	}

	public Freelancer getFreelancer() {
		return freelancer;
	}

	public Long getId() {
		return id;
	}

	public Skill getSkill() {
		return skill;
	}

	public Integer getYears() {
		return years;
	}

	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

}
