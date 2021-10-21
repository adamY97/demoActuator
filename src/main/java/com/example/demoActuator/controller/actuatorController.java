package com.example.demoActuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class actuatorController {
	
	@GetMapping("/nombre/{nombre}")
	public String nombre(@PathVariable String nombre) {
		return "Bienvenido " + nombre;
	}
	
	@GetMapping("/nombre/{nombre}/{apellidos}")
	public String nombreApellidos(@PathVariable String nombre, @PathVariable String apellidos) {
		return "Bienvenido " + nombre + " " + apellidos;
	}

}
