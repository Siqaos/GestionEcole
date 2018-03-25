package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Transport;

public interface TransportService {

	long count();

	void delete(Transport arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Transport> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Transport> findAll();

	Iterable<Transport> findAllById(Iterable<Integer> arg0);

	Optional<Transport> findById(Integer arg0);

	<S extends Transport> S save(S arg0);

	<S extends Transport> Iterable<S> saveAll(Iterable<S> arg0);

}