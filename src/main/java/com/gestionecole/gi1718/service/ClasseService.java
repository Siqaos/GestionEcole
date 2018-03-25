package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Classe;

public interface ClasseService {

	long count();

	void delete(Classe arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Classe> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Classe> findAll();

	Iterable<Classe> findAllById(Iterable<Integer> arg0);

	Optional<Classe> findById(Integer arg0);

	<S extends Classe> S save(S arg0);

	<S extends Classe> Iterable<S> saveAll(Iterable<S> arg0);

}