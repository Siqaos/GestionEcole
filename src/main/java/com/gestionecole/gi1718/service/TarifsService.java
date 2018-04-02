package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Tarifs;

public interface TarifsService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Tarifs> arg0);

	void delete(Tarifs arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Tarifs> findAll();

	Iterable<Tarifs> findAll(Iterable<Integer> arg0);

	Tarifs findOne(Integer arg0);

	<S extends Tarifs> Iterable<S> save(Iterable<S> arg0);

	<S extends Tarifs> S save(S arg0);

}