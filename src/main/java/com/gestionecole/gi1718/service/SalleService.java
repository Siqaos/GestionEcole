package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Salle;

public interface SalleService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Salle> arg0);

	void delete(Salle arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Salle> findAll();

	Iterable<Salle> findAll(Iterable<Integer> arg0);

	Salle findOne(Integer arg0);

	<S extends Salle> Iterable<S> save(Iterable<S> arg0);

	<S extends Salle> S save(S arg0);

}