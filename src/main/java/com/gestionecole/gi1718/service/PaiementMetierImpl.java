package com.gestionecole.gi1718.service;

import java.util.Optional;

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
	public void delete(Paiement arg0) {
		PaiementRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		PaiementRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Paiement> arg0) {
		PaiementRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		PaiementRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return PaiementRepository.existsById(arg0);
	}

	@Override
	public Iterable<Paiement> findAll() {
		return PaiementRepository.findAll();
	}

	@Override
	public Iterable<Paiement> findAllById(Iterable<Integer> arg0) {
		return PaiementRepository.findAllById(arg0);
	}

	@Override
	public Optional<Paiement> findById(Integer arg0) {
		return PaiementRepository.findById(arg0);
	}

	@Override
	public <S extends Paiement> S save(S arg0) {
		return PaiementRepository.save(arg0);
	}

	@Override
	public <S extends Paiement> Iterable<S> saveAll(Iterable<S> arg0) {
		return PaiementRepository.saveAll(arg0);
	}
	
	
}
