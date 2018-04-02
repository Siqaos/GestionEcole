package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Niveau;

public interface NiveauService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Niveau> arg0);

	void delete(Niveau arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Niveau> findAll();

	Iterable<Niveau> findAll(Iterable<Integer> arg0);

	Niveau findOne(Integer arg0);

	<S extends Niveau> Iterable<S> save(Iterable<S> arg0);

	<S extends Niveau> S save(S arg0);

}