package com.rgsoft.hrms.entities.concretes;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false, exclude={"experiences","educations","resumeLanguages","havingSkills"})
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "resumes")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Resume {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="photo")
	private String photo;
	
	@Column(name="github_link")
	private String githubLink;
	
	@Column(name="linkedin_link")
	private String linkedinLink;
	
	@ManyToOne()
	@JoinColumn(name="job_seeker_id")
	private JobSeeker jobSeeker;
	
	@OneToMany(mappedBy ="resume")
	private Set<Experience> experiences;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy ="resume")
	private Set<Education> educations;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "resume")
	private Set<ResumeLanguage> resumeLanguages;
	
	@ManyToMany
	@JoinTable(name="resume_skill",
	joinColumns = @JoinColumn(name = "resume_id"),inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private Set<Skill> havingSkills;
	
	public void addSkill(Skill skill) {
		this.havingSkills.add(skill);
	}
	
}
