package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Garde;

public interface GardeService {

	long count();

	void delete(Garde arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Garde> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Garde> findAll();

	Iterable<Garde> findAll(Iterable<Integer> arg0);

	Garde findOne(Integer arg0);

	<S extends Garde> Iterable<S> save(Iterable<S> arg0);

	<S extends Garde> S save(S arg0);

	<S extends Garde> S save(S arg0, String matricule, String matriculeAide);

}