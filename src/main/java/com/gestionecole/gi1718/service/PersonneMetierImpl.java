package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.PersonneRepository;
import com.gestionecole.gi1718.entites.Personne;

@Service
public class PersonneMetierImpl implements PersonneService {
	@Autowired
	private PersonneRepository PersonneRepository;

	@Override
	public List<Personne> listerPersonne(String nom) {
		return PersonneRepository.listerPersonne(nom);
	}

	@Override
	public <S extends Personne> S save(S entity) {
		return PersonneRepository.save(entity);
	}

	@Override
	public <S extends Personne> S findOne(Example<S> example) {
		return PersonneRepository.findOne(example);
	}

	@Override
	public Page<Personne> findAll(Pageable pageable) {
		return PersonneRepository.findAll(pageable);
	}

	@Override
	public Personne findOne(Long id) {
		return PersonneRepository.findOne(id);
	}

	@Override
	public boolean exists(Long id) {
		return PersonneRepository.exists(id);
	}

	@Override
	public long count() {
		return PersonneRepository.count();
	}

	@Override
	public <S extends Personne> Page<S> findAll(Example<S> example, Pageable pageable) {
		return PersonneRepository.findAll(example, pageable);
	}

	@Override
	public void delete(Long id) {
		PersonneRepository.delete(id);
	}

	@Override
	public void delete(Personne entity) {
		PersonneRepository.delete(entity);
	}

	@Override
	public <S extends Personne> long count(Example<S> example) {
		return PersonneRepository.count(example);
	}

	@Override
	public void delete(Iterable<? extends Personne> entities) {
		PersonneRepository.delete(entities);
	}

	@Override
	public void deleteAll() {
		PersonneRepository.deleteAll();
	}

	@Override
	public void deleteAllInBatch() {
		PersonneRepository.deleteAllInBatch();
	}

	@Override
	public void deleteInBatch(Iterable<Personne> arg0) {
		PersonneRepository.deleteInBatch(arg0);
	}

	@Override
	public <S extends Personne> boolean exists(Example<S> example) {
		return PersonneRepository.exists(example);
	}

	@Override
	public List<Personne> findAll() {
		return PersonneRepository.findAll();
	}

	@Override
	public <S extends Personne> List<S> findAll(Example<S> arg0, Sort arg1) {
		return PersonneRepository.findAll(arg0, arg1);
	}

	@Override
	public <S extends Personne> List<S> findAll(Example<S> arg0) {
		return PersonneRepository.findAll(arg0);
	}

	@Override
	public List<Personne> findAll(Iterable<Long> arg0) {
		return PersonneRepository.findAll(arg0);
	}

	@Override
	public List<Personne> findAll(Sort arg0) {
		return PersonneRepository.findAll(arg0);
	}

	@Override
	public void flush() {
		PersonneRepository.flush();
	}

	@Override
	public Personne getOne(Long arg0) {
		return PersonneRepository.getOne(arg0);
	}

	@Override
	public <S extends Personne> List<S> save(Iterable<S> arg0) {
		return PersonneRepository.save(arg0);
	}

	@Override
	public <S extends Personne> S saveAndFlush(S arg0) {
		return PersonneRepository.saveAndFlush(arg0);
	}


	
}
