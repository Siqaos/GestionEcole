package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Chauffeur;

public interface ChauffeurService {

	long count();

	void delete(Chauffeur arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Chauffeur> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Chauffeur> findAll();

	Iterable<Chauffeur> findAll(Iterable<Integer> arg0);

	Chauffeur findOne(Integer arg0);

	<S extends Chauffeur> Iterable<S> save(Iterable<S> arg0);

	<S extends Chauffeur> S save(S arg0);

}