package com.bardolog.sprinboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	
	@GetMapping
	public String home () {
		// redirigimos a la principal
		//return"redirect:/app/";// cambia la url a la del redirect
		return"forward:/app/"; //no cambia la url, pero internamente rediricciona
	}
}
