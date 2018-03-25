package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Paiement;

public interface PaiementService {

	long count();

	void delete(Paiement arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Paiement> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Paiement> findAll();

	Iterable<Paiement> findAllById(Iterable<Integer> arg0);

	Optional<Paiement> findById(Integer arg0);

	<S extends Paiement> S save(S arg0);

	<S extends Paiement> Iterable<S> saveAll(Iterable<S> arg0);

}