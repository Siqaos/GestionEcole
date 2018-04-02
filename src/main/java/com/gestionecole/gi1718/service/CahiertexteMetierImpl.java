package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.CahiertexteRepository;
import com.gestionecole.gi1718.entites.Cahiertexte;

@Service
public class CahiertexteMetierImpl implements CahietexteService  {
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
	public void delete(Integer arg0) {
		CahiertexteRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Cahiertexte> arg0) {
		CahiertexteRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		CahiertexteRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return CahiertexteRepository.exists(arg0);
	}

	@Override
	public Iterable<Cahiertexte> findAll() {
		return CahiertexteRepository.findAll();
	}

	@Override
	public Iterable<Cahiertexte> findAll(Iterable<Integer> arg0) {
		return CahiertexteRepository.findAll(arg0);
	}

	@Override
	public Cahiertexte findOne(Integer arg0) {
		return CahiertexteRepository.findOne(arg0);
	}

	@Override
	public <S extends Cahiertexte> Iterable<S> save(Iterable<S> arg0) {
		return CahiertexteRepository.save(arg0);
	}

	@Override
	public <S extends Cahiertexte> S save(S arg0) {
		return CahiertexteRepository.save(arg0);
	}

	
	
	
}
