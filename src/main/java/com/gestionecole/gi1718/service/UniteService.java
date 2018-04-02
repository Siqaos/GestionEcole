package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Unite;

public interface UniteService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Unite> arg0);

	void delete(Unite arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Unite> findAll();

	Iterable<Unite> findAll(Iterable<Integer> arg0);

	Unite findOne(Integer arg0);

	<S extends Unite> Iterable<S> save(Iterable<S> arg0);

	<S extends Unite> S save(S arg0);

}