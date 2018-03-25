package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Anneescolaire;

public interface AnneeScolaireService {

	long count();

	void delete(Anneescolaire arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Anneescolaire> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Anneescolaire> findAll();

	Iterable<Anneescolaire> findAllById(Iterable<Integer> arg0);

	Optional<Anneescolaire> findById(Integer arg0);

	<S extends Anneescolaire> S save(S arg0);

	<S extends Anneescolaire> Iterable<S> saveAll(Iterable<S> arg0);

}