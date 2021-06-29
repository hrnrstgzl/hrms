package com.rgsoft.hrms.entities.concretes;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false, exclude={"resumes","coverLetters"})
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_seekers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resumes","coverLetters"})
public class JobSeeker extends User {
		
	@Column(name="nat_id")
	@NotBlank(message = "Kimlik numarası alanı boş bırakılamaz")
	@NotNull
	@NotBlank
	private String natId;
	
	@NotBlank(message = "Kimlik numarası alanı boş bırakılamaz")
	@NotNull
	@NotBlank
	@Column(name="first_name")
	private String firstName;
	
	@NotBlank(message = "Kimlik numarası alanı boş bırakılamaz")
	@NotNull
	@NotBlank
	@Column(name="last_name")
	private String lastName;
	
	@NotBlank(message = "Kimlik numarası alanı boş bırakılamaz")
	@NotNull
	@NotBlank
	@Column(name="birthday")
	private String birthday;
	
	@OneToMany(mappedBy = "jobSeeker")
	private Set<Resume> resumes;
	
	@OneToMany(mappedBy = "jobSeeker")
	private Set<CoverLetter> coverLetters;

}
