package com.remediosApi.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remediosApi.demo.remedio.DadosCadastroRemedio;
import com.remediosApi.demo.remedio.Remedio;
import com.remediosApi.demo.remedio.RemedioRepository;

@RestController
@RequestMapping("/remedios")
public class RemedioController {
	
	@Autowired
	private RemedioRepository repository;
	
	@PostMapping
	public DadosCadastroRemedio cadastrar(@RequestBody DadosCadastroRemedio dados) {
		
		repository.save(new Remedio(dados));
		
	}

}
