package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Tarifs;

public interface TarifsService {

	long count();

	void delete(Tarifs arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Tarifs> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Tarifs> findAll();

	Iterable<Tarifs> findAllById(Iterable<Integer> arg0);

	Optional<Tarifs> findById(Integer arg0);

	<S extends Tarifs> S save(S arg0);

	<S extends Tarifs> Iterable<S> saveAll(Iterable<S> arg0);

}