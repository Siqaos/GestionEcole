package com.gestionecole.gi1718.service;

import java.util.Optional;

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
	public void delete(Seance arg0) {
		SeanceRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		SeanceRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Seance> arg0) {
		SeanceRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		SeanceRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return SeanceRepository.existsById(arg0);
	}

	@Override
	public Iterable<Seance> findAll() {
		return SeanceRepository.findAll();
	}

	@Override
	public Iterable<Seance> findAllById(Iterable<Integer> arg0) {
		return SeanceRepository.findAllById(arg0);
	}

	@Override
	public Optional<Seance> findById(Integer arg0) {
		return SeanceRepository.findById(arg0);
	}

	@Override
	public <S extends Seance> S save(S arg0) {
		return SeanceRepository.save(arg0);
	}

	@Override
	public <S extends Seance> Iterable<S> saveAll(Iterable<S> arg0) {
		return SeanceRepository.saveAll(arg0);
	}
	
	
}
