package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Retard;

public interface RetardService {

	long count();

	void delete(Retard arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Retard> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Retard> findAll();

	Iterable<Retard> findAllById(Iterable<Integer> arg0);

	Optional<Retard> findById(Integer arg0);

	<S extends Retard> S save(S arg0);

	<S extends Retard> Iterable<S> saveAll(Iterable<S> arg0);

}