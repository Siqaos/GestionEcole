package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.DirecteurRepository;
import com.gestionecole.gi1718.entites.Directeur;

@Service
public class DirecteurMetierImpl implements  DirecteurService  {
	@Autowired
	private DirecteurRepository DirecteurRepository;

	@Override
	public long count() {
		return DirecteurRepository.count();
	}

	@Override
	public void delete(Directeur arg0) {
		DirecteurRepository.delete(arg0);
	}

	@Override
	public void delete(Integer arg0) {
		DirecteurRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Directeur> arg0) {
		DirecteurRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		DirecteurRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return DirecteurRepository.exists(arg0);
	}

	@Override
	public Iterable<Directeur> findAll() {
		return DirecteurRepository.findAll();
	}

	@Override
	public Iterable<Directeur> findAll(Iterable<Integer> arg0) {
		return DirecteurRepository.findAll(arg0);
	}

	@Override
	public Directeur findOne(Integer arg0) {
		return DirecteurRepository.findOne(arg0);
	}

	@Override
	public <S extends Directeur> Iterable<S> save(Iterable<S> arg0) {
		return DirecteurRepository.save(arg0);
	}

	@Override
	public <S extends Directeur> S save(S arg0) {
		return DirecteurRepository.save(arg0);
	}

	
	
	
}
