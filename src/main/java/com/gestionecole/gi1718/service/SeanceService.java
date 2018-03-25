package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Seance;

public interface SeanceService {

	long count();

	void delete(Seance arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Seance> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Seance> findAll();

	Iterable<Seance> findAllById(Iterable<Integer> arg0);

	Optional<Seance> findById(Integer arg0);

	<S extends Seance> S save(S arg0);

	<S extends Seance> Iterable<S> saveAll(Iterable<S> arg0);

}