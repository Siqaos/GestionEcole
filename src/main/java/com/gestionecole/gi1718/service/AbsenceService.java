package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Absence;

public interface AbsenceService {

	long count();

	void delete(Absence arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Absence> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Absence> findAll();

	Iterable<Absence> findAllById(Iterable<Integer> arg0);

	Optional<Absence> findById(Integer arg0);

	<S extends Absence> S save(S arg0);

	<S extends Absence> Iterable<S> saveAll(Iterable<S> arg0);

}