package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Retard;

public interface RetardService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Retard> arg0);

	void delete(Retard arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Retard> findAll();

	Iterable<Retard> findAll(Iterable<Integer> arg0);

	Retard findOne(Integer arg0);

	<S extends Retard> Iterable<S> save(Iterable<S> arg0);

	<S extends Retard> S save(S arg0);
	
	public <S extends Retard> S saveRetard(S arg0,String matriculeEleve,String matiere) ;


}