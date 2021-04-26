package com.cg.freelanceapp.dto;

public class JobDTO {
	private long freelancerid;
	private long skillId;
	private long recruiterId;
	
	public JobDTO() {
		super();
	}

	public JobDTO(long freelancerid, long skillId, long recruiterId) {
		super();
		this.freelancerid = freelancerid;
		this.skillId = skillId;
		this.recruiterId = recruiterId;
	}

	public long getFreelancerid() {
		return freelancerid;
	}

	public void setFreelancerid(long freelancerid) {
		this.freelancerid = freelancerid;
	}

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public long getRecruiterId() {
		return recruiterId;
	}

	public void setRecruiterId(long recruiterId) {
		this.recruiterId = recruiterId;
	}

	
	
	
}
