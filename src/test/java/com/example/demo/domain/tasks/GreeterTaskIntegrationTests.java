package com.example.demo.domain.tasks;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.DemoApplication;
import com.example.demo.infrastructure.services.ConfigService;

@RunWith(SpringRunner.class)
@ActiveProfiles("unit")
@SpringBootTest(classes=DemoApplication.class)
public class GreeterTaskIntegrationTests {
	
	@Autowired
	private ConfigService configService;
	
	@Test
	public void greet() {
		final GreeterTask task = new GreeterTask(configService);
		
		final String expectedGreeting = "https://yahoo.com";
		final String actualGreeting = task.greet("testing");
		
		assertEquals(expectedGreeting, actualGreeting);
	}

}
