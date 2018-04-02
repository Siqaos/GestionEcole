package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.PaiementRepository;
import com.gestionecole.gi1718.entites.Paiement;

@Service
public class PaiementMetierImpl implements PaiementService {
	@Autowired
	private PaiementRepository PaiementRepository;

	@Override
	public long count() {
		return PaiementRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		PaiementRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Paiement> arg0) {
		PaiementRepository.delete(arg0);
	}

	@Override
	public void delete(Paiement arg0) {
		PaiementRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		PaiementRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return PaiementRepository.exists(arg0);
	}

	@Override
	public Iterable<Paiement> findAll() {
		return PaiementRepository.findAll();
	}

	@Override
	public Iterable<Paiement> findAll(Iterable<Integer> arg0) {
		return PaiementRepository.findAll(arg0);
	}

	@Override
	public Paiement findOne(Integer arg0) {
		return PaiementRepository.findOne(arg0);
	}

	@Override
	public <S extends Paiement> Iterable<S> save(Iterable<S> arg0) {
		return PaiementRepository.save(arg0);
	}

	@Override
	public <S extends Paiement> S save(S arg0) {
		return PaiementRepository.save(arg0);
	}

	
	
}
