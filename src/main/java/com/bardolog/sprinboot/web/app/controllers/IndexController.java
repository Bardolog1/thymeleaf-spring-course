package com.bardolog.sprinboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bardolog.sprinboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${texto.indexcontroller.index.titulo}")
	private String tituloIndex;
	
	@Value("${texto.indexcontroller.listar.titulo}")
	private String tituloListar;
	
	
	
	
	@GetMapping({"/index", "", "/"})
	public String index(Model model) {
		model.addAttribute("titulo", tituloIndex);
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
	
		Usuario user = new Usuario();
		user.setNombre("Libardo");
		user.setApellido("Lozano");
		//user.setEmail("liloga.dev@gmail.com"); 
		model.addAttribute("titulo", user.getNombre() + " "+ user.getApellido() );
		model.addAttribute("usuario", user);

		return "perfil";
	}
	
	
	@GetMapping("/listar")
	public String listtar(Model model) {
		model.addAttribute("titulo", tituloListar);		
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> populateUsers(){
		List<Usuario> users = new ArrayList<>();

		users.add(new Usuario("Libardo", "Lozano","lilozanoga@unal.edu.co"));
		users.add(new Usuario("Diana", "Cuervo", "dcuervo29@ctb.edu.co"));
		users.add(new Usuario("Camilo", "Cuervo", "ccuervo15@gmail.com"));
		users.add(new Usuario("Mariana", "Lozano Cuervo", null));
		users.add(new Usuario("Tomas", "Lozano Cuervo", null));
		
		return users;
	}
	
	
	

}
