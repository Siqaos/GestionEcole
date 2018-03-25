package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Salle;

public interface SalleService {

	long count();

	void delete(Salle arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Salle> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Salle> findAll();

	Iterable<Salle> findAllById(Iterable<Integer> arg0);

	Optional<Salle> findById(Integer arg0);

	<S extends Salle> S save(S arg0);

	<S extends Salle> Iterable<S> saveAll(Iterable<S> arg0);

}