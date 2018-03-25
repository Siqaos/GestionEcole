package com.gestionecole.gi1718.service;

import java.util.Optional;

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
	public void delete(Secretaire arg0) {
		SecretaireRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		SecretaireRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Secretaire> arg0) {
		SecretaireRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		SecretaireRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return SecretaireRepository.existsById(arg0);
	}

	@Override
	public Iterable<Secretaire> findAll() {
		return SecretaireRepository.findAll();
	}

	@Override
	public Iterable<Secretaire> findAllById(Iterable<Integer> arg0) {
		return SecretaireRepository.findAllById(arg0);
	}

	@Override
	public Optional<Secretaire> findById(Integer arg0) {
		return SecretaireRepository.findById(arg0);
	}

	@Override
	public <S extends Secretaire> S save(S arg0) {
		return SecretaireRepository.save(arg0);
	}

	@Override
	public <S extends Secretaire> Iterable<S> saveAll(Iterable<S> arg0) {
		return SecretaireRepository.saveAll(arg0);
	}
	
	
}
