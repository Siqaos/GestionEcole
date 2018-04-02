package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Devoir;

public interface DevoirService {

	long count();

	void delete(Devoir arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Devoir> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Devoir> findAll();

	Iterable<Devoir> findAll(Iterable<Integer> arg0);

	Devoir findOne(Integer arg0);

	<S extends Devoir> Iterable<S> save(Iterable<S> arg0);

	<S extends Devoir> S save(S arg0);

}