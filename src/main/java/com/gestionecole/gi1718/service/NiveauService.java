package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.gestionecole.gi1718.entites.Niveau;

public interface NiveauService {

	Page<Niveau> chercherNiveau(String x, Pageable pageable);

	<S extends Niveau> S save(S entity);

	<S extends Niveau> S findOne(Example<S> example);

	Page<Niveau> findAll(Pageable pageable);

	Niveau findOne(Integer id);

	boolean exists(Integer id);

	long count();

	<S extends Niveau> Page<S> findAll(Example<S> example, Pageable pageable);

	void delete(Integer id);

	void delete(Niveau entity);

	<S extends Niveau> long count(Example<S> example);

	void delete(Iterable<? extends Niveau> entities);

	void deleteAll();

	void deleteAllInBatch();

	void deleteInBatch(Iterable<Niveau> arg0);

	<S extends Niveau> boolean exists(Example<S> example);

	List<Niveau> findAll();

	<S extends Niveau> List<S> findAll(Example<S> arg0, Sort arg1);

	<S extends Niveau> List<S> findAll(Example<S> arg0);

	List<Niveau> findAll(Iterable<Integer> arg0);

	List<Niveau> findAll(Sort arg0);

	void flush();

	Niveau getOne(Integer arg0);

	<S extends Niveau> List<S> save(Iterable<S> arg0);

	<S extends Niveau> S saveAndFlush(S arg0);

}