package com.example.demo.infrastructure.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.example.demo.domain.contracts.infrastructure.ConfigurationService;

@Configuration
public class ConfigService implements ConfigurationService {
	
	@Value("${cs.search.url}")
	private String url;
	
	public String getUrl() {
		return this.url;
	}
}
