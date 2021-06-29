package com.rgsoft.hrms.entities.concretes;

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
@Table(name="resume_language")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resume"})
public class ResumeLanguage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name = "level")
	private int level;
	
	@ManyToOne
	@JoinColumn(name="language_id")
	private Language language;
	
	@ManyToOne
	@JoinColumn(name="resume_id")
	private Resume resume;
}
