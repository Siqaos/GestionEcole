package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.TypepaiementRepository;
import com.gestionecole.gi1718.entites.Typepaiement;

@Service
public class TypepaiementMetierImpl implements TypepaiementService  {
	@Autowired
	private TypepaiementRepository TypepaiementRepository;

	@Override
	public long count() {
		return TypepaiementRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		TypepaiementRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Typepaiement> arg0) {
		TypepaiementRepository.delete(arg0);
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
	public boolean exists(Integer arg0) {
		return TypepaiementRepository.exists(arg0);
	}

	@Override
	public Iterable<Typepaiement> findAll() {
		return TypepaiementRepository.findAll();
	}

	@Override
	public Iterable<Typepaiement> findAll(Iterable<Integer> arg0) {
		return TypepaiementRepository.findAll(arg0);
	}

	@Override
	public Typepaiement findOne(Integer arg0) {
		return TypepaiementRepository.findOne(arg0);
	}

	@Override
	public <S extends Typepaiement> Iterable<S> save(Iterable<S> arg0) {
		return TypepaiementRepository.save(arg0);
	}

	@Override
	public <S extends Typepaiement> S save(S arg0) {
		return TypepaiementRepository.save(arg0);
	}

	
	
	
}
