package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Matiere;

public interface MatiereService {

	long count();

	void delete(Matiere arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Matiere> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Matiere> findAll();

	Iterable<Matiere> findAllById(Iterable<Integer> arg0);

	Optional<Matiere> findById(Integer arg0);

	<S extends Matiere> S save(S arg0);

	<S extends Matiere> Iterable<S> saveAll(Iterable<S> arg0);

}