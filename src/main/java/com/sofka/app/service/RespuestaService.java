package com.sofka.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofka.app.entity.Respuesta;
import com.sofka.app.repository.RespuestaRepository;

@Service
public class RespuestaService {
	
	@Autowired private RespuestaRepository respuestaRepository;
	
	public List<Respuesta> getRespuestas(){
		return respuestaRepository.findAll();
	}
	
	public Respuesta saveRespuesta(Respuesta respuesta) {
		return respuestaRepository.save(respuesta);
	}

}
