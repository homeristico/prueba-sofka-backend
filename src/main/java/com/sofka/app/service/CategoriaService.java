package com.sofka.app.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofka.app.entity.Categoria;
import com.sofka.app.entity.Pregunta;
import com.sofka.app.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired private CategoriaRepository categoriaRepository;
	
	public List<Categoria> getCategorias() {
		return categoriaRepository.findAll();
	}
	
	public Categoria saveCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	public Pregunta getCategoria(int id) {
		List<Pregunta> preguntas = categoriaRepository.findById(id).get().getPreguntas();
		int cantidadPreguntas = preguntas.size();		
		Random random = new Random();
		int indice = random.nextInt(cantidadPreguntas);		
		return preguntas.get(indice);
	}
}
