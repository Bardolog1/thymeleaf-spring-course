package com.bardolog.sprinboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/params")
public class ExampleParamController {
	
	@GetMapping("/")
	public String index(){
		return "params/index";
	}

	@GetMapping("/string")
	public String param(@RequestParam(name="text", defaultValue = "sin datos", required = false) String texto,Model model) {
		
		model.addAttribute("resultado", "El parametro enviado es: "+ texto);
		return "params/ver";
	}
	
	@GetMapping("/mix-params")
	public String param(@RequestParam String saludo, @RequestParam Integer numero, Model model) {
		
		model.addAttribute("resultado", "El saludo enviado es: "+ saludo + " el numero es: "+numero) ;
		return "params/ver";
	}
	
	@GetMapping("/mix-params-http-serreq")
	public String param(HttpServletRequest request, Model model) {
		String saludo = request.getParameter("saludo");
		Integer numero = null;
		try {
		 numero = Integer.parseInt(request.getParameter("numero"));
		} catch (NumberFormatException e) {
			numero =0;
			System.out.println("error de formato: "+ e );
		}
		model.addAttribute("resultado", "El saludo enviado es: "+ saludo + " el numero es: "+numero+" (parametros capturados con HttpServletRequest)") ;

		return "params/ver";
	}
	
	
}
