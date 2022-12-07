package com.shift_Allowance_Automation.services;


import com.shift_Allowance_Automation.payload.EmpShiftDetailsDto;

public interface EmpShiftDetailsService {

	EmpShiftDetailsDto createEmpShiftDetails(EmpShiftDetailsDto empShiftDetailsDto);
	EmpShiftDetailsDto update(EmpShiftDetailsDto empShiftDetailsDto, String empId);
	
}
