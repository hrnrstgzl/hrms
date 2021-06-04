package com.rgsoft.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_advertisements")
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@NotBlank(message = "Bu alan boş bırakılamaz")
	@NotNull
	@NotBlank
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	
	@NotBlank(message = "Bu alan boş bırakılamaz")
	@NotNull
	@NotBlank
	@Column(name="position_number")
	private int positionNumber;
	
	
	@NotBlank(message = "Bu alan boş bırakılamaz")
	@NotNull
	@NotBlank
	@Column(name="release_date")
	private Date releaseDate;
	
	
	@NotBlank(message = "Bu alan boş bırakılamaz")
	@NotNull
	@NotBlank
	@Column(name="application_deadline")
	private Date applicationDeadline;
	
	@Column(name="is_active")
	private boolean isActive;
	
	
	@NotBlank(message = "Bu alan boş bırakılamaz")
	@NotNull
	@NotBlank
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne()
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name="job_position_id")
	private JobPosition jobPosition;
	
}
