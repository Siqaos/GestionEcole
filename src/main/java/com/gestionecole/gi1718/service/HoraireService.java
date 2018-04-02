package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Horaire;

public interface HoraireService {

	long count();

	void delete(Horaire arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Horaire> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Horaire> findAll();

	Iterable<Horaire> findAll(Iterable<Integer> arg0);

	Horaire findOne(Integer arg0);

	<S extends Horaire> Iterable<S> save(Iterable<S> arg0);

	<S extends Horaire> S save(S arg0);

}