package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.AideRepository;
import com.gestionecole.gi1718.entites.Aide;

@Service
public class AideMetierImpl implements AideService {
	@Autowired
	private AideRepository AideRepository;

	@Override
	public long count() {
		return AideRepository.count();
	}

	@Override
	public void delete(Aide arg0) {
		AideRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		AideRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Aide> arg0) {
		AideRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		AideRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return AideRepository.existsById(arg0);
	}

	@Override
	public Iterable<Aide> findAll() {
		return AideRepository.findAll();
	}

	@Override
	public Iterable<Aide> findAllById(Iterable<Integer> arg0) {
		return AideRepository.findAllById(arg0);
	}

	@Override
	public Optional<Aide> findById(Integer arg0) {
		return AideRepository.findById(arg0);
	}

	@Override
	public <S extends Aide> S save(S arg0) {
		return AideRepository.save(arg0);
	}

	@Override
	public <S extends Aide> Iterable<S> saveAll(Iterable<S> arg0) {
		return AideRepository.saveAll(arg0);
	}
	
	
}
