package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Positiongps;

public interface PositiongpsService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Positiongps> arg0);

	void delete(Positiongps arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Positiongps> findAll();

	Iterable<Positiongps> findAll(Iterable<Integer> arg0);

	Positiongps findOne(Integer arg0);

	<S extends Positiongps> Iterable<S> save(Iterable<S> arg0);

	<S extends Positiongps> S save(S arg0);

}