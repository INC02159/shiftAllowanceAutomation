package com.shift_Allowance_Automation.payload;

import java.util.Date;

import com.shift_Allowance_Automation.entity.EmpInfo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmpShiftDetailsDto {

private String empId;
	
	private Date date;
	private String shift;
	private String workMode;
	private Date startDate;
	private Date endDate;
	private boolean approve;
	private String approveBy;
	private Date approveAt;
	private Date updatedAt;
	private String updatedBy;
	private String createdBy;
	private Date createdAt;
	//private EmpInfo empInfo;
}
