package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Vehicule;

public interface VehiculeService {

	long count();

	void delete(Vehicule arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Vehicule> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Vehicule> findAll();

	Iterable<Vehicule> findAllById(Iterable<Integer> arg0);

	Optional<Vehicule> findById(Integer arg0);

	<S extends Vehicule> S save(S arg0);

	<S extends Vehicule> Iterable<S> saveAll(Iterable<S> arg0);

}