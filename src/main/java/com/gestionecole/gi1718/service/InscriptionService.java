package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Inscription;

public interface InscriptionService {

	long count();

	void delete(Inscription arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Inscription> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Inscription> findAll();

	Iterable<Inscription> findAllById(Iterable<Integer> arg0);

	Optional<Inscription> findById(Integer arg0);

	<S extends Inscription> S save(S arg0);

	<S extends Inscription> Iterable<S> saveAll(Iterable<S> arg0);

}