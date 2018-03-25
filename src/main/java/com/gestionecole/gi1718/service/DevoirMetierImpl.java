package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.DevoirRepository;
import com.gestionecole.gi1718.entites.Devoir;

@Service
public class DevoirMetierImpl implements DevoirService {
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
	public void deleteAll() {
		DevoirRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Devoir> arg0) {
		DevoirRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		DevoirRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return DevoirRepository.existsById(arg0);
	}

	@Override
	public Iterable<Devoir> findAll() {
		return DevoirRepository.findAll();
	}

	@Override
	public Iterable<Devoir> findAllById(Iterable<Integer> arg0) {
		return DevoirRepository.findAllById(arg0);
	}

	@Override
	public Optional<Devoir> findById(Integer arg0) {
		return DevoirRepository.findById(arg0);
	}

	@Override
	public <S extends Devoir> S save(S arg0) {
		return DevoirRepository.save(arg0);
	}

	@Override
	public <S extends Devoir> Iterable<S> saveAll(Iterable<S> arg0) {
		return DevoirRepository.saveAll(arg0);
	}
	
	
}
