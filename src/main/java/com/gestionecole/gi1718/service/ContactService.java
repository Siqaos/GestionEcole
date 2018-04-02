package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Contact;

public interface Contactservice {

	long count();

	void delete(Contact arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Contact> arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Contact> findAll();

	Iterable<Contact> findAll(Iterable<Integer> arg0);

	Contact findOne(Integer arg0);

	<S extends Contact> Iterable<S> save(Iterable<S> arg0);

	<S extends Contact> S save(S arg0);

}