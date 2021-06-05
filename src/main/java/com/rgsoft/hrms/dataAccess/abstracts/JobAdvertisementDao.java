package com.rgsoft.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rgsoft.hrms.entities.concretes.JobAdvertisement;
import com.rgsoft.hrms.entities.dtos.JobAdvertisementWithEmployerDto;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	List<JobAdvertisement> getByIsActive(boolean isActive);
	List<JobAdvertisement> getByIsActive(boolean isActive,Sort sort);
	List<JobAdvertisement> getByIsActiveAndEmployer_Id(boolean isActive,int employerId);
	
	@Query("Select new com.rgsoft.hrms.entities.dtos.JobAdvertisementWithEmployerDto "
			+"(j.id, p.jobName, e.companyName, j.positionNumber, j.releaseDate, j.applicationDeadline) "
			+"From JobAdvertisement j Inner Join j.employer e Inner Join j.jobPosition p")
	List<JobAdvertisementWithEmployerDto> getJobAdvertisementWithEmployerDetails();
	
	/*@Query("Select new com.rgsoft.hrms.entities.dtos.JobAdvertisementWithEmployerDto "
			+"(j.id, p.jobName, e.companyName, j.positionNumber, j.releaseDate, j.applicationDeadline) "
			+"From JobAdvertisement j Inner Join j.employer e Inner Join j.jobPosition p")*/
	
	
	@Query("Select new com.rgsoft.hrms.entities.dtos.JobAdvertisementWithEmployerDto "
			+"(j.id, p.jobName, e.companyName, j.positionNumber, j.releaseDate, j.applicationDeadline) "
			+"From JobAdvertisement j Inner Join j.employer e Inner Join j.jobPosition p"
			+ " where e.id=:id")
	List<JobAdvertisementWithEmployerDto> getJobAdvertisementWithEmployerDetailsByEmployerId(@Param("id") int id);
	
	@Query("Select new com.rgsoft.hrms.entities.dtos.JobAdvertisementWithEmployerDto "
			+"(j.id, p.jobName, e.companyName, j.positionNumber, j.releaseDate, j.applicationDeadline) "
			+"From JobAdvertisement j Inner Join j.employer e Inner Join j.jobPosition p"
			+ " where e.id=:id")
	List<JobAdvertisementWithEmployerDto> getJobAdvertisementWithEmployerDetailsByEmployerIdSorted(@Param("id") int id,Sort sort);
}
