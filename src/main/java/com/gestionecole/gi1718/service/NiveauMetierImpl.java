package com.gestionecole.gi1718.service;

import java.util.Optional;

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
	public void delete(Niveau arg0) {
		NiveauRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		NiveauRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Niveau> arg0) {
		NiveauRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		NiveauRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return NiveauRepository.existsById(arg0);
	}

	@Override
	public Iterable<Niveau> findAll() {
		return NiveauRepository.findAll();
	}

	@Override
	public Iterable<Niveau> findAllById(Iterable<Integer> arg0) {
		return NiveauRepository.findAllById(arg0);
	}

	@Override
	public Optional<Niveau> findById(Integer arg0) {
		return NiveauRepository.findById(arg0);
	}

	@Override
	public <S extends Niveau> S save(S arg0) {
		return NiveauRepository.save(arg0);
	}

	@Override
	public <S extends Niveau> Iterable<S> saveAll(Iterable<S> arg0) {
		return NiveauRepository.saveAll(arg0);
	}
	
	
}
