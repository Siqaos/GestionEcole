package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
	public <S extends Classe> long count(Example<S> arg0) {
		return ClasseRepository.count(arg0);
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
	public void deleteAllInBatch() {
		ClasseRepository.deleteAllInBatch();
	}

	@Override
	public void deleteInBatch(Iterable<Classe> arg0) {
		ClasseRepository.deleteInBatch(arg0);
	}

	@Override
	public <S extends Classe> boolean exists(Example<S> arg0) {
		return ClasseRepository.exists(arg0);
	}

	@Override
	public boolean exists(Integer arg0) {
		return ClasseRepository.exists(arg0);
	}

	@Override
	public List<Classe> findAll() {
		return ClasseRepository.findAll();
	}

	@Override
	public <S extends Classe> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		return ClasseRepository.findAll(arg0, arg1);
	}

	@Override
	public <S extends Classe> List<S> findAll(Example<S> arg0, Sort arg1) {
		return ClasseRepository.findAll(arg0, arg1);
	}

	@Override
	public <S extends Classe> List<S> findAll(Example<S> arg0) {
		return ClasseRepository.findAll(arg0);
	}

	@Override
	public List<Classe> findAll(Iterable<Integer> arg0) {
		return ClasseRepository.findAll(arg0);
	}

	@Override
	public Page<Classe> findAll(Pageable arg0) {
		return ClasseRepository.findAll(arg0);
	}

	@Override
	public List<Classe> findAll(Sort arg0) {
		return ClasseRepository.findAll(arg0);
	}

	@Override
	public Classe findByNom(String classe) {
		return ClasseRepository.findByNom(classe);
	}

	@Override
	public <S extends Classe> S findOne(Example<S> arg0) {
		return ClasseRepository.findOne(arg0);
	}

	@Override
	public Classe findOne(Integer arg0) {
		return ClasseRepository.findOne(arg0);
	}

	@Override
	public void flush() {
		ClasseRepository.flush();
	}

	@Override
	public Classe getOne(Integer arg0) {
		return ClasseRepository.getOne(arg0);
	}

	@Override
	public <S extends Classe> List<S> save(Iterable<S> arg0) {
		return ClasseRepository.save(arg0);
	}

	@Override
	public <S extends Classe> S save(S arg0) {
		return ClasseRepository.save(arg0);
	}

	@Override
	public <S extends Classe> S saveAndFlush(S arg0) {
		return ClasseRepository.saveAndFlush(arg0);
	}



	
	
	
}
