package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.SeanceRepository;
import com.gestionecole.gi1718.entites.Seance;

@Service
public class SeanceMetierImpl implements SeanceService {
	@Autowired
	private SeanceRepository SeanceRepository;

	@Override
	public long count() {
		return SeanceRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		SeanceRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Seance> arg0) {
		SeanceRepository.delete(arg0);
	}

	@Override
	public void delete(Seance arg0) {
		SeanceRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		SeanceRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return SeanceRepository.exists(arg0);
	}

	@Override
	public Iterable<Seance> findAll() {
		return SeanceRepository.findAll();
	}

	@Override
	public Iterable<Seance> findAll(Iterable<Integer> arg0) {
		return SeanceRepository.findAll(arg0);
	}

	@Override
	public Seance findOne(Integer arg0) {
		return SeanceRepository.findOne(arg0);
	}

	@Override
	public <S extends Seance> Iterable<S> save(Iterable<S> arg0) {
		return SeanceRepository.save(arg0);
	}

	@Override
	public <S extends Seance> S save(S arg0) {
		return SeanceRepository.save(arg0);
	}

	
	
	
}
