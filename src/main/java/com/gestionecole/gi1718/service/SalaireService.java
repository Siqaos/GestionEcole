package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Salaire;

public interface SalaireService {

	long count();

	void delete(Salaire arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Salaire> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Salaire> findAll();

	Iterable<Salaire> findAllById(Iterable<Integer> arg0);

	Optional<Salaire> findById(Integer arg0);

	<S extends Salaire> S save(S arg0);

	<S extends Salaire> Iterable<S> saveAll(Iterable<S> arg0);

}