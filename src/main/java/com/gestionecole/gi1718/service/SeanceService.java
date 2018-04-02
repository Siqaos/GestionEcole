package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Seance;

public interface SeanceService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Seance> arg0);

	void delete(Seance arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Seance> findAll();

	Iterable<Seance> findAll(Iterable<Integer> arg0);

	Seance findOne(Integer arg0);

	<S extends Seance> Iterable<S> save(Iterable<S> arg0);

	<S extends Seance> S save(S arg0);

}