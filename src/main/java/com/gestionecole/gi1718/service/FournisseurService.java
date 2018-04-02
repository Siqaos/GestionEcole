package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Fournisseur;

public interface FournisseurService {

	long count();

	void delete(Fournisseur arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Fournisseur> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Fournisseur> findAll();

	Iterable<Fournisseur> findAll(Iterable<Integer> arg0);

	Fournisseur findOne(Integer arg0);

	<S extends Fournisseur> Iterable<S> save(Iterable<S> arg0);

	<S extends Fournisseur> S save(S arg0);

}