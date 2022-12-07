package com.shift_Allowance_Automation.serviceImpl;


import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shift_Allowance_Automation.entity.EmpInfo;
import com.shift_Allowance_Automation.payload.EmpInfoDto;
import com.shift_Allowance_Automation.repositories.EmpInfoRepo;
import com.shift_Allowance_Automation.services.EmpInfoService;

@Service
public class EmpInfoServiceImpl implements EmpInfoService {
	Logger logger = LoggerFactory.getLogger(EmpInfoServiceImpl.class);

	@Autowired
	private EmpInfoRepo empInfoRepo;
	
	@Autowired
	private ModelMapper modelmapper;
	@Override
	public EmpInfoDto createEmpInfo(EmpInfoDto empInfoDto) {
		EmpInfo empInfo=this.modelmapper.map(empInfoDto, EmpInfo.class);
		EmpInfo addEmpInfo=this.empInfoRepo.save(empInfo);
		logger.error("[EmployeeInfo][EmpInfoServiceImpl][create]" );
		return this.modelmapper.map(addEmpInfo, EmpInfoDto.class);
	}
	
	@Override
	public EmpInfoDto updateEmpInfo(EmpInfoDto empInfoDto,String empId)  {
		EmpInfo empInfo=this.empInfoRepo.findByEmpId(empId);
		empInfo.setEmp_name(empInfoDto.getEmp_name());
		empInfo.setGrade(empInfoDto.getGrade());
		empInfo.setManagerId(empInfoDto.getManagerId());
		empInfo.setProjectCode(empInfoDto.getProjectCode());
		empInfo.setProjectName(empInfo.getProjectName());
		EmpInfo updateEmp=new EmpInfo();
		try{
			updateEmp=this.empInfoRepo.save(empInfo);
		}
		catch (Exception e) {
			logger.error("[EmployeeInfo][EmpInfoServiceImpl][update]"+ e.getMessage() );
			
			e.printStackTrace();
		}
			return this.modelmapper.map(updateEmp, EmpInfoDto.class);

	}

}
