package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.ProfesseurRepository;
import com.gestionecole.gi1718.entites.Professeur;

@Service
public class ProfesseurMetierImpl implements ProfesseurService  {
	@Autowired
	private ProfesseurRepository ProfesseurRepository;

	@Override
	public long count() {
		return ProfesseurRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		ProfesseurRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Professeur> arg0) {
		ProfesseurRepository.delete(arg0);
	}

	@Override
	public void delete(Professeur arg0) {
		ProfesseurRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		ProfesseurRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return ProfesseurRepository.exists(arg0);
	}

	@Override
	public Iterable<Professeur> findAll() {
		return ProfesseurRepository.findAll();
	}

	@Override
	public Iterable<Professeur> findAll(Iterable<Integer> arg0) {
		return ProfesseurRepository.findAll(arg0);
	}

	@Override
	public Professeur findOne(Integer arg0) {
		return ProfesseurRepository.findOne(arg0);
	}

	@Override
	public <S extends Professeur> Iterable<S> save(Iterable<S> arg0) {
		return ProfesseurRepository.save(arg0);
	}

	@Override
	public <S extends Professeur> S save(S arg0) {
		return ProfesseurRepository.save(arg0);
	}
	@Override
	public Professeur findByMatricule(String arg0) {
		return ProfesseurRepository.findByMatricule(arg0);
	}
	
	
}
