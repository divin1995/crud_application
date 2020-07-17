package com.dvr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public String HomeTrafficDirector()
	{
		return "Hello Test";
	}
}
