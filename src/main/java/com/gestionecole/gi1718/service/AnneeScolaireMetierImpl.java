package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.AnneescolaireRepository;
import com.gestionecole.gi1718.entites.Anneescolaire;

@Service
public class AnneeScolaireMetierImpl implements AnneeScolaireService {
	@Autowired
	private AnneescolaireRepository AnneescolaireRepository;

	@Override
	public long count() {
		return AnneescolaireRepository.count();
	}

	@Override
	public void delete(Anneescolaire arg0) {
		AnneescolaireRepository.delete(arg0);
	}

	@Override
	public void delete(Integer arg0) {
		AnneescolaireRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Anneescolaire> arg0) {
		AnneescolaireRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		AnneescolaireRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return AnneescolaireRepository.exists(arg0);
	}

	@Override
	public Iterable<Anneescolaire> findAll() {
		return AnneescolaireRepository.findAll();
	}

	@Override
	public Iterable<Anneescolaire> findAll(Iterable<Integer> arg0) {
		return AnneescolaireRepository.findAll(arg0);
	}

	@Override
	public Anneescolaire findOne(Integer arg0) {
		return AnneescolaireRepository.findOne(arg0);
	}

	@Override
	public <S extends Anneescolaire> Iterable<S> save(Iterable<S> arg0) {
		return AnneescolaireRepository.save(arg0);
	}

	@Override
	public <S extends Anneescolaire> S save(S arg0) {
		return AnneescolaireRepository.save(arg0);
	}

	
	
}
