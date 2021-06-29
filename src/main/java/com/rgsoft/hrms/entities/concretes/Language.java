package com.rgsoft.hrms.entities.concretes;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@EqualsAndHashCode(callSuper = false, exclude={"resumeLanguages"})
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="languages")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resumeLanguages"})
public class Language {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "language")
	private Set<ResumeLanguage> resumeLanguages;
}
