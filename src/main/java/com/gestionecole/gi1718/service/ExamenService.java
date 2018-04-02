package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Eleve;

public interface ExamenService {

	long count();

	void delete(Eleve arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Eleve> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Eleve> findAll();

	Iterable<Eleve> findAll(Iterable<Integer> arg0);

	Eleve findOne(Integer arg0);

	<S extends Eleve> Iterable<S> save(Iterable<S> arg0);

	<S extends Eleve> S save(S arg0);

}