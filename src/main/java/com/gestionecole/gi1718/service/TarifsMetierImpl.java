package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.TarifsRepository;
import com.gestionecole.gi1718.entites.Tarifs;

@Service
public class TarifsMetierImpl implements TarifsService {
	@Autowired
	private TarifsRepository TarifsRepository;

	@Override
	public long count() {
		return TarifsRepository.count();
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
	public void deleteAll(Iterable<? extends Tarifs> arg0) {
		TarifsRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		TarifsRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return TarifsRepository.existsById(arg0);
	}

	@Override
	public Iterable<Tarifs> findAll() {
		return TarifsRepository.findAll();
	}

	@Override
	public Iterable<Tarifs> findAllById(Iterable<Integer> arg0) {
		return TarifsRepository.findAllById(arg0);
	}

	@Override
	public Optional<Tarifs> findById(Integer arg0) {
		return TarifsRepository.findById(arg0);
	}

	@Override
	public <S extends Tarifs> S save(S arg0) {
		return TarifsRepository.save(arg0);
	}

	@Override
	public <S extends Tarifs> Iterable<S> saveAll(Iterable<S> arg0) {
		return TarifsRepository.saveAll(arg0);
	}
	
	
}
