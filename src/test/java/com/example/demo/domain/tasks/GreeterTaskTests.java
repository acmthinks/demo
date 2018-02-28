package com.example.demo.domain.tasks;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.example.demo.infrastructure.services.ConfigService;

public class GreeterTaskTests {
	
	@Test
	public void greet() {
		final ConfigService mockConfigService = mock(ConfigService.class);
		
		when(mockConfigService.getUrl()).thenReturn("tada");
		
		final GreeterTask task = new GreeterTask(mockConfigService);
		
		final String expectedGreeting = "tada";
		final String actualGreeting = task.greet("testing");
		
		assertEquals(expectedGreeting, actualGreeting);
	}

}
