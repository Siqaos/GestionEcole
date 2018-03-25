package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Devoir;

public interface DevoirService {

	long count();

	void delete(Devoir arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Devoir> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Devoir> findAll();

	Iterable<Devoir> findAllById(Iterable<Integer> arg0);

	Optional<Devoir> findById(Integer arg0);

	<S extends Devoir> S save(S arg0);

	<S extends Devoir> Iterable<S> saveAll(Iterable<S> arg0);

}