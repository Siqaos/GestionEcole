package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Aide;

public interface AideService {

	long count();

	void delete(Aide arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Aide> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Aide> findAll();

	Iterable<Aide> findAllById(Iterable<Integer> arg0);

	Optional<Aide> findById(Integer arg0);

	<S extends Aide> S save(S arg0);

	<S extends Aide> Iterable<S> saveAll(Iterable<S> arg0);

}