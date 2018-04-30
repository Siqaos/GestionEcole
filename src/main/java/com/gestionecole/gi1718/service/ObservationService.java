package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Observation;

public interface ObservationService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Observation> arg0);

	void delete(Observation arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Observation> findAll();

	Iterable<Observation> findAll(Iterable<Integer> arg0);

	Observation findOne(Integer arg0);

	<S extends Observation> Iterable<S> save(Iterable<S> arg0);

	<S extends Observation> S save(S arg0);

	<S extends Observation> S saveObservation(S arg0, String matiere, String eleve);

}