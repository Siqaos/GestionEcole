package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Bulletin;

public interface BulletinService {

	long count();

	void delete(Bulletin arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Bulletin> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Bulletin> findAll();

	Iterable<Bulletin> findAllById(Iterable<Integer> arg0);

	Optional<Bulletin> findById(Integer arg0);

	<S extends Bulletin> S save(S arg0);

	<S extends Bulletin> Iterable<S> saveAll(Iterable<S> arg0);

}