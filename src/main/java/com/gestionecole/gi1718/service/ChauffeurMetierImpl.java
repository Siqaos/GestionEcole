package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.ChauffeurRepository;
import com.gestionecole.gi1718.entites.Chauffeur;

@Service
public class ChauffeurMetierImpl implements ChauffeurService  {
	@Autowired
	private ChauffeurRepository ChauffeurRepository;

	@Override
	public long count() {
		return ChauffeurRepository.count();
	}

	@Override
	public void delete(Chauffeur arg0) {
		ChauffeurRepository.delete(arg0);
	}

	@Override
	public void delete(Integer arg0) {
		ChauffeurRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Chauffeur> arg0) {
		ChauffeurRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		ChauffeurRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return ChauffeurRepository.exists(arg0);
	}

	@Override
	public Iterable<Chauffeur> findAll() {
		return ChauffeurRepository.findAll();
	}

	@Override
	public Iterable<Chauffeur> findAll(Iterable<Integer> arg0) {
		return ChauffeurRepository.findAll(arg0);
	}

	@Override
	public Chauffeur findOne(Integer arg0) {
		return ChauffeurRepository.findOne(arg0);
	}

	@Override
	public <S extends Chauffeur> Iterable<S> save(Iterable<S> arg0) {
		return ChauffeurRepository.save(arg0);
	}

	@Override
	public <S extends Chauffeur> S save(S arg0) {
		return ChauffeurRepository.save(arg0);
	}

	
}
