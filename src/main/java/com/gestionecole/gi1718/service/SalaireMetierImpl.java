package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.SalaireRepository;
import com.gestionecole.gi1718.entites.Salaire;

@Service
public class SalaireMetierImpl implements SalaireService  {
	@Autowired
	private SalaireRepository SalaireRepository;

	@Override
	public long count() {
		return SalaireRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		SalaireRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Salaire> arg0) {
		SalaireRepository.delete(arg0);
	}

	@Override
	public void delete(Salaire arg0) {
		SalaireRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		SalaireRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return SalaireRepository.exists(arg0);
	}

	@Override
	public Iterable<Salaire> findAll() {
		return SalaireRepository.findAll();
	}

	@Override
	public Iterable<Salaire> findAll(Iterable<Integer> arg0) {
		return SalaireRepository.findAll(arg0);
	}

	@Override
	public Salaire findOne(Integer arg0) {
		return SalaireRepository.findOne(arg0);
	}

	@Override
	public <S extends Salaire> Iterable<S> save(Iterable<S> arg0) {
		return SalaireRepository.save(arg0);
	}

	@Override
	public <S extends Salaire> S save(S arg0) {
		return SalaireRepository.save(arg0);
	}


	
}
