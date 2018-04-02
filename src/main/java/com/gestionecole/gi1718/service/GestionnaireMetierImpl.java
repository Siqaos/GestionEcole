package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.GestionnaireRepository;
import com.gestionecole.gi1718.entites.Gestionnaire;

@Service
public class GestionnaireMetierImpl implements GestionnaireService  {
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
	public void delete(Integer arg0) {
		GestionnaireRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Gestionnaire> arg0) {
		GestionnaireRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		GestionnaireRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return GestionnaireRepository.exists(arg0);
	}

	@Override
	public Iterable<Gestionnaire> findAll() {
		return GestionnaireRepository.findAll();
	}

	@Override
	public Iterable<Gestionnaire> findAll(Iterable<Integer> arg0) {
		return GestionnaireRepository.findAll(arg0);
	}

	@Override
	public Gestionnaire findOne(Integer arg0) {
		return GestionnaireRepository.findOne(arg0);
	}

	@Override
	public <S extends Gestionnaire> Iterable<S> save(Iterable<S> arg0) {
		return GestionnaireRepository.save(arg0);
	}

	@Override
	public <S extends Gestionnaire> S save(S arg0) {
		return GestionnaireRepository.save(arg0);
	}

	
	
	
}
