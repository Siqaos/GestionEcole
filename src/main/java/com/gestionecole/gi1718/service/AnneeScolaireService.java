package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Anneescolaire;

public interface AnneeScolaireService {

	long count();

	void delete(Anneescolaire arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Anneescolaire> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Anneescolaire> findAll();

	Iterable<Anneescolaire> findAll(Iterable<Integer> arg0);

	Anneescolaire findOne(Integer arg0);

	<S extends Anneescolaire> Iterable<S> save(Iterable<S> arg0);

	<S extends Anneescolaire> S save(S arg0);

}