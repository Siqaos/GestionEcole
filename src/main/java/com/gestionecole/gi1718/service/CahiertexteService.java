package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.gestionecole.gi1718.entites.Cahiertexte;

public interface CahiertexteService {

	long count();

	<S extends Cahiertexte> long count(Example<S> arg0);

	void delete(Cahiertexte arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Cahiertexte> arg0);

	void deleteAll();

	void deleteAllInBatch();

	void deleteInBatch(Iterable<Cahiertexte> arg0);

	<S extends Cahiertexte> boolean exists(Example<S> arg0);

	boolean exists(Integer arg0);

	List<Cahiertexte> findAll();

	<S extends Cahiertexte> Page<S> findAll(Example<S> arg0, Pageable arg1);

	<S extends Cahiertexte> List<S> findAll(Example<S> arg0, Sort arg1);

	<S extends Cahiertexte> List<S> findAll(Example<S> arg0);

	List<Cahiertexte> findAll(Iterable<Integer> arg0);

	Page<Cahiertexte> findAll(Pageable arg0);

	List<Cahiertexte> findAll(Sort arg0);

	<S extends Cahiertexte> S findOne(Example<S> arg0);

	Cahiertexte findOne(Integer arg0);

	void flush();

	Cahiertexte getOne(Integer arg0);

	<S extends Cahiertexte> List<S> save(Iterable<S> arg0);

	<S extends Cahiertexte> S save(S arg0);

	<S extends Cahiertexte> S saveAndFlush(S arg0);
	
	public <S extends Cahiertexte> S saveCahierText(S arg0,String matiere,String classe) ;

}