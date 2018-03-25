package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Unite;

public interface UniteService {

	long count();

	void delete(Unite arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Unite> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Unite> findAll();

	Iterable<Unite> findAllById(Iterable<Integer> arg0);

	Optional<Unite> findById(Integer arg0);

	<S extends Unite> S save(S arg0);

	<S extends Unite> Iterable<S> saveAll(Iterable<S> arg0);

}