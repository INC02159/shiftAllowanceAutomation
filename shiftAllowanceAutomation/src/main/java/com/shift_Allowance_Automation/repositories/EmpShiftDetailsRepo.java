package com.shift_Allowance_Automation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shift_Allowance_Automation.entity.EmpShiftDetails;

public interface EmpShiftDetailsRepo extends JpaRepository<EmpShiftDetails,String>{
	EmpShiftDetails findByEmpId(String empId);


}
