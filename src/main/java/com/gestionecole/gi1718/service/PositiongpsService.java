package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Positiongps;

public interface PositiongpsService {

	long count();

	void delete(Positiongps arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Positiongps> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Positiongps> findAll();

	Iterable<Positiongps> findAllById(Iterable<Integer> arg0);

	Optional<Positiongps> findById(Integer arg0);

	<S extends Positiongps> S save(S arg0);

	<S extends Positiongps> Iterable<S> saveAll(Iterable<S> arg0);

}