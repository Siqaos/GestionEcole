package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Typepaiement;

public interface TypepaiementService {

	long count();

	void delete(Typepaiement arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Typepaiement> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Typepaiement> findAll();

	Iterable<Typepaiement> findAllById(Iterable<Integer> arg0);

	Optional<Typepaiement> findById(Integer arg0);

	<S extends Typepaiement> S save(S arg0);

	<S extends Typepaiement> Iterable<S> saveAll(Iterable<S> arg0);

}