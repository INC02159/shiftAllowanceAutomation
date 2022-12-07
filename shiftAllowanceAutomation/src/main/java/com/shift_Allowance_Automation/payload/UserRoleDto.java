package com.shift_Allowance_Automation.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRoleDto {

	private String userId;
	private String roleId;
	private String roleName;
	private String UserName;
}
