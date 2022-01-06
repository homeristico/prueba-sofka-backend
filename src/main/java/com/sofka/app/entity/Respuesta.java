package com.sofka.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "respuestas")
public class Respuesta {



	public Respuesta() {
		
	}

	public Respuesta(int respuesta_id, String texto, Pregunta pregunta) {		
		this.respuesta_id = respuesta_id;
		this.texto = texto;		
		this.pregunta = pregunta;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "respuesta_id")
	private int respuesta_id;
	
	private String texto;	
	
	
	@ManyToOne
	@JoinColumn(name = "pregunta_id")
	@JsonIgnoreProperties("respuestas")
	private Pregunta pregunta;
	
	
	
	
	//Getters and Setters

	public int getRespuesta_id() {
		return respuesta_id;
	}

	public void setRespuesta_id(int respuesta_id) {
		this.respuesta_id = respuesta_id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}


	public Pregunta getPregunta() {
		return pregunta;
	}


	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}
	
	

	
	
	

}
