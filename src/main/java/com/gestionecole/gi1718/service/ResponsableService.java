package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Responsable;

public interface ResponsableService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Responsable> arg0);

	void delete(Responsable arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Responsable> findAll();

	Iterable<Responsable> findAll(Iterable<Integer> arg0);

	Responsable findOne(Integer arg0);

	<S extends Responsable> Iterable<S> save(Iterable<S> arg0);

	<S extends Responsable> S save(S arg0);

}