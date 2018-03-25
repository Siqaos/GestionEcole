package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Gestionnaire;

public interface GestionnaireService {

	long count();

	void delete(Gestionnaire arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Gestionnaire> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Gestionnaire> findAll();

	Iterable<Gestionnaire> findAllById(Iterable<Integer> arg0);

	Optional<Gestionnaire> findById(Integer arg0);

	<S extends Gestionnaire> S save(S arg0);

	<S extends Gestionnaire> Iterable<S> saveAll(Iterable<S> arg0);

}