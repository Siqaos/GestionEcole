package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Vehicule;

public interface VehiculeService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Vehicule> arg0);

	void delete(Vehicule arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Vehicule> findAll();

	Iterable<Vehicule> findAll(Iterable<Integer> arg0);

	Vehicule findOne(Integer arg0);

	<S extends Vehicule> Iterable<S> save(Iterable<S> arg0);

	<S extends Vehicule> S save(S arg0);

}