package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Transport;

public interface TransportService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Transport> arg0);

	void delete(Transport arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Transport> findAll();

	Iterable<Transport> findAll(Iterable<Integer> arg0);

	Transport findOne(Integer arg0);

	<S extends Transport> Iterable<S> save(Iterable<S> arg0);

	<S extends Transport> S save(S arg0);

}