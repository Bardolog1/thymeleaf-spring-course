package com.bardolog.sprinboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/variables")
@Controller
public class VariablesPathController {
	
		@GetMapping({"/", "/index"})
		public String index(Model model) {
			return "variables/index";
		}

		@GetMapping("/string/{texto}")
		public String variables(@PathVariable(name="texto") String texto, Model model) {
			model.addAttribute("titulo", "Recibiendo param por @PathVariable");
			model.addAttribute("resultado", "Se recibio de path variable: "+texto);
			return "variables/ver";
		}
		
		@GetMapping("/mix-params/{texto}/{numero}")
		public String variables(@PathVariable(name="texto") String texto,@PathVariable Integer numero, Model model) {
			model.addAttribute("titulo", "Recibiendo param por @PathVariable");
			model.addAttribute("resultado", "Se recibio de path variable: "+texto + " y el numero : "+ numero);
			return "variables/ver";
		}
}
