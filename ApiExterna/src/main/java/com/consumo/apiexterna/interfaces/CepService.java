package com.consumo.apiexterna.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.consumo.apiexterna.model.Endereco;

@FeignClient(url = "https://viacep.com.br/ws" , name = "viacep")
public interface CepService {	
	//Essa interface irá fazer a chamada do serviço atraves do @FeignClient
	
	@GetMapping("{cep}/json")
	Endereco buscaEnderecoPorCep(@PathVariable("cep") String cep);
}
