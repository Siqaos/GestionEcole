package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Secretaire;

public interface SecretaireService {

	long count();

	void delete(Secretaire arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Secretaire> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Secretaire> findAll();

	Iterable<Secretaire> findAllById(Iterable<Integer> arg0);

	Optional<Secretaire> findById(Integer arg0);

	<S extends Secretaire> S save(S arg0);

	<S extends Secretaire> Iterable<S> saveAll(Iterable<S> arg0);

}