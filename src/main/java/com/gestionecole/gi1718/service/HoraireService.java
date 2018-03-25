package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Horaire;

public interface HoraireService {

	long count();

	void delete(Horaire arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Horaire> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Horaire> findAll();

	Iterable<Horaire> findAllById(Iterable<Integer> arg0);

	Optional<Horaire> findById(Integer arg0);

	<S extends Horaire> S save(S arg0);

	<S extends Horaire> Iterable<S> saveAll(Iterable<S> arg0);

}