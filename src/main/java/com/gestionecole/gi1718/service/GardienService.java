package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Gardien;

public interface GardienService {

	long count();

	void delete(Gardien arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Gardien> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Gardien> findAll();

	Iterable<Gardien> findAll(Iterable<Integer> arg0);

	Gardien findOne(Integer arg0);

	<S extends Gardien> Iterable<S> save(Iterable<S> arg0);

	<S extends Gardien> S save(S arg0);

}