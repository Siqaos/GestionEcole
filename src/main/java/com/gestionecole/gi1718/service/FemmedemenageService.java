package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Femmedemenage;

public interface FemmedemenageService {

	long count();

	void delete(Femmedemenage arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Femmedemenage> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Femmedemenage> findAll();

	Iterable<Femmedemenage> findAll(Iterable<Integer> arg0);

	Femmedemenage findOne(Integer arg0);

	<S extends Femmedemenage> Iterable<S> save(Iterable<S> arg0);

	<S extends Femmedemenage> S save(S arg0);

}