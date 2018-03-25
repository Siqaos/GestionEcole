package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.ProfesseurRepository;
import com.gestionecole.gi1718.entites.Professeur;

@Service
public class ProfesseurMetierImpl implements ProfesseurService {
	@Autowired
	private ProfesseurRepository ProfesseurRepository;

	@Override
	public long count() {
		return ProfesseurRepository.count();
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
	public void deleteAll(Iterable<? extends Professeur> arg0) {
		ProfesseurRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		ProfesseurRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return ProfesseurRepository.existsById(arg0);
	}

	@Override
	public Iterable<Professeur> findAll() {
		return ProfesseurRepository.findAll();
	}

	@Override
	public Iterable<Professeur> findAllById(Iterable<Integer> arg0) {
		return ProfesseurRepository.findAllById(arg0);
	}

	@Override
	public Optional<Professeur> findById(Integer arg0) {
		return ProfesseurRepository.findById(arg0);
	}

	@Override
	public <S extends Professeur> S save(S arg0) {
		return ProfesseurRepository.save(arg0);
	}

	@Override
	public <S extends Professeur> Iterable<S> saveAll(Iterable<S> arg0) {
		return ProfesseurRepository.saveAll(arg0);
	}
	
	
}
