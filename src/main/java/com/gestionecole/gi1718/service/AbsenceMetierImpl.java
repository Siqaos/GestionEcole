package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.AbsenceRepository;
import com.gestionecole.gi1718.entites.Absence;

@Service
public class AbsenceMetierImpl implements AbsenceService {

	@Autowired
	private AbsenceRepository AbsenceRepository;

	@Override
	public long count() {
		return AbsenceRepository.count();
	}

	@Override
	public void delete(Absence arg0) {
		AbsenceRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		AbsenceRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Absence> arg0) {
		AbsenceRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		AbsenceRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return AbsenceRepository.existsById(arg0);
	}

	@Override
	public Iterable<Absence> findAll() {
		return AbsenceRepository.findAll();
	}

	@Override
	public Iterable<Absence> findAllById(Iterable<Integer> arg0) {
		return AbsenceRepository.findAllById(arg0);
	}

	@Override
	public Optional<Absence> findById(Integer arg0) {
		return AbsenceRepository.findById(arg0);
	}

	@Override
	public <S extends Absence> S save(S arg0) {
		return AbsenceRepository.save(arg0);
	}

	@Override
	public <S extends Absence> Iterable<S> saveAll(Iterable<S> arg0) {
		return AbsenceRepository.saveAll(arg0);
	}
	
	
}
