package com.sofka.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "preguntas")
public class Pregunta {
	
	
	
	
	public Pregunta() {
		
	}

	
	public Pregunta(int pregunta_id, String texto, String respuesta, Categoria categoria) {
	
		this.pregunta_id = pregunta_id;
		this.texto = texto;
		this.respuesta = respuesta;
		this.categoria = categoria;
	}




	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pregunta_id")
	private int pregunta_id;
	
	private String texto;
	
	private String respuesta;
	
	@ManyToOne
	@JsonIgnoreProperties("preguntas")
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;
	
	@OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "pregunta")
	@JsonIgnoreProperties("pregunta")
	private List<Respuesta> respuestas;
	
	
	
	//Getters and Setters
	
	

	
	public String getTexto() {
		return texto;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getPregunta_id() {
		return pregunta_id;
	}

	public void setPregunta_id(int pregunta_id) {
		this.pregunta_id = pregunta_id;
	}

	public List<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(List<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}
	
	
	
	

}
