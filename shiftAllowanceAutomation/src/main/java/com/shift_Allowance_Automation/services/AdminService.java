package com.shift_Allowance_Automation.services;

import java.util.List;
import java.util.Map;

public interface AdminService {

	
 	List<Map<String, Object>> findEmpDetailsById(String managerId);
	//List<EmpInfo> getEmployees(EmpInfo managerId);
}
