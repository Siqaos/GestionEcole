package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.gestionecole.gi1718.entites.Classe;

public interface ClasseService {

	long count();

	<S extends Classe> long count(Example<S> arg0);

	void delete(Classe arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Classe> arg0);

	void deleteAll();

	void deleteAllInBatch();

	void deleteInBatch(Iterable<Classe> arg0);

	<S extends Classe> boolean exists(Example<S> arg0);

	boolean exists(Integer arg0);

	List<Classe> findAll();

	<S extends Classe> Page<S> findAll(Example<S> arg0, Pageable arg1);

	<S extends Classe> List<S> findAll(Example<S> arg0, Sort arg1);

	<S extends Classe> List<S> findAll(Example<S> arg0);

	List<Classe> findAll(Iterable<Integer> arg0);

	Page<Classe> findAll(Pageable arg0);

	List<Classe> findAll(Sort arg0);

	Classe findByNom(String classe);

	<S extends Classe> S findOne(Example<S> arg0);

	Classe findOne(Integer arg0);

	void flush();

	Classe getOne(Integer arg0);

	<S extends Classe> List<S> save(Iterable<S> arg0);

	<S extends Classe> S save(S arg0);

	<S extends Classe> S saveAndFlush(S arg0);

}