package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Cahiertexte;

public interface CahietexteService {

	long count();

	void delete(Cahiertexte arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Cahiertexte> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Cahiertexte> findAll();

	Iterable<Cahiertexte> findAll(Iterable<Integer> arg0);

	Cahiertexte findOne(Integer arg0);

	<S extends Cahiertexte> Iterable<S> save(Iterable<S> arg0);

	<S extends Cahiertexte> S save(S arg0);

}