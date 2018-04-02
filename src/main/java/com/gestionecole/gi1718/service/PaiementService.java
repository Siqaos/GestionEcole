package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Paiement;

public interface PaiementService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Paiement> arg0);

	void delete(Paiement arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Paiement> findAll();

	Iterable<Paiement> findAll(Iterable<Integer> arg0);

	Paiement findOne(Integer arg0);

	<S extends Paiement> Iterable<S> save(Iterable<S> arg0);

	<S extends Paiement> S save(S arg0);

}