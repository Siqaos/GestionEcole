package com.gestionecole.gi1718.service;

import java.util.Optional;

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
	public void delete(Personne arg0) {
		PersonneRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		PersonneRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Personne> arg0) {
		PersonneRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		PersonneRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return PersonneRepository.existsById(arg0);
	}

	@Override
	public Iterable<Personne> findAll() {
		return PersonneRepository.findAll();
	}

	@Override
	public Iterable<Personne> findAllById(Iterable<Integer> arg0) {
		return PersonneRepository.findAllById(arg0);
	}

	@Override
	public Optional<Personne> findById(Integer arg0) {
		return PersonneRepository.findById(arg0);
	}

	@Override
	public <S extends Personne> S save(S arg0) {
		return PersonneRepository.save(arg0);
	}

	@Override
	public <S extends Personne> Iterable<S> saveAll(Iterable<S> arg0) {
		return PersonneRepository.saveAll(arg0);
	}
	
	
}
