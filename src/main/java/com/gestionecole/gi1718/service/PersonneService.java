package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Personne;

public interface PersonneService {

	long count();

	void delete(Personne arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Personne> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Personne> findAll();

	Iterable<Personne> findAllById(Iterable<Integer> arg0);

	Optional<Personne> findById(Integer arg0);

	<S extends Personne> S save(S arg0);

	<S extends Personne> Iterable<S> saveAll(Iterable<S> arg0);

}