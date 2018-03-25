package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Professeur;

public interface ProfesseurService {

	long count();

	void delete(Professeur arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Professeur> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Professeur> findAll();

	Iterable<Professeur> findAllById(Iterable<Integer> arg0);

	Optional<Professeur> findById(Integer arg0);

	<S extends Professeur> S save(S arg0);

	<S extends Professeur> Iterable<S> saveAll(Iterable<S> arg0);

}