package com.example.demo.presentation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.contracts.presentation.GreeterPresenter;

@RestController
public class GreeterController {
	
	private final GreeterPresenter presenter;
	
	public GreeterController(final GreeterPresenter presenter) {
		this.presenter = presenter;
	}
	
	@GetMapping("/greet/{fullName}")
	public String hello(@PathVariable final String fullName) {
		return this.presenter.greet(fullName);
	}
}
