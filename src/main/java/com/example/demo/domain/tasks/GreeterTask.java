package com.example.demo.domain.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.contracts.infrastructure.ConfigurationService;
import com.example.demo.domain.contracts.presentation.GreeterPresenter;

@Component
public class GreeterTask implements GreeterPresenter {
	
	private final ConfigurationService configService;
	
	public GreeterTask(final ConfigurationService configService){
		this.configService = configService;
	}
	
	public String greet(final String name) {
		return this.configService.getUrl();
	}
}
