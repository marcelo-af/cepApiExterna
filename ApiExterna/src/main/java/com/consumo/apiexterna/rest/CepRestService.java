package com.consumo.apiexterna.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.consumo.apiexterna.interfaces.CepService;
import com.consumo.apiexterna.model.Endereco;

@RestController 
public class CepRestService {

	//Essa classe foi criada para poder consumir o serviço de cep descito na interface
	
	@Autowired
	private CepService cepService;
	
	@GetMapping("/{cep}")
	public ResponseEntity<Endereco> getCep(@PathVariable String cep){
		
		Endereco endereco = cepService.buscaEnderecoPorCep(cep);
		
		return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build();
	}
	
	
	
	
}
