package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Typepaiement;

public interface TypepaiementService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Typepaiement> arg0);

	void delete(Typepaiement arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Typepaiement> findAll();

	Iterable<Typepaiement> findAll(Iterable<Integer> arg0);

	Typepaiement findOne(Integer arg0);

	<S extends Typepaiement> Iterable<S> save(Iterable<S> arg0);

	<S extends Typepaiement> S save(S arg0);

}