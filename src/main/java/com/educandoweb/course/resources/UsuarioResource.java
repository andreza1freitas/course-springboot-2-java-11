package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Usuario;

@RestController
@RequestMapping(value = "/users")
public class UsuarioResource {
	
	@GetMapping
	public ResponseEntity<Usuario> findAll() {
		Usuario u = new Usuario(1L, "Maria", "maria@gmail.com", "98459758", "12345");
		return ResponseEntity.ok().body(u);
	}

}