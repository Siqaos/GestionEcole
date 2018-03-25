package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.ObservationRepository;
import com.gestionecole.gi1718.entites.Observation;

@Service
public class ObservationMetierImpl implements ObservationService {
	@Autowired
	private ObservationRepository ObservationRepository;

	@Override
	public long count() {
		return ObservationRepository.count();
	}

	@Override
	public void delete(Observation arg0) {
		ObservationRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		ObservationRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Observation> arg0) {
		ObservationRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		ObservationRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return ObservationRepository.existsById(arg0);
	}

	@Override
	public Iterable<Observation> findAll() {
		return ObservationRepository.findAll();
	}

	@Override
	public Iterable<Observation> findAllById(Iterable<Integer> arg0) {
		return ObservationRepository.findAllById(arg0);
	}

	@Override
	public Optional<Observation> findById(Integer arg0) {
		return ObservationRepository.findById(arg0);
	}

	@Override
	public <S extends Observation> S save(S arg0) {
		return ObservationRepository.save(arg0);
	}

	@Override
	public <S extends Observation> Iterable<S> saveAll(Iterable<S> arg0) {
		return ObservationRepository.saveAll(arg0);
	}
	
	
}
