package com.gestionecole.gi1718.service;

import java.util.Optional;

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
	public void delete(Unite arg0) {
		UniteRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		UniteRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Unite> arg0) {
		UniteRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		UniteRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return UniteRepository.existsById(arg0);
	}

	@Override
	public Iterable<Unite> findAll() {
		return UniteRepository.findAll();
	}

	@Override
	public Iterable<Unite> findAllById(Iterable<Integer> arg0) {
		return UniteRepository.findAllById(arg0);
	}

	@Override
	public Optional<Unite> findById(Integer arg0) {
		return UniteRepository.findById(arg0);
	}

	@Override
	public <S extends Unite> S save(S arg0) {
		return UniteRepository.save(arg0);
	}

	@Override
	public <S extends Unite> Iterable<S> saveAll(Iterable<S> arg0) {
		return UniteRepository.saveAll(arg0);
	}
	
	
}
