package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Bulletin;

public interface BulletinService {

	long count();

	void delete(Bulletin arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Bulletin> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Bulletin> findAll();

	Iterable<Bulletin> findAll(Iterable<Integer> arg0);

	Bulletin findOne(Integer arg0);

	<S extends Bulletin> Iterable<S> save(Iterable<S> arg0);

	<S extends Bulletin> S save(S arg0);

}