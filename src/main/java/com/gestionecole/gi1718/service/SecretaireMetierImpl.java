package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.SecretaireRepository;
import com.gestionecole.gi1718.entites.Secretaire;

@Service
public class SecretaireMetierImpl implements SecretaireService {
	@Autowired
	private SecretaireRepository SecretaireRepository;

	@Override
	public long count() {
		return SecretaireRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		SecretaireRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Secretaire> arg0) {
		SecretaireRepository.delete(arg0);
	}

	@Override
	public void delete(Secretaire arg0) {
		SecretaireRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		SecretaireRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return SecretaireRepository.exists(arg0);
	}

	@Override
	public Iterable<Secretaire> findAll() {
		return SecretaireRepository.findAll();
	}

	@Override
	public Iterable<Secretaire> findAll(Iterable<Integer> arg0) {
		return SecretaireRepository.findAll(arg0);
	}

	@Override
	public Secretaire findOne(Integer arg0) {
		return SecretaireRepository.findOne(arg0);
	}

	@Override
	public <S extends Secretaire> Iterable<S> save(Iterable<S> arg0) {
		return SecretaireRepository.save(arg0);
	}

	@Override
	public <S extends Secretaire> S save(S arg0) {
		return SecretaireRepository.save(arg0);
	}

		
	
}
