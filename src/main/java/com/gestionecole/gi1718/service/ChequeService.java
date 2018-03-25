package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Cheque;

public interface ChequeService {

	long count();

	void delete(Cheque arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Cheque> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Cheque> findAll();

	Iterable<Cheque> findAllById(Iterable<Integer> arg0);

	Optional<Cheque> findById(Integer arg0);

	<S extends Cheque> S save(S arg0);

	<S extends Cheque> Iterable<S> saveAll(Iterable<S> arg0);

}