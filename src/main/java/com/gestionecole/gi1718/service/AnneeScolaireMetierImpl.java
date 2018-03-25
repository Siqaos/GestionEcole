package com.gestionecole.gi1718.service;

import java.util.Optional;

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
	public void deleteAll() {
		AnneescolaireRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Anneescolaire> arg0) {
		AnneescolaireRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		AnneescolaireRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return AnneescolaireRepository.existsById(arg0);
	}

	@Override
	public Iterable<Anneescolaire> findAll() {
		return AnneescolaireRepository.findAll();
	}

	@Override
	public Iterable<Anneescolaire> findAllById(Iterable<Integer> arg0) {
		return AnneescolaireRepository.findAllById(arg0);
	}

	@Override
	public Optional<Anneescolaire> findById(Integer arg0) {
		return AnneescolaireRepository.findById(arg0);
	}

	@Override
	public <S extends Anneescolaire> S save(S arg0) {
		return AnneescolaireRepository.save(arg0);
	}

	@Override
	public <S extends Anneescolaire> Iterable<S> saveAll(Iterable<S> arg0) {
		return AnneescolaireRepository.saveAll(arg0);
	}
	
	
}
