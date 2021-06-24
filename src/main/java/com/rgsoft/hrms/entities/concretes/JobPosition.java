package com.rgsoft.hrms.entities.concretes;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false, exclude={"jobAdvertisements","experiences"})
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_positions")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements","experiences"})
public class JobPosition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String jobName;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy = "jobPosition")		
	private Set<JobAdvertisement> jobAdvertisements;
	
	@OneToMany(mappedBy = "jobPosition")		
	private Set<Experience> experiences;
}
