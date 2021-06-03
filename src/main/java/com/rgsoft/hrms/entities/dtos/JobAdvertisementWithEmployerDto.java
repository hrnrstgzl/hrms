package com.rgsoft.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementWithEmployerDto {
	private int  id;
	private String jobPosition;
	private String companyName;
	private int positionNumber;
	private Date releaseDate;
	private Date applicationDeadline;
}
