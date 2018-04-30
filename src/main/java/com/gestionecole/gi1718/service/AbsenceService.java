package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Absence;

public interface AbsenceService {

	long count();

	void delete(Absence arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Absence> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Absence> findAll();

	Iterable<Absence> findAll(Iterable<Integer> arg0);

	Absence findOne(Integer arg0);

	<S extends Absence> Iterable<S> save(Iterable<S> arg0);

	<S extends Absence> S save(S arg0);

	<S extends Absence> S  saveAbsence(S arg0, String matriculeEleve,String matiere);
}