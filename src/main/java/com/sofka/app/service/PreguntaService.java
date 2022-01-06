package com.sofka.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofka.app.entity.Pregunta;
import com.sofka.app.repository.PreguntaRepository;

@Service
public class PreguntaService {
	
	@Autowired private PreguntaRepository preguntaRepository;
	
	public List<Pregunta> getPreguntas(){
		return preguntaRepository.findAll();
	}
	
	public Pregunta savePregunta(Pregunta pregunta) {
		return preguntaRepository.save(pregunta);
	}
	
	public Optional<Pregunta> getPregunta(int id) {
		return preguntaRepository.findById(id);
	}

}
