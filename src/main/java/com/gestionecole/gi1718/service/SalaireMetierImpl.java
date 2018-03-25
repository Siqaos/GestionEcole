package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.SalaireRepository;
import com.gestionecole.gi1718.entites.Salaire;

@Service
public class SalaireMetierImpl implements SalaireService {
	@Autowired
	private SalaireRepository SalaireRepository;

	@Override
	public long count() {
		return SalaireRepository.count();
	}

	@Override
	public void delete(Salaire arg0) {
		SalaireRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		SalaireRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Salaire> arg0) {
		SalaireRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		SalaireRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return SalaireRepository.existsById(arg0);
	}

	@Override
	public Iterable<Salaire> findAll() {
		return SalaireRepository.findAll();
	}

	@Override
	public Iterable<Salaire> findAllById(Iterable<Integer> arg0) {
		return SalaireRepository.findAllById(arg0);
	}

	@Override
	public Optional<Salaire> findById(Integer arg0) {
		return SalaireRepository.findById(arg0);
	}

	@Override
	public <S extends Salaire> S save(S arg0) {
		return SalaireRepository.save(arg0);
	}

	@Override
	public <S extends Salaire> Iterable<S> saveAll(Iterable<S> arg0) {
		return SalaireRepository.saveAll(arg0);
	}
	
	
}
