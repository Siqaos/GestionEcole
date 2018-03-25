package com.gestionecole.gi1718.service;

import java.util.Optional;

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
	public void delete(Matiere arg0) {
		MatiereRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		MatiereRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Matiere> arg0) {
		MatiereRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		MatiereRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return MatiereRepository.existsById(arg0);
	}

	@Override
	public Iterable<Matiere> findAll() {
		return MatiereRepository.findAll();
	}

	@Override
	public Iterable<Matiere> findAllById(Iterable<Integer> arg0) {
		return MatiereRepository.findAllById(arg0);
	}

	@Override
	public Optional<Matiere> findById(Integer arg0) {
		return MatiereRepository.findById(arg0);
	}

	@Override
	public <S extends Matiere> S save(S arg0) {
		return MatiereRepository.save(arg0);
	}

	@Override
	public <S extends Matiere> Iterable<S> saveAll(Iterable<S> arg0) {
		return MatiereRepository.saveAll(arg0);
	}
	
	
}
