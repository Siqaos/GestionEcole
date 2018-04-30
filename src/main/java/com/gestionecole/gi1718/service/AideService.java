package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Aide;

public interface AideService {

	long count();

	void delete(Aide arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Aide> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Aide> findAll();

	Iterable<Aide> findAll(Iterable<Integer> arg0);

	Aide findOne(Integer arg0);

	<S extends Aide> Iterable<S> save(Iterable<S> arg0);

	<S extends Aide> S save(S arg0);

	Aide findByMatricule(String matricule);

}