package com.estudos.screenmatch_frases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.screenmatch_frases.DTO.FraseDTO;
import com.estudos.screenmatch_frases.services.FrasesService;

@RestController
public class FrasesController {
	
	@Autowired
	private FrasesService servico;
	
	@GetMapping("/series/frases")
	public FraseDTO obterFraseAleatoria() {
		return servico.obterFraseAleatoria();
	}

}
