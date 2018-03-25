package com.gestionecole.gi1718.service;

import java.util.Optional;

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
	public void delete(Responsable arg0) {
		ResponsableRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		ResponsableRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Responsable> arg0) {
		ResponsableRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		ResponsableRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return ResponsableRepository.existsById(arg0);
	}

	@Override
	public Iterable<Responsable> findAll() {
		return ResponsableRepository.findAll();
	}

	@Override
	public Iterable<Responsable> findAllById(Iterable<Integer> arg0) {
		return ResponsableRepository.findAllById(arg0);
	}

	@Override
	public Optional<Responsable> findById(Integer arg0) {
		return ResponsableRepository.findById(arg0);
	}

	@Override
	public <S extends Responsable> S save(S arg0) {
		return ResponsableRepository.save(arg0);
	}

	@Override
	public <S extends Responsable> Iterable<S> saveAll(Iterable<S> arg0) {
		return ResponsableRepository.saveAll(arg0);
	}
	
	
}
