package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.ClasseRepository;
import com.gestionecole.gi1718.entites.Classe;

@Service
public class ClasseMetierImpl implements ClasseService {
	@Autowired
	private ClasseRepository ClasseRepository;

	@Override
	public long count() {
		return ClasseRepository.count();
	}

	@Override
	public void delete(Classe arg0) {
		ClasseRepository.delete(arg0);
	}

	@Override
	public void delete(Integer arg0) {
		ClasseRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Classe> arg0) {
		ClasseRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		ClasseRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return ClasseRepository.exists(arg0);
	}

	@Override
	public Iterable<Classe> findAll() {
		return ClasseRepository.findAll();
	}

	@Override
	public Iterable<Classe> findAll(Iterable<Integer> arg0) {
		return ClasseRepository.findAll(arg0);
	}

	@Override
	public Classe findOne(Integer arg0) {
		return ClasseRepository.findOne(arg0);
	}

	@Override
	public <S extends Classe> Iterable<S> save(Iterable<S> arg0) {
		return ClasseRepository.save(arg0);
	}

	@Override
	public <S extends Classe> S save(S arg0) {
		return ClasseRepository.save(arg0);
	}

	
	
	
}
