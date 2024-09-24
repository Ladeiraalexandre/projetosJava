package com.estudos.screenmatch_frases.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.screenmatch_frases.DTO.FraseDTO;
import com.estudos.screenmatch_frases.model.Frase;
import com.estudos.screenmatch_frases.repository.FrasesRepository;

@Service
public class FrasesService {

	@Autowired
	private FrasesRepository repository;
	
	public FraseDTO obterFraseAleatoria() {
		Frase frase = repository.buscaFraseAleatoria();
		return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
	}
	
	

}
