package com.rgsoft.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_seekers")
public class JobSeeker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
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
	
	@NotBlank(message = "Kimlik numarası alanı boş bırakılamaz")
	@NotNull
	@NotBlank
	@Email
	@Column(name="email")
	private String email;
	
	@NotBlank(message = "Kimlik numarası alanı boş bırakılamaz")
	@NotNull
	@NotBlank
	@Column(name="password")
	private String password;
	
	@NotBlank(message = "Kimlik numarası alanı boş bırakılamaz")
	@NotNull
	@NotBlank
	@Column(name="email_validation")
	private boolean emailValidation;
}
