package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Chauffeur;

public interface ChauffeurService {

	long count();

	void delete(Chauffeur arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Chauffeur> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Chauffeur> findAll();

	Iterable<Chauffeur> findAllById(Iterable<Integer> arg0);

	Optional<Chauffeur> findById(Integer arg0);

	<S extends Chauffeur> S save(S arg0);

	<S extends Chauffeur> Iterable<S> saveAll(Iterable<S> arg0);

}