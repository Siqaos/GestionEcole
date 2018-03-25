package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Contact;

public interface ContactService {

	long count();

	void delete(Contact arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Contact> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Contact> findAll();

	Iterable<Contact> findAllById(Iterable<Integer> arg0);

	Optional<Contact> findById(Integer arg0);

	<S extends Contact> S save(S arg0);

	<S extends Contact> Iterable<S> saveAll(Iterable<S> arg0);

}