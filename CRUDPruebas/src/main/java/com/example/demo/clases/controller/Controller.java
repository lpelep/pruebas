package com.example.demo.clases.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.clases.Persona;

@RestController
@RequestMapping("/persona")
public class Controller {

    
    @PostMapping("/saludo")
    public ResponseEntity<?> saludar (@RequestBody Persona persona) {
	
	return ResponseEntity.ok().body("Hola " + persona.getNombre() + " " + persona.getApellidos());
    }
    
    @GetMapping("/inicio")
    public ResponseEntity<?> inicio () {
	
	return ResponseEntity.ok().body("Iniciado");
    }
}

