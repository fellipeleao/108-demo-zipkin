package com.example.demozipkin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demozipkin.dtos.ConsultaViaCepResponse;
import com.example.demozipkin.service.CepService;

@RestController
public class CepController 
{
	@Autowired
	CepService cepService;
	
	@GetMapping("/cep/{cep}")
	@ResponseStatus(value = HttpStatus.OK)
	public ConsultaViaCepResponse consultaCep(@PathVariable(value="cep") String cep)
	{
		return cepService.consultaCep(cep);
	}
}
