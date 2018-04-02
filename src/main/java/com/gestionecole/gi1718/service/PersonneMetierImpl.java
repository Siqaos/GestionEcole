package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.PersonneRepository;
import com.gestionecole.gi1718.entites.Personne;

@Service
public class PersonneMetierImpl implements PersonneService {
	@Autowired
	private PersonneRepository PersonneRepository;

	@Override
	public long count() {
		return PersonneRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		PersonneRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Personne> arg0) {
		PersonneRepository.delete(arg0);
	}

	@Override
	public void delete(Personne arg0) {
		PersonneRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		PersonneRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return PersonneRepository.exists(arg0);
	}

	@Override
	public Iterable<Personne> findAll() {
		return PersonneRepository.findAll();
	}

	@Override
	public Iterable<Personne> findAll(Iterable<Integer> arg0) {
		return PersonneRepository.findAll(arg0);
	}

	@Override
	public Personne findOne(Integer arg0) {
		return PersonneRepository.findOne(arg0);
	}

	@Override
	public <S extends Personne> Iterable<S> save(Iterable<S> arg0) {
		return PersonneRepository.save(arg0);
	}

	@Override
	public <S extends Personne> S save(S arg0) {
		return PersonneRepository.save(arg0);
	}

	
	
}
