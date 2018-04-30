package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.gestionecole.gi1718.entites.Classe;
import com.gestionecole.gi1718.entites.Examen;

public interface ExamenService {

	<S extends Examen> S saveExam(S arg0, String matiere, String classe);

	Classe findByNom(String classe);

	<S extends Classe> S save(S entity);

	<S extends Classe> S findOne(Example<S> example);

	Page<Classe> findAll(Pageable pageable);

	Classe findOne(Integer id);

	boolean exists(Integer id);

	long count();

	<S extends Classe> Page<S> findAll(Example<S> example, Pageable pageable);

	void delete(Integer id);

	void delete(Classe entity);

	<S extends Classe> long count(Example<S> example);

	void delete(Iterable<? extends Classe> entities);

	void deleteAll();

	void deleteAllInBatch();

	void deleteInBatch(Iterable<Classe> arg0);

	<S extends Classe> boolean exists(Example<S> example);

	List<Classe> findAll();

	<S extends Classe> List<S> findAll(Example<S> arg0, Sort arg1);

	<S extends Classe> List<S> findAll(Example<S> arg0);

	List<Classe> findAll(Iterable<Integer> arg0);

	List<Classe> findAll(Sort arg0);

	void flush();

	Classe getOne(Integer arg0);

	<S extends Classe> List<S> save(Iterable<S> arg0);

	<S extends Classe> S saveAndFlush(S arg0);

}