package com.example.userzipkin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.userzipkin.dtos.ConsultaCepResponse;
import com.example.userzipkin.dtos.CreateUsuarioRequest;
import com.example.userzipkin.dtos.CreateUsuarioResponse;
import com.example.userzipkin.service.UsuarioService;

@RestController
public class UsuarioController 
{
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping("/usuario")
	@ResponseStatus(value = HttpStatus.CREATED)
	public CreateUsuarioResponse criaUsuario(@RequestBody CreateUsuarioRequest createUsuarioRequest)
	{
		return usuarioService.criaUsuario(createUsuarioRequest);
	}
}
