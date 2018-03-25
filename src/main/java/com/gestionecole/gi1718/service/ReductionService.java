package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Reduction;

public interface ReductionService {

	long count();

	void delete(Reduction arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Reduction> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Reduction> findAll();

	Iterable<Reduction> findAllById(Iterable<Integer> arg0);

	Optional<Reduction> findById(Integer arg0);

	<S extends Reduction> S save(S arg0);

	<S extends Reduction> Iterable<S> saveAll(Iterable<S> arg0);

}