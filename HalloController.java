package com.halloword.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

////http://localhost:8080/hallo

@RestController
@RequestMapping("/hallo")
public class HalloController {

	@GetMapping
	public String hello() {
		return "Hallo Generation!!!";
	}

}
