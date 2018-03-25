package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.CahiertexteRepository;
import com.gestionecole.gi1718.entites.Cahiertexte;

@Service
public class CahiertexteMetierImpl implements CahiertexteService {
	@Autowired
	private CahiertexteRepository CahiertexteRepository;

	@Override
	public long count() {
		return CahiertexteRepository.count();
	}

	@Override
	public void delete(Cahiertexte arg0) {
		CahiertexteRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		CahiertexteRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Cahiertexte> arg0) {
		CahiertexteRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		CahiertexteRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return CahiertexteRepository.existsById(arg0);
	}

	@Override
	public Iterable<Cahiertexte> findAll() {
		return CahiertexteRepository.findAll();
	}

	@Override
	public Iterable<Cahiertexte> findAllById(Iterable<Integer> arg0) {
		return CahiertexteRepository.findAllById(arg0);
	}

	@Override
	public Optional<Cahiertexte> findById(Integer arg0) {
		return CahiertexteRepository.findById(arg0);
	}

	@Override
	public <S extends Cahiertexte> S save(S arg0) {
		return CahiertexteRepository.save(arg0);
	}

	@Override
	public <S extends Cahiertexte> Iterable<S> saveAll(Iterable<S> arg0) {
		return CahiertexteRepository.saveAll(arg0);
	}


	
	
}
