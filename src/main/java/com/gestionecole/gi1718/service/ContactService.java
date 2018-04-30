package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.gestionecole.gi1718.entites.Contact;

public interface ContactService {

	long count();

	<S extends Contact> long count(Example<S> arg0);

	void delete(Contact arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Contact> arg0);

	void deleteAll();

	void deleteAllInBatch();

	void deleteInBatch(Iterable<Contact> arg0);

	<S extends Contact> boolean exists(Example<S> arg0);

	boolean exists(Integer arg0);

	List<Contact> findAll();

	<S extends Contact> Page<S> findAll(Example<S> arg0, Pageable arg1);

	<S extends Contact> List<S> findAll(Example<S> arg0, Sort arg1);

	<S extends Contact> List<S> findAll(Example<S> arg0);

	List<Contact> findAll(Iterable<Integer> arg0);

	Page<Contact> findAll(Pageable arg0);

	List<Contact> findAll(Sort arg0);

	<S extends Contact> S findOne(Example<S> arg0);

	Contact findOne(Integer arg0);

	void flush();

	Contact getOne(Integer arg0);

	<S extends Contact> List<S> save(Iterable<S> arg0);

	<S extends Contact> S save(S arg0);

	<S extends Contact> S saveAndFlush(S arg0);

	<S extends Contact> S saveContact(S arg0, String nom);

}