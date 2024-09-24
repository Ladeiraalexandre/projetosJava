package com.estudos.screenmatch_frases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.estudos.screenmatch_frases.model.Frase;

public interface FrasesRepository extends JpaRepository<Frase, Long> {
	
	@Query("select f from Frase f order by function('RANDOM') LIMIT 1")
	Frase buscaFraseAleatoria();
	

}
