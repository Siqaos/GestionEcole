package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.TarifsRepository;
import com.gestionecole.gi1718.entites.Tarifs;

@Service
public class TarifsMetierImpl implements TarifsService  {
	@Autowired
	private TarifsRepository TarifsRepository;

	@Override
	public long count() {
		return TarifsRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		TarifsRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Tarifs> arg0) {
		TarifsRepository.delete(arg0);
	}

	@Override
	public void delete(Tarifs arg0) {
		TarifsRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		TarifsRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return TarifsRepository.exists(arg0);
	}

	@Override
	public Iterable<Tarifs> findAll() {
		return TarifsRepository.findAll();
	}

	@Override
	public Iterable<Tarifs> findAll(Iterable<Integer> arg0) {
		return TarifsRepository.findAll(arg0);
	}

	@Override
	public Tarifs findOne(Integer arg0) {
		return TarifsRepository.findOne(arg0);
	}

	@Override
	public <S extends Tarifs> Iterable<S> save(Iterable<S> arg0) {
		return TarifsRepository.save(arg0);
	}

	@Override
	public <S extends Tarifs> S save(S arg0) {
		return TarifsRepository.save(arg0);
	}

	
	
	
}
