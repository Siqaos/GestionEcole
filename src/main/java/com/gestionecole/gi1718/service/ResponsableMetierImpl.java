package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.ResponsableRepository;
import com.gestionecole.gi1718.entites.Responsable;

@Service
public class ResponsableMetierImpl implements ResponsableService {
	@Autowired
	private ResponsableRepository ResponsableRepository;

	@Override
	public long count() {
		return ResponsableRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		ResponsableRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Responsable> arg0) {
		ResponsableRepository.delete(arg0);
	}

	@Override
	public void delete(Responsable arg0) {
		ResponsableRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		ResponsableRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return ResponsableRepository.exists(arg0);
	}

	@Override
	public Iterable<Responsable> findAll() {
		return ResponsableRepository.findAll();
	}

	@Override
	public Iterable<Responsable> findAll(Iterable<Integer> arg0) {
		return ResponsableRepository.findAll(arg0);
	}

	@Override
	public Responsable findOne(Integer arg0) {
		return ResponsableRepository.findOne(arg0);
	}

	@Override
	public <S extends Responsable> Iterable<S> save(Iterable<S> arg0) {
		return ResponsableRepository.save(arg0);
	}

	@Override
	public <S extends Responsable> S save(S arg0) {
		return ResponsableRepository.save(arg0);
	}

	
	
}
