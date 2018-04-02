package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Secretaire;

public interface SecretaireService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Secretaire> arg0);

	void delete(Secretaire arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Secretaire> findAll();

	Iterable<Secretaire> findAll(Iterable<Integer> arg0);

	Secretaire findOne(Integer arg0);

	<S extends Secretaire> Iterable<S> save(Iterable<S> arg0);

	<S extends Secretaire> S save(S arg0);

}