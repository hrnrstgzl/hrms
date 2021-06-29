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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="education")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resume"})
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="begin_date")
	private Date beginDate;
	
	@Column(name="graduate_date")
	private Date graduateDate;
	
	
	@ManyToOne()
	@JoinColumn(name="resume_id")
	private Resume resume;
	
	@ManyToOne()
	@JoinColumn(name="department_id")
	private Department department;
}
