package com.rgsoft.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class Employer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
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
	
	
	@NotBlank(message = "Bu alan boş bırakılamaz")
	@NotNull
	@NotBlank
	@Email(message = "Mail Adresi geçerli değil")
	@Column(name="email")
	private String email;
	
	
	@NotBlank(message = "Bu alan boş bırakılamaz")
	@NotNull
	@NotBlank
	@Column(name="password")
	private String password;
	
	@Column(name="email_validation")
	private boolean emailValidation;
	
	@Column(name="system_validation")
	private boolean systemValidation;
	
	@OneToMany(mappedBy = "employer")		
	private List<JobAdvertisement> jobAdvertisements;
}
