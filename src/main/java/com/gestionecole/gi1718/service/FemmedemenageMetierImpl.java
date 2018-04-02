package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.FemmedemenageRepository;
import com.gestionecole.gi1718.entites.Femmedemenage;

@Service
public class FemmedemenageMetierImpl implements FemmedemenageService   {
	@Autowired
	private FemmedemenageRepository FemmedemenageRepository;

	@Override
	public long count() {
		return FemmedemenageRepository.count();
	}

	@Override
	public void delete(Femmedemenage arg0) {
		FemmedemenageRepository.delete(arg0);
	}

	@Override
	public void delete(Integer arg0) {
		FemmedemenageRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Femmedemenage> arg0) {
		FemmedemenageRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		FemmedemenageRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return FemmedemenageRepository.exists(arg0);
	}

	@Override
	public Iterable<Femmedemenage> findAll() {
		return FemmedemenageRepository.findAll();
	}

	@Override
	public Iterable<Femmedemenage> findAll(Iterable<Integer> arg0) {
		return FemmedemenageRepository.findAll(arg0);
	}

	@Override
	public Femmedemenage findOne(Integer arg0) {
		return FemmedemenageRepository.findOne(arg0);
	}

	@Override
	public <S extends Femmedemenage> Iterable<S> save(Iterable<S> arg0) {
		return FemmedemenageRepository.save(arg0);
	}

	@Override
	public <S extends Femmedemenage> S save(S arg0) {
		return FemmedemenageRepository.save(arg0);
	}

	
	
	
}
