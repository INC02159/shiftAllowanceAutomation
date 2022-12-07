package com.shift_Allowance_Automation;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShiftAllowanceAutomationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShiftAllowanceAutomationApplication.class, args);
	}
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper(); 
	}

}
