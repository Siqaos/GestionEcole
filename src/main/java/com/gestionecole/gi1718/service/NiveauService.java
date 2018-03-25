package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Niveau;

public interface NiveauService {

	long count();

	void delete(Niveau arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Niveau> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Niveau> findAll();

	Iterable<Niveau> findAllById(Iterable<Integer> arg0);

	Optional<Niveau> findById(Integer arg0);

	<S extends Niveau> S save(S arg0);

	<S extends Niveau> Iterable<S> saveAll(Iterable<S> arg0);

}