package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.FactureRepository;
import com.gestionecole.gi1718.entites.Facture;

@Service
public class FactureMetierImpl implements FactureService   {
	@Autowired
	private FactureRepository FactureRepository;

	@Override
	public long count() {
		return FactureRepository.count();
	}

	@Override
	public void delete(Facture arg0) {
		FactureRepository.delete(arg0);
	}

	@Override
	public void delete(Integer arg0) {
		FactureRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Facture> arg0) {
		FactureRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		FactureRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return FactureRepository.exists(arg0);
	}

	@Override
	public Iterable<Facture> findAll() {
		return FactureRepository.findAll();
	}

	@Override
	public Iterable<Facture> findAll(Iterable<Integer> arg0) {
		return FactureRepository.findAll(arg0);
	}

	@Override
	public Facture findOne(Integer arg0) {
		return FactureRepository.findOne(arg0);
	}

	@Override
	public <S extends Facture> Iterable<S> save(Iterable<S> arg0) {
		return FactureRepository.save(arg0);
	}

	@Override
	public <S extends Facture> S save(S arg0) {
		return FactureRepository.save(arg0);
	}

	
	
	
}
