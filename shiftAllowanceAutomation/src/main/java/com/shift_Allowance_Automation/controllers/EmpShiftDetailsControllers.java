package com.shift_Allowance_Automation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shift_Allowance_Automation.payload.EmpShiftDetailsDto;
import com.shift_Allowance_Automation.services.EmpShiftDetailsService;

@RestController
@RequestMapping("/api/shiftDetails")
public class EmpShiftDetailsControllers {
	
	@Autowired
	private EmpShiftDetailsService empShiftDetailsService;
	
	@PostMapping("/create")
	public ResponseEntity<EmpShiftDetailsDto> createEmpShiftDetails(@RequestBody EmpShiftDetailsDto empShiftDetailsDto)
	{
	   EmpShiftDetailsDto createEmpShiftDetails=this.empShiftDetailsService.createEmpShiftDetails(empShiftDetailsDto);
	   return new ResponseEntity<EmpShiftDetailsDto>(createEmpShiftDetails,HttpStatus.CREATED);
	}
	
	@PutMapping("/{empId}")
	public ResponseEntity<EmpShiftDetailsDto> updateShiftDetails(@RequestBody EmpShiftDetailsDto empShiftDetailsDto, @PathVariable String empId)
	{
		EmpShiftDetailsDto updateShiftDetails=this.empShiftDetailsService.update(empShiftDetailsDto, empId);
		return ResponseEntity.ok(updateShiftDetails);
	}
	

}
