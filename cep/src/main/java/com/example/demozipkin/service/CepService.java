package com.example.demozipkin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demozipkin.clients.CepClient;
import com.example.demozipkin.dtos.ConsultaViaCepResponse;

@Service
public class CepService 
{
	@Autowired
	CepClient cepClient;
	
	public ConsultaViaCepResponse consultaCep(String cep)
	{
		return cepClient.consultaViaCep(cep);
	}
}
