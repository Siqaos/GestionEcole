package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.ChauffeurRepository;
import com.gestionecole.gi1718.entites.Chauffeur;

@Service
public class ChauffeurMetierImpl implements ChauffeurService {
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
	public void deleteAll() {
		ChauffeurRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Chauffeur> arg0) {
		ChauffeurRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		ChauffeurRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return ChauffeurRepository.existsById(arg0);
	}

	@Override
	public Iterable<Chauffeur> findAll() {
		return ChauffeurRepository.findAll();
	}

	@Override
	public Iterable<Chauffeur> findAllById(Iterable<Integer> arg0) {
		return ChauffeurRepository.findAllById(arg0);
	}

	@Override
	public Optional<Chauffeur> findById(Integer arg0) {
		return ChauffeurRepository.findById(arg0);
	}

	@Override
	public <S extends Chauffeur> S save(S arg0) {
		return ChauffeurRepository.save(arg0);
	}

	@Override
	public <S extends Chauffeur> Iterable<S> saveAll(Iterable<S> arg0) {
		return ChauffeurRepository.saveAll(arg0);
	}
	
	
}
