package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Session;

public interface SessionService {

	long count();

	void delete(Session arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Session> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Session> findAll();

	Iterable<Session> findAllById(Iterable<Integer> arg0);

	Optional<Session> findById(Integer arg0);

	<S extends Session> S save(S arg0);

	<S extends Session> Iterable<S> saveAll(Iterable<S> arg0);

}