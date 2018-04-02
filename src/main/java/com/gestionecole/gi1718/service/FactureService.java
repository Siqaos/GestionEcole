package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Facture;

public interface FactureService {

	long count();

	void delete(Facture arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Facture> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Facture> findAll();

	Iterable<Facture> findAll(Iterable<Integer> arg0);

	Facture findOne(Integer arg0);

	<S extends Facture> Iterable<S> save(Iterable<S> arg0);

	<S extends Facture> S save(S arg0);

}