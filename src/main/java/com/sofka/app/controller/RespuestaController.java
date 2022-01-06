package com.sofka.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sofka.app.entity.Respuesta;
import com.sofka.app.service.RespuestaService;

@RestController
@RequestMapping("/api/respuesta")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class RespuestaController {
	
	@Autowired private RespuestaService respuestaService;
	
	@GetMapping("/all")
	public List<Respuesta> getRespuesta(){
		return respuestaService.getRespuestas();
	}
	
	@PostMapping("/save")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Respuesta saveRespuesta(@RequestBody Respuesta respuesta) {
		return respuestaService.saveRespuesta(respuesta);
	}
	

}
