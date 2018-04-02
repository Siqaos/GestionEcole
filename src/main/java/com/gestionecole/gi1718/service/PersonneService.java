package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Personne;

public interface PersonneService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Personne> arg0);

	void delete(Personne arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Personne> findAll();

	Iterable<Personne> findAll(Iterable<Integer> arg0);

	Personne findOne(Integer arg0);

	<S extends Personne> Iterable<S> save(Iterable<S> arg0);

	<S extends Personne> S save(S arg0);

}