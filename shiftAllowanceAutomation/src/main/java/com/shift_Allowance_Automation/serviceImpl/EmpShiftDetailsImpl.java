package com.shift_Allowance_Automation.serviceImpl;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shift_Allowance_Automation.entity.EmpShiftDetails;
import com.shift_Allowance_Automation.payload.EmpShiftDetailsDto;
import com.shift_Allowance_Automation.repositories.EmpShiftDetailsRepo;
import com.shift_Allowance_Automation.services.EmpShiftDetailsService;

@Service
public class EmpShiftDetailsImpl implements EmpShiftDetailsService {
	Logger logger = LoggerFactory.getLogger(EmpShiftDetailsImpl.class);
	@Autowired
	private EmpShiftDetailsRepo empShiftDetailsRepo;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public EmpShiftDetailsDto createEmpShiftDetails(EmpShiftDetailsDto empShiftDetailsDto) {
      EmpShiftDetails empShiftDetails=this.modelMapper.map(empShiftDetailsDto, EmpShiftDetails.class);
      EmpShiftDetails addEmpShiftDetails=this.empShiftDetailsRepo.save(empShiftDetails);
		logger.error("[EmployeeShiftDetails][EmpShiftDetailsServiceImpl][create]" );
      
		return this.modelMapper.map(addEmpShiftDetails,EmpShiftDetailsDto.class);
	}

	@Override
	public EmpShiftDetailsDto update(EmpShiftDetailsDto empShiftDetailsDto, String empId) {
		EmpShiftDetails empShiftDetails=this.empShiftDetailsRepo.findByEmpId(empId);
		empShiftDetails.setShift(empShiftDetailsDto.getShift());
		empShiftDetails.setDate(empShiftDetailsDto.getDate());
		empShiftDetails.setStartDate(empShiftDetails.getEndDate());
		empShiftDetails.setEndDate(empShiftDetails.getEndDate());
		boolean approve = false;
		empShiftDetails.setApprove(approve);
		empShiftDetails.setApproveBy(empShiftDetailsDto.getApproveBy());
		empShiftDetails.setApproveAt(empShiftDetailsDto.getApproveAt());
		empShiftDetails.setCreatedAt(empShiftDetailsDto.getCreatedAt());
		empShiftDetails.setCreatedBy(empShiftDetailsDto.getCreatedBy());
		empShiftDetails.setUpdatedAt(empShiftDetailsDto.getUpdatedAt());
		empShiftDetails.setUpdatedBy(empShiftDetailsDto.getUpdatedBy());
		EmpShiftDetails updateEmpShift=new EmpShiftDetails();
		try
		{
			updateEmpShift=this.empShiftDetailsRepo.save(empShiftDetails);
		}
		catch (Exception e) {
			logger.error("[EmployeeShiftDetails][EmpShiftDetailsServiceImpl][update]"+ e.getMessage() );
			e.printStackTrace();
			
		}
		return this.modelMapper.map(updateEmpShift, EmpShiftDetailsDto.class);
	}

}
