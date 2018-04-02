package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Inscription;

public interface InscriptionService {

	long count();

	void delete(Inscription arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Inscription> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Inscription> findAll();

	Iterable<Inscription> findAll(Iterable<Integer> arg0);

	Inscription findOne(Integer arg0);

	<S extends Inscription> Iterable<S> save(Iterable<S> arg0);

	<S extends Inscription> S save(S arg0);

}