package com.shift_Allowance_Automation.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmpInfoDto {

	private String empId;
	private String emp_name;
	private String managerId;
	private String grade;
	private String projectName;
	private String projectCode;
}
