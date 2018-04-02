package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.MatiereRepository;
import com.gestionecole.gi1718.entites.Matiere;

@Service
public class MatiereMetierImpl implements MatiereService {
	@Autowired
	private MatiereRepository MatiereRepository;

	@Override
	public long count() {
		return MatiereRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		MatiereRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Matiere> arg0) {
		MatiereRepository.delete(arg0);
	}

	@Override
	public void delete(Matiere arg0) {
		MatiereRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		MatiereRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return MatiereRepository.exists(arg0);
	}

	@Override
	public Iterable<Matiere> findAll() {
		return MatiereRepository.findAll();
	}

	@Override
	public Iterable<Matiere> findAll(Iterable<Integer> arg0) {
		return MatiereRepository.findAll(arg0);
	}

	@Override
	public Matiere findOne(Integer arg0) {
		return MatiereRepository.findOne(arg0);
	}

	@Override
	public <S extends Matiere> Iterable<S> save(Iterable<S> arg0) {
		return MatiereRepository.save(arg0);
	}

	@Override
	public <S extends Matiere> S save(S arg0) {
		return MatiereRepository.save(arg0);
	}

	
	
}
