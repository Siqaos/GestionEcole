package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Directeur;

public interface DirecteurService {

	long count();

	void delete(Directeur arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Directeur> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Directeur> findAll();

	Iterable<Directeur> findAll(Iterable<Integer> arg0);

	Directeur findOne(Integer arg0);

	<S extends Directeur> Iterable<S> save(Iterable<S> arg0);

	<S extends Directeur> S save(S arg0);

}