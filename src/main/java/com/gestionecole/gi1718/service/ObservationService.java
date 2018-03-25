package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Observation;

public interface ObservationService {

	long count();

	void delete(Observation arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Observation> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Observation> findAll();

	Iterable<Observation> findAllById(Iterable<Integer> arg0);

	Optional<Observation> findById(Integer arg0);

	<S extends Observation> S save(S arg0);

	<S extends Observation> Iterable<S> saveAll(Iterable<S> arg0);

}