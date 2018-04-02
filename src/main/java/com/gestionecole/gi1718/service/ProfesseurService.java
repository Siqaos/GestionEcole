package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Professeur;

public interface ProfesseurService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Professeur> arg0);

	void delete(Professeur arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Professeur> findAll();

	Iterable<Professeur> findAll(Iterable<Integer> arg0);

	Professeur findOne(Integer arg0);

	<S extends Professeur> Iterable<S> save(Iterable<S> arg0);

	<S extends Professeur> S save(S arg0);

}