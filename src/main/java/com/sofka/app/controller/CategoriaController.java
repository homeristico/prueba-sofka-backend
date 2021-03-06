package com.sofka.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sofka.app.entity.Categoria;
import com.sofka.app.entity.Pregunta;
import com.sofka.app.service.CategoriaService;

@RestController
@RequestMapping("/api/categoria")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST,RequestMethod.PUT, RequestMethod.DELETE})
public class CategoriaController {
	
	@Autowired private CategoriaService categoriaService;
	
	@GetMapping("/all")
	public List<Categoria> getCategorias(){
		return categoriaService.getCategorias();
	}
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria saveCategoria(@RequestBody Categoria categoria) {
		return categoriaService.saveCategoria(categoria);
	}
	
	@GetMapping("/{id}")
	public Pregunta getCategoria(@PathVariable int id) {
		return categoriaService.getCategoria(id);
	}

}
