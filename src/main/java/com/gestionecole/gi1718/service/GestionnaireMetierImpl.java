package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.GestionnaireRepository;
import com.gestionecole.gi1718.entites.Gestionnaire;

@Service
public class GestionnaireMetierImpl implements GestionnaireService {
	@Autowired
	private GestionnaireRepository GestionnaireRepository;

	@Override
	public long count() {
		return GestionnaireRepository.count();
	}

	@Override
	public void delete(Gestionnaire arg0) {
		GestionnaireRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		GestionnaireRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Gestionnaire> arg0) {
		GestionnaireRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		GestionnaireRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return GestionnaireRepository.existsById(arg0);
	}

	@Override
	public Iterable<Gestionnaire> findAll() {
		return GestionnaireRepository.findAll();
	}

	@Override
	public Iterable<Gestionnaire> findAllById(Iterable<Integer> arg0) {
		return GestionnaireRepository.findAllById(arg0);
	}

	@Override
	public Optional<Gestionnaire> findById(Integer arg0) {
		return GestionnaireRepository.findById(arg0);
	}

	@Override
	public <S extends Gestionnaire> S save(S arg0) {
		return GestionnaireRepository.save(arg0);
	}

	@Override
	public <S extends Gestionnaire> Iterable<S> saveAll(Iterable<S> arg0) {
		return GestionnaireRepository.saveAll(arg0);
	}
	
	
}
