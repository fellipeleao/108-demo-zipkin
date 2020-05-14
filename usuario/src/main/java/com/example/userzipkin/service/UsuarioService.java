package com.example.userzipkin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userzipkin.clients.CepClient;
import com.example.userzipkin.dtos.CreateUsuarioRequest;
import com.example.userzipkin.dtos.CreateUsuarioResponse;
import com.example.userzipkin.dtos.ConsultaCepResponse;

@Service
public class UsuarioService 
{
	@Autowired
	CepClient cepClient;
	
	public CreateUsuarioResponse criaUsuario(CreateUsuarioRequest createUsuarioRequest)
	{
		ConsultaCepResponse cep = cepClient.consultaCep(createUsuarioRequest.getCep());
		
		CreateUsuarioResponse userResponse = new CreateUsuarioResponse();
		userResponse.setNome(createUsuarioRequest.getNome());
		userResponse.setEndereco(cep.getLogradouro());
		
		return userResponse;
	}
}
