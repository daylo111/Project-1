package com.projectduh.Daylon.s.Jewelry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/")
	public String welcomeController() {
		return "Hello shoppers, welcome to my store!";
	}

}
