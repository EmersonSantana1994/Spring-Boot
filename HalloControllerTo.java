package com.halloword.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hey")

public class HalloControllerTo {

	@GetMapping
	public String hey() {
		return "Esta semana trabalhamos a mentalidade de persistencia e orientação aos detalhes";
	}
}
