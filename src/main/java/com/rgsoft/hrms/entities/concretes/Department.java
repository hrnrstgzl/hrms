package com.rgsoft.hrms.entities.concretes;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false, exclude={"educations"})
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="departments")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","educations"})
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@ManyToOne()
	@JoinColumn(name="school_id")
	private School school;
	
	@OneToMany(mappedBy ="department")
	private Set<Education> educations;
	
}
