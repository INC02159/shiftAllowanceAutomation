package com.shift_Allowance_Automation.services;


import com.shift_Allowance_Automation.payload.EmpInfoDto;

public interface EmpInfoService {
	
EmpInfoDto createEmpInfo(EmpInfoDto empInfoDto);

EmpInfoDto updateEmpInfo(EmpInfoDto empInfoDto,String empId);
}
