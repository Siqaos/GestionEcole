package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.NiveauRepository;
import com.gestionecole.gi1718.entites.Niveau;

@Service
public class NiveauMetierImpl implements NiveauService {
	@Autowired
	private NiveauRepository NiveauRepository;

	@Override
	public long count() {
		return NiveauRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		NiveauRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Niveau> arg0) {
		NiveauRepository.delete(arg0);
	}

	@Override
	public void delete(Niveau arg0) {
		NiveauRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		NiveauRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return NiveauRepository.exists(arg0);
	}

	@Override
	public Iterable<Niveau> findAll() {
		return NiveauRepository.findAll();
	}

	@Override
	public Iterable<Niveau> findAll(Iterable<Integer> arg0) {
		return NiveauRepository.findAll(arg0);
	}

	@Override
	public Niveau findOne(Integer arg0) {
		return NiveauRepository.findOne(arg0);
	}

	@Override
	public <S extends Niveau> Iterable<S> save(Iterable<S> arg0) {
		return NiveauRepository.save(arg0);
	}

	@Override
	public <S extends Niveau> S save(S arg0) {
		return NiveauRepository.save(arg0);
	}

	
	
	
}
