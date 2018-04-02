package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.EleveRepository;
import com.gestionecole.gi1718.entites.Eleve;

@Service
public class ExamenMetierImpl implements  ExamenService  {
	@Autowired
	private EleveRepository EleveRepository;

	@Override
	public long count() {
		return EleveRepository.count();
	}

	@Override
	public void delete(Eleve arg0) {
		EleveRepository.delete(arg0);
	}

	@Override
	public void delete(Integer arg0) {
		EleveRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Eleve> arg0) {
		EleveRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		EleveRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return EleveRepository.exists(arg0);
	}

	@Override
	public Iterable<Eleve> findAll() {
		return EleveRepository.findAll();
	}

	@Override
	public Iterable<Eleve> findAll(Iterable<Integer> arg0) {
		return EleveRepository.findAll(arg0);
	}

	@Override
	public Eleve findOne(Integer arg0) {
		return EleveRepository.findOne(arg0);
	}

	@Override
	public <S extends Eleve> Iterable<S> save(Iterable<S> arg0) {
		return EleveRepository.save(arg0);
	}

	@Override
	public <S extends Eleve> S save(S arg0) {
		return EleveRepository.save(arg0);
	}

	
	
	
}
