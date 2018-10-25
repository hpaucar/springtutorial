package com.midominio.springboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String hola(Model model){
		model.addAttribute("titulo", "Hola Mundo :)");
		
		return "hola";
	}
	
	@GetMapping("/datos")
	public String actionDatos(Model model){
		model.addAttribute("nombre","Juan Gabriel");
		model.addAttribute("apellidos","Soto Mayor");
		
		return "datos";
	}
	
	@GetMapping("/direccion")
	public String actionDireccion(Model model){
		model.addAttribute("direccion","Av. Las Casuarinas");
		model.addAttribute("ciudad","Lima-Perú");
		
		return "direccion";
	}
	
}
