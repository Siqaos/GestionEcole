package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Cahiertexte;

public interface CahiertexteService {

	long count();

	void delete(Cahiertexte arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Cahiertexte> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Cahiertexte> findAll();

	Iterable<Cahiertexte> findAllById(Iterable<Integer> arg0);

	Optional<Cahiertexte> findById(Integer arg0);

	<S extends Cahiertexte> S save(S arg0);

	<S extends Cahiertexte> Iterable<S> saveAll(Iterable<S> arg0);

}