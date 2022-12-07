package com.shift_Allowance_Automation.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="emp_shift_details")
public class EmpShiftDetails {
	@Id
	@Column(name = "EMP_ID", nullable = false)
	private String empId;
	@Column(name="shift_type")
	private String shift;
	private Date date;
	@Column(name="Wfo_Wfh")
	private String workMode;
	@Column(name = "Start_Date")
	private Date startDate;
	@Column(name = "End_Date")
	private Date endDate;
	@Column(name = "Approve")
	private boolean approve;
	@Column(name = "Approve_By")
	private String approveBy;
	@Column(name="Approve_At")
	private Date approveAt;
	@Column(name = "Updated_At")
	private Date updatedAt;
	@Column(name = "Updated_By")
	private String updatedBy;
	@Column(name = "Created_By")
	private String createdBy;
	@Column(name = "Created_At")
	private Date createdAt;
//	@OneToOne
//	private EmpInfo empInfo;

}
