package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.InscriptionRepository;
import com.gestionecole.gi1718.entites.Inscription;

@Service
public class InscriptionMetierImpl implements InscriptionService  {
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
	public void delete(Integer arg0) {
		InscriptionRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Inscription> arg0) {
		InscriptionRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		InscriptionRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return InscriptionRepository.exists(arg0);
	}

	@Override
	public Iterable<Inscription> findAll() {
		return InscriptionRepository.findAll();
	}

	@Override
	public Iterable<Inscription> findAll(Iterable<Integer> arg0) {
		return InscriptionRepository.findAll(arg0);
	}

	@Override
	public Inscription findOne(Integer arg0) {
		return InscriptionRepository.findOne(arg0);
	}

	@Override
	public <S extends Inscription> Iterable<S> save(Iterable<S> arg0) {
		return InscriptionRepository.save(arg0);
	}

	@Override
	public <S extends Inscription> S save(S arg0) {
		return InscriptionRepository.save(arg0);
	}

	
	
}
