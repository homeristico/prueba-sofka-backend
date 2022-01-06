package com.sofka.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sofka.app.entity.Historico;

@Repository
public interface HistoricoRepository extends JpaRepository<Historico, Integer> {

}
