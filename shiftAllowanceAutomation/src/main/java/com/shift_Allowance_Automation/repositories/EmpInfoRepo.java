package com.shift_Allowance_Automation.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import com.shift_Allowance_Automation.entity.EmpInfo;

@Transactional(readOnly = true)

public interface EmpInfoRepo extends JpaRepository<EmpInfo, String>{
	
	EmpInfo findByEmpId(String empId);

	//List<EmpInfo> findEmpDetailsById(String managerId);

	@Query(value="select emp.emp_id,emp.date,emp.shift_type from emp_shift_details emp inner join emp_info on "
			+ "emp.emp_id=emp_info.emp_id where emp_info.manager_id=:managerId" ,nativeQuery=true)
	List<Map<String, Object>> findEmpDetailsById(@Param(value = "managerId") String managerId);

	
//	@Query(value="select emp_shift_details.emp_id, emp_shift_details.wfo_wfh ,emp_shift_details.date, emp_shift_details.approve_at,emp_shift_details.approve_by, emp_shift_details.created_by, emp_shift_details.approve from shift_allowance_auto.emp_shift_details  inner join shift_allowance_auto.emp_info on emp_shift_details.emp_id=emp_info.emp_id where emp_info.manager_id=managerId;" ,nativeQuery=true)
//	List<EmpInfo> findEmpDetailsById(String managerId);
	
	

}

