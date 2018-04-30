package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.gestionecole.gi1718.entites.Fournisseur;

public interface FournisseurService {

	long count();

	<S extends Fournisseur> long count(Example<S> arg0);

	void delete(Fournisseur arg0);

	void delete(Integer arg0);

	void delete(Iterable<? extends Fournisseur> arg0);

	void deleteAll();

	void deleteAllInBatch();

	void deleteInBatch(Iterable<Fournisseur> arg0);

	<S extends Fournisseur> boolean exists(Example<S> arg0);

	boolean exists(Integer arg0);

	List<Fournisseur> findAll();

	<S extends Fournisseur> Page<S> findAll(Example<S> arg0, Pageable arg1);

	<S extends Fournisseur> List<S> findAll(Example<S> arg0, Sort arg1);

	<S extends Fournisseur> List<S> findAll(Example<S> arg0);

	List<Fournisseur> findAll(Iterable<Integer> arg0);

	Page<Fournisseur> findAll(Pageable arg0);

	List<Fournisseur> findAll(Sort arg0);

	Fournisseur findByNom(String nom);

	<S extends Fournisseur> S findOne(Example<S> arg0);

	Fournisseur findOne(Integer arg0);

	void flush();

	Fournisseur getOne(Integer arg0);

	<S extends Fournisseur> List<S> save(Iterable<S> arg0);

	<S extends Fournisseur> S save(S arg0);

	<S extends Fournisseur> S saveAndFlush(S arg0);

}