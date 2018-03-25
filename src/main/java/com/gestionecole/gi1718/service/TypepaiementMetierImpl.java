package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.TypepaiementRepository;
import com.gestionecole.gi1718.entites.Typepaiement;

@Service
public class TypepaiementMetierImpl implements TypepaiementService {
	@Autowired
	private TypepaiementRepository TypepaiementRepository;

	@Override
	public long count() {
		return TypepaiementRepository.count();
	}

	@Override
	public void delete(Typepaiement arg0) {
		TypepaiementRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		TypepaiementRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Typepaiement> arg0) {
		TypepaiementRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		TypepaiementRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return TypepaiementRepository.existsById(arg0);
	}

	@Override
	public Iterable<Typepaiement> findAll() {
		return TypepaiementRepository.findAll();
	}

	@Override
	public Iterable<Typepaiement> findAllById(Iterable<Integer> arg0) {
		return TypepaiementRepository.findAllById(arg0);
	}

	@Override
	public Optional<Typepaiement> findById(Integer arg0) {
		return TypepaiementRepository.findById(arg0);
	}

	@Override
	public <S extends Typepaiement> S save(S arg0) {
		return TypepaiementRepository.save(arg0);
	}

	@Override
	public <S extends Typepaiement> Iterable<S> saveAll(Iterable<S> arg0) {
		return TypepaiementRepository.saveAll(arg0);
	}
	
	
}
