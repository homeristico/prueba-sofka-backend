package com.sofka.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofka.app.entity.Historico;
import com.sofka.app.repository.HistoricoRepository;

@Service
public class HistoricoService {
	
	@Autowired private HistoricoRepository historicoRepository;
	
	public List<Historico> getHistoricos(){
		return historicoRepository.findAll();
	}
	
	public Historico saveHistorico(Historico historico) {
		return historicoRepository.save(historico);
	}

}
