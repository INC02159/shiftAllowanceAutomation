package com.shift_Allowance_Automation.serviceImpl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.shift_Allowance_Automation.entity.EmpInfo;
import com.shift_Allowance_Automation.entity.EmpShiftDetails;
import com.shift_Allowance_Automation.payload.EmpInfoDto;
import com.shift_Allowance_Automation.repositories.EmpInfoRepo;
import com.shift_Allowance_Automation.repositories.EmpShiftDetailsRepo;
import com.shift_Allowance_Automation.services.AdminService;

@Service

public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private EmpInfoRepo empInfoRepo;
	
	@Autowired
	private ModelMapper modelmapper;
	
	@Autowired
	private EmpShiftDetailsRepo empShiftDetailsRepo;

	private Date date;

	/*@Override
	public List<EmpInfoDto> getEmployees() {
		List<EmpInfo> empInfo=this.empInfoRepo.findAll();
		List<EmpInfoDto> empInfoDto=empInfo.stream().map((emp)->this.modelmapper.map(emp, EmpInfoDto.class)).collect(Collectors.toList());
		
		return null;
	}*/
//
	@Override
	public List<Map<String, Object>> findEmpDetailsById(String managerId) {
		System.out.println("this is service");
		//List<EmpInfo> empInfo=empInfoRepo.findEmpDetailsById(managerId);	
		List<Map<String,Object>> listOfemp=empInfoRepo.findEmpDetailsById(managerId);
//		List<EmpInfo> emp=empInfo.stream().collect(Collectors.toList());
		
//		return emp;
		System.out.println("hello");
		for(Map<String,Object> emp1: listOfemp)
		//return listOfemp;
		//for(List<Map<String,Object>> emp1
		{
			//emp1.entrySet();
			System.out.println(emp1.entrySet());
		}
		return listOfemp;
		
	}
	
//	@Override
//	public List<EmpInfo> getEmployees(String managerId) {
//		 
//		return empInfoRepo.findEmpDetailsById(managerId);
//	}

}
