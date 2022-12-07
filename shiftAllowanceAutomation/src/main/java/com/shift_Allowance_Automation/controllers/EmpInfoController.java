package com.shift_Allowance_Automation.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shift_Allowance_Automation.entity.EmpInfo;
import com.shift_Allowance_Automation.payload.EmpInfoDto;
import com.shift_Allowance_Automation.services.AdminService;
//import com.shift_Allowance_Automation.services.AdminService;
import com.shift_Allowance_Automation.services.EmpInfoService;

@RestController
@RequestMapping("/api/empInfo")
public class EmpInfoController {
	
	@Autowired
	private EmpInfoService empInfoService;
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/home")
	public String home()
	{
		return "this is home";
	}
	
	@PostMapping("/create")
	public ResponseEntity<EmpInfoDto> createEmpInfo(@RequestBody EmpInfoDto empInfoDto)
	{
		EmpInfoDto createEmpInfo=this.empInfoService.createEmpInfo(empInfoDto);
		return new ResponseEntity<EmpInfoDto>(createEmpInfo,HttpStatus.CREATED);
	}
	@PutMapping("/{empId}")
	public ResponseEntity<EmpInfoDto> updateEmpInfo(@RequestBody EmpInfoDto empInfoDto, @PathVariable String empId)
	{
		EmpInfoDto updateEmpInfo=this.empInfoService.updateEmpInfo(empInfoDto, empId);
		return ResponseEntity.ok(updateEmpInfo);
	}
	
	
	@GetMapping(value="/getallempdetails/{managerId}" )
	public List<Map<String, Object>> getAllEmployeesDetails(@PathVariable("managerId") String managerId)
	{
		
		System.out.println("Entered into empInfoController*********");
		System.out.println("manaer Id: " +managerId);
		return  this.adminService.findEmpDetailsById(managerId);
	}
       
	  
}
