package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.DevoirRepository;
import com.gestionecole.gi1718.entites.Devoir;

@Service
public class DevoirMetierImpl implements DevoirService  {
	@Autowired
	private DevoirRepository DevoirRepository;

	@Override
	public long count() {
		return DevoirRepository.count();
	}

	@Override
	public void delete(Devoir arg0) {
		DevoirRepository.delete(arg0);
	}

	@Override
	public void delete(Integer arg0) {
		DevoirRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Devoir> arg0) {
		DevoirRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		DevoirRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return DevoirRepository.exists(arg0);
	}

	@Override
	public Iterable<Devoir> findAll() {
		return DevoirRepository.findAll();
	}

	@Override
	public Iterable<Devoir> findAll(Iterable<Integer> arg0) {
		return DevoirRepository.findAll(arg0);
	}

	@Override
	public Devoir findOne(Integer arg0) {
		return DevoirRepository.findOne(arg0);
	}

	@Override
	public <S extends Devoir> Iterable<S> save(Iterable<S> arg0) {
		return DevoirRepository.save(arg0);
	}

	@Override
	public <S extends Devoir> S save(S arg0) {
		return DevoirRepository.save(arg0);
	}

	
	
}
