package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Session;

public interface SessionService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Session> arg0);

	void delete(Session arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Session> findAll();

	Iterable<Session> findAll(Iterable<Integer> arg0);

	Session findOne(Integer arg0);

	<S extends Session> Iterable<S> save(Iterable<S> arg0);

	<S extends Session> S save(S arg0);

}