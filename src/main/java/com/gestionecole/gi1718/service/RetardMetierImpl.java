package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.RetardRepository;
import com.gestionecole.gi1718.entites.Retard;

@Service
public class RetardMetierImpl implements RetardService {
	@Autowired
	private RetardRepository RetardRepository;

	@Override
	public long count() {
		return RetardRepository.count();
	}

	@Override
	public void delete(Retard arg0) {
		RetardRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		RetardRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Retard> arg0) {
		RetardRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		RetardRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return RetardRepository.existsById(arg0);
	}

	@Override
	public Iterable<Retard> findAll() {
		return RetardRepository.findAll();
	}

	@Override
	public Iterable<Retard> findAllById(Iterable<Integer> arg0) {
		return RetardRepository.findAllById(arg0);
	}

	@Override
	public Optional<Retard> findById(Integer arg0) {
		return RetardRepository.findById(arg0);
	}

	@Override
	public <S extends Retard> S save(S arg0) {
		return RetardRepository.save(arg0);
	}

	@Override
	public <S extends Retard> Iterable<S> saveAll(Iterable<S> arg0) {
		return RetardRepository.saveAll(arg0);
	}
	
	
}
