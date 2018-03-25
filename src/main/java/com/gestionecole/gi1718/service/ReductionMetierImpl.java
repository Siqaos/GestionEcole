package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.ReductionRepository;
import com.gestionecole.gi1718.entites.Reduction;

@Service
public class ReductionMetierImpl implements ReductionService {
	@Autowired
	private ReductionRepository ReductionRepository;

	@Override
	public long count() {
		return ReductionRepository.count();
	}

	@Override
	public void delete(Reduction arg0) {
		ReductionRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		ReductionRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Reduction> arg0) {
		ReductionRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		ReductionRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return ReductionRepository.existsById(arg0);
	}

	@Override
	public Iterable<Reduction> findAll() {
		return ReductionRepository.findAll();
	}

	@Override
	public Iterable<Reduction> findAllById(Iterable<Integer> arg0) {
		return ReductionRepository.findAllById(arg0);
	}

	@Override
	public Optional<Reduction> findById(Integer arg0) {
		return ReductionRepository.findById(arg0);
	}

	@Override
	public <S extends Reduction> S save(S arg0) {
		return ReductionRepository.save(arg0);
	}

	@Override
	public <S extends Reduction> Iterable<S> saveAll(Iterable<S> arg0) {
		return ReductionRepository.saveAll(arg0);
	}
	
	
}
