package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Cheque;

public interface ChequeService {

	long count();

	void delete(Cheque arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Cheque> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Cheque> findAll();

	Iterable<Cheque> findAll(Iterable<Integer> arg0);

	Cheque findOne(Integer arg0);

	<S extends Cheque> Iterable<S> save(Iterable<S> arg0);

	<S extends Cheque> S save(S arg0);

}