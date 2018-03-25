package com.gestionecole.gi1718.service;

import java.util.Optional;

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
	public void deleteAll() {
		ClasseRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Classe> arg0) {
		ClasseRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		ClasseRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return ClasseRepository.existsById(arg0);
	}

	@Override
	public Iterable<Classe> findAll() {
		return ClasseRepository.findAll();
	}

	@Override
	public Iterable<Classe> findAllById(Iterable<Integer> arg0) {
		return ClasseRepository.findAllById(arg0);
	}

	@Override
	public Optional<Classe> findById(Integer arg0) {
		return ClasseRepository.findById(arg0);
	}

	@Override
	public <S extends Classe> S save(S arg0) {
		return ClasseRepository.save(arg0);
	}

	@Override
	public <S extends Classe> Iterable<S> saveAll(Iterable<S> arg0) {
		return ClasseRepository.saveAll(arg0);
	}
	
	
}
