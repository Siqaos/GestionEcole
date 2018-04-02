package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.SalleRepository;
import com.gestionecole.gi1718.entites.Salle;

@Service
public class SalleMetierImpl implements SalleService {
	@Autowired
	private SalleRepository SalleRepository;

	@Override
	public long count() {
		return SalleRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		SalleRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Salle> arg0) {
		SalleRepository.delete(arg0);
	}

	@Override
	public void delete(Salle arg0) {
		SalleRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		SalleRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return SalleRepository.exists(arg0);
	}

	@Override
	public Iterable<Salle> findAll() {
		return SalleRepository.findAll();
	}

	@Override
	public Iterable<Salle> findAll(Iterable<Integer> arg0) {
		return SalleRepository.findAll(arg0);
	}

	@Override
	public Salle findOne(Integer arg0) {
		return SalleRepository.findOne(arg0);
	}

	@Override
	public <S extends Salle> Iterable<S> save(Iterable<S> arg0) {
		return SalleRepository.save(arg0);
	}

	@Override
	public <S extends Salle> S save(S arg0) {
		return SalleRepository.save(arg0);
	}

	
	
	
}
