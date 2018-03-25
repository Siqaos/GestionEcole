package com.gestionecole.gi1718.service;

import java.util.Optional;

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
	public void delete(Salle arg0) {
		SalleRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		SalleRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Salle> arg0) {
		SalleRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		SalleRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return SalleRepository.existsById(arg0);
	}

	@Override
	public Iterable<Salle> findAll() {
		return SalleRepository.findAll();
	}

	@Override
	public Iterable<Salle> findAllById(Iterable<Integer> arg0) {
		return SalleRepository.findAllById(arg0);
	}

	@Override
	public Optional<Salle> findById(Integer arg0) {
		return SalleRepository.findById(arg0);
	}

	@Override
	public <S extends Salle> S save(S arg0) {
		return SalleRepository.save(arg0);
	}

	@Override
	public <S extends Salle> Iterable<S> saveAll(Iterable<S> arg0) {
		return SalleRepository.saveAll(arg0);
	}
	
	
}
