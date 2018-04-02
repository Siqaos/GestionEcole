package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.FournisseurRepository;
import com.gestionecole.gi1718.entites.Fournisseur;

@Service
public class FournisseurMetierImpl implements FournisseurService    {
	@Autowired
	private FournisseurRepository FournisseurRepository;

	@Override
	public long count() {
		return FournisseurRepository.count();
	}

	@Override
	public void delete(Fournisseur arg0) {
		FournisseurRepository.delete(arg0);
	}

	@Override
	public void delete(Integer arg0) {
		FournisseurRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Fournisseur> arg0) {
		FournisseurRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		FournisseurRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return FournisseurRepository.exists(arg0);
	}

	@Override
	public Iterable<Fournisseur> findAll() {
		return FournisseurRepository.findAll();
	}

	@Override
	public Iterable<Fournisseur> findAll(Iterable<Integer> arg0) {
		return FournisseurRepository.findAll(arg0);
	}

	@Override
	public Fournisseur findOne(Integer arg0) {
		return FournisseurRepository.findOne(arg0);
	}

	@Override
	public <S extends Fournisseur> Iterable<S> save(Iterable<S> arg0) {
		return FournisseurRepository.save(arg0);
	}

	@Override
	public <S extends Fournisseur> S save(S arg0) {
		return FournisseurRepository.save(arg0);
	}

	
	
	
}
