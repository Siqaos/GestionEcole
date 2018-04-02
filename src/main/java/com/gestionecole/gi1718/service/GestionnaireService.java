package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Gestionnaire;

public interface GestionnaireService {

	long count();

	void delete(Gestionnaire arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Gestionnaire> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Gestionnaire> findAll();

	Iterable<Gestionnaire> findAll(Iterable<Integer> arg0);

	Gestionnaire findOne(Integer arg0);

	<S extends Gestionnaire> Iterable<S> save(Iterable<S> arg0);

	<S extends Gestionnaire> S save(S arg0);

}