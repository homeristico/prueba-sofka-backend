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

import com.sofka.app.entity.Historico;
import com.sofka.app.service.HistoricoService;

@RestController
@RequestMapping("/api/historico")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST, RequestMethod.DELETE})
public class HistoricoController {
	
	@Autowired private HistoricoService historicoService;
	
	@GetMapping("/all")
	public List<Historico> getHistoricos(){
		return historicoService.getHistoricos();
	}
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	public Historico saveHistorico(@RequestBody Historico historico) {
		return historicoService.saveHistorico(historico);
	}

}
