package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Responsable;

public interface ResponsableService {

	long count();

	void delete(Responsable arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Responsable> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Responsable> findAll();

	Iterable<Responsable> findAllById(Iterable<Integer> arg0);

	Optional<Responsable> findById(Integer arg0);

	<S extends Responsable> S save(S arg0);

	<S extends Responsable> Iterable<S> saveAll(Iterable<S> arg0);

}