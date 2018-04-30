package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.gestionecole.gi1718.entites.Matiere;

public interface MatiereService {

	Page<Matiere> chercherMatiere(String x, Pageable pageable);

	<S extends Matiere> S save(S entity);

	<S extends Matiere> S findOne(Example<S> example);

	Page<Matiere> findAll(Pageable pageable);

	Matiere findOne(Integer id);

	boolean exists(Integer id);

	long count();

	<S extends Matiere> Page<S> findAll(Example<S> example, Pageable pageable);

	void delete(Integer id);

	void delete(Matiere entity);

	<S extends Matiere> long count(Example<S> example);

	void delete(Iterable<? extends Matiere> entities);

	void deleteAll();

	void deleteAllInBatch();

	void deleteInBatch(Iterable<Matiere> arg0);

	<S extends Matiere> boolean exists(Example<S> example);

	List<Matiere> findAll();

	<S extends Matiere> List<S> findAll(Example<S> arg0, Sort arg1);

	<S extends Matiere> List<S> findAll(Example<S> arg0);

	List<Matiere> findAll(Iterable<Integer> arg0);

	List<Matiere> findAll(Sort arg0);

	void flush();

	Matiere getOne(Integer arg0);

	<S extends Matiere> List<S> save(Iterable<S> arg0);

	<S extends Matiere> S saveAndFlush(S arg0);

}