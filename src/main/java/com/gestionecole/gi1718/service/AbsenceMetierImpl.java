package com.gestionecole.gi1718.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.AbsenceRepository;
import com.gestionecole.gi1718.entites.Absence;

@Service
public class AbsenceMetierImpl implements AbsenceService  {

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
	public void delete(Integer arg0) {
		AbsenceRepository.delete(arg0);
	}
	@Override
	public void delete(Iterable<? extends Absence> arg0) {
		AbsenceRepository.delete(arg0);
	}
	@Override
	public void deleteAll() {
		AbsenceRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return AbsenceRepository.exists(arg0);
	}

	@Override
	public Iterable<Absence> findAll() {
		return AbsenceRepository.findAll();
	}

	@Override
	public Iterable<Absence> findAll(Iterable<Integer> arg0) {
		return AbsenceRepository.findAll(arg0);
	}
	@Override
	public Absence findOne(Integer arg0) {
		return AbsenceRepository.findOne(arg0);
	}

	@Override
	public <S extends Absence> Iterable<S> save(Iterable<S> arg0) {
		return AbsenceRepository.save(arg0);
	}

	@Override
	public <S extends Absence> S save(S arg0) {
		return AbsenceRepository.save(arg0);
	}

	
	
}
