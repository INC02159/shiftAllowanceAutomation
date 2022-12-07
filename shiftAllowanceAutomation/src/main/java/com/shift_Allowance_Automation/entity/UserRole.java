package com.shift_Allowance_Automation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="user_role")
public class UserRole {

	@Id
	@Column(name="user_Id")
	private String userId;
	@Column(name="role_Id")
	private String roleId;
	@Column(name="role_name")
	private String roleName;
	@Column(name="user_name")
	private String UserName;
}
