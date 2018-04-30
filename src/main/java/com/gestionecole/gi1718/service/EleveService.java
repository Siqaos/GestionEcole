package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gestionecole.gi1718.entites.Eleve;

public interface EleveService {

	void delete(Eleve arg0);

	void delete(int arg0);

	List<Eleve> findAll();

	Page<Eleve> findAll(Pageable arg0);

	Eleve findOne(int arg0);

	<S extends Eleve> S save(S arg0);

	void saveEleve(Eleve e);

	Page<Eleve> chercherEleves(String x, Pageable pageable);

	Eleve findByMatricule(String arg0);

}