package com.sofka.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categorias")
public class Categoria {
	
	
	
	public Categoria() {
		
	}	
	

	public Categoria(int categoria_id, String nombre, int puntos) {		
		this.categoria_id = categoria_id;
		this.nombre = nombre;
		this.puntos = puntos;
	}


	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categoria_id")
	private int categoria_id;
	
	private String nombre;
	
	private int puntos;
	
	@OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "categoria")
	@JsonIgnoreProperties("categoria")
	private List<Pregunta> preguntas;
	
	
	
	
	
	// Getters and Setters

	public int getId() {
		return categoria_id;
	}

	public void setId(int id) {
		this.categoria_id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}


	public List<Pregunta> getPreguntas() {
		return preguntas;
	}


	public void setPreguntas(List<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}
	
	
	
	
	
	

}
