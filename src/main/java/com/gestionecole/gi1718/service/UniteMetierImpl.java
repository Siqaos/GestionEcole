package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.UniteRepository;
import com.gestionecole.gi1718.entites.Unite;

@Service
public class UniteMetierImpl implements UniteService {
	@Autowired
	private UniteRepository UniteRepository;

	@Override
	public long count() {
		return UniteRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		UniteRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Unite> arg0) {
		UniteRepository.delete(arg0);
	}

	@Override
	public void delete(Unite arg0) {
		UniteRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		UniteRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return UniteRepository.exists(arg0);
	}

	@Override
	public Iterable<Unite> findAll() {
		return UniteRepository.findAll();
	}

	@Override
	public Iterable<Unite> findAll(Iterable<Integer> arg0) {
		return UniteRepository.findAll(arg0);
	}

	@Override
	public Unite findOne(Integer arg0) {
		return UniteRepository.findOne(arg0);
	}

	@Override
	public <S extends Unite> Iterable<S> save(Iterable<S> arg0) {
		return UniteRepository.save(arg0);
	}

	@Override
	public <S extends Unite> S save(S arg0) {
		return UniteRepository.save(arg0);
	}

	
	
	
}
