package com.example.userzipkin.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.userzipkin.dtos.ConsultaCepResponse;

@FeignClient(name = "cep") 
public interface CepClient 
{
    @GetMapping("/cep/{cep}")
    ConsultaCepResponse consultaCep(@PathVariable(value="cep") String cep);
}