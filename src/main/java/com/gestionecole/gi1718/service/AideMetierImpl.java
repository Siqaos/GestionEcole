package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.AideRepository;
import com.gestionecole.gi1718.entites.Aide;

@Service
public class AideMetierImpl implements AideService  {
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
	public void delete(Integer arg0) {
		AideRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Aide> arg0) {
		AideRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		AideRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return AideRepository.exists(arg0);
	}

	@Override
	public Iterable<Aide> findAll() {
		return AideRepository.findAll();
	}

	@Override
	public Iterable<Aide> findAll(Iterable<Integer> arg0) {
		return AideRepository.findAll(arg0);
	}

	@Override
	public Aide findOne(Integer arg0) {
		return AideRepository.findOne(arg0);
	}

	@Override
	public <S extends Aide> Iterable<S> save(Iterable<S> arg0) {
		return AideRepository.save(arg0);
	}

	@Override
	public <S extends Aide> S save(S arg0) {
		return AideRepository.save(arg0);
	}


	
	
}
