package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.InscriptionRepository;
import com.gestionecole.gi1718.entites.Inscription;

@Service
public class InscriptionMetierImpl implements InscriptionService {
	@Autowired
	private InscriptionRepository InscriptionRepository;

	@Override
	public long count() {
		return InscriptionRepository.count();
	}

	@Override
	public void delete(Inscription arg0) {
		InscriptionRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		InscriptionRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Inscription> arg0) {
		InscriptionRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		InscriptionRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return InscriptionRepository.existsById(arg0);
	}

	@Override
	public Iterable<Inscription> findAll() {
		return InscriptionRepository.findAll();
	}

	@Override
	public Iterable<Inscription> findAllById(Iterable<Integer> arg0) {
		return InscriptionRepository.findAllById(arg0);
	}

	@Override
	public Optional<Inscription> findById(Integer arg0) {
		return InscriptionRepository.findById(arg0);
	}

	@Override
	public <S extends Inscription> S save(S arg0) {
		return InscriptionRepository.save(arg0);
	}

	@Override
	public <S extends Inscription> Iterable<S> saveAll(Iterable<S> arg0) {
		return InscriptionRepository.saveAll(arg0);
	}
	
	
}
