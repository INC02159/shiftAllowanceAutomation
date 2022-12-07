package com.shift_Allowance_Automation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="emp_Info")
public class EmpInfo {
	@Id
	@Column(name = "emp_id", nullable = false)
	private String empId;
	@Column(name = "emp_name")
	private String emp_name;
	@Column(name = "manager_id",nullable=false)
	private String managerId;
	private String grade;
	@Column(name = "Project_Name")
	private String projectName;
	@Column(name = "Project_Code")
	private String projectCode;
	
}


