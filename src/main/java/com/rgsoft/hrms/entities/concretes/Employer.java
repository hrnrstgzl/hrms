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
@EqualsAndHashCode(callSuper = false, exclude={"jobAdvertisements"})
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
@Table(name = "employers")
public class Employer extends User{
	
	@NotBlank(message = "Bu alan boş bırakılamaz")
	@NotNull
	@NotBlank
	@Column(name="company_name")
	private String companyName;
	
	@NotBlank(message = "Bu alan boş bırakılamaz")
	@NotNull
	@NotBlank
	@Column(name="website")
	private String website;
	
	@NotBlank(message = "Bu alan boş bırakılamaz")
	@NotNull
	@NotBlank
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="system_validation")
	private boolean systemValidation;
	
	@OneToMany(mappedBy = "employer")		
	private Set<JobAdvertisement> jobAdvertisements;
}
