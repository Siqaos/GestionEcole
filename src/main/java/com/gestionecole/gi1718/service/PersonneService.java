package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.gestionecole.gi1718.entites.Personne;

public interface PersonneService {

	List<Personne> listerPersonne(String nom);

	<S extends Personne> S save(S entity);

	<S extends Personne> S findOne(Example<S> example);

	Page<Personne> findAll(Pageable pageable);

	Personne findOne(Long id);

	boolean exists(Long id);

	long count();

	<S extends Personne> Page<S> findAll(Example<S> example, Pageable pageable);

	void delete(Long id);

	void delete(Personne entity);

	<S extends Personne> long count(Example<S> example);

	void delete(Iterable<? extends Personne> entities);

	void deleteAll();

	void deleteAllInBatch();

	void deleteInBatch(Iterable<Personne> arg0);

	<S extends Personne> boolean exists(Example<S> example);

	List<Personne> findAll();

	<S extends Personne> List<S> findAll(Example<S> arg0, Sort arg1);

	<S extends Personne> List<S> findAll(Example<S> arg0);

	List<Personne> findAll(Iterable<Long> arg0);

	List<Personne> findAll(Sort arg0);

	void flush();

	Personne getOne(Long arg0);

	<S extends Personne> List<S> save(Iterable<S> arg0);

	<S extends Personne> S saveAndFlush(S arg0);

}