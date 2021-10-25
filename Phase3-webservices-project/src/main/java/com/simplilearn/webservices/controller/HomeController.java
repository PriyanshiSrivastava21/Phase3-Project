package com.simplilearn.webservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping(value="/")
	public String indexMapping()
	{
		return "Server is up and running";
	}
	@GetMapping(value="/hi")
	public String hiMapping()
	{
		return "Hi all, Today is good day!";
	}

}
