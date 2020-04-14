package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.limitsConfiguration;

@RestController	
public class LimitsconfigurationController {
	
	@Autowired Configuration configuration;
	
	@GetMapping("/limits")
	public limitsConfiguration retrievelimitsFromConfiguration()
	{
		return new limitsConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}

}
