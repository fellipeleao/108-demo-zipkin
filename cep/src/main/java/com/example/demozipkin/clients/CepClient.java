package com.example.demozipkin.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demozipkin.dtos.ConsultaViaCepResponse;

@FeignClient(name = "cep-viacep", url ="http://viacep.com.br/ws") 
public interface CepClient 
{
    @GetMapping("/{cep}/json/")
    ConsultaViaCepResponse consultaViaCep(@PathVariable(value="cep") String cep);
}