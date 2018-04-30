package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.NiveauRepository;
import com.gestionecole.gi1718.entites.Niveau;

@Service
public class NiveauMetierImpl implements NiveauService  {
	@Autowired
	private NiveauRepository NiveauRepository;

	@Override
	public Page<Niveau> chercherNiveau(String x, Pageable pageable) {
		return NiveauRepository.chercherNiveau(x, pageable);
	}

	@Override
	public <S extends Niveau> S save(S entity) {
		return NiveauRepository.save(entity);
	}

	@Override
	public <S extends Niveau> S findOne(Example<S> example) {
		return NiveauRepository.findOne(example);
	}

	@Override
	public Page<Niveau> findAll(Pageable pageable) {
		return NiveauRepository.findAll(pageable);
	}

	@Override
	public Niveau findOne(Integer id) {
		return NiveauRepository.findOne(id);
	}

	@Override
	public boolean exists(Integer id) {
		return NiveauRepository.exists(id);
	}

	@Override
	public long count() {
		return NiveauRepository.count();
	}

	@Override
	public <S extends Niveau> Page<S> findAll(Example<S> example, Pageable pageable) {
		return NiveauRepository.findAll(example, pageable);
	}

	@Override
	public void delete(Integer id) {
		NiveauRepository.delete(id);
	}

	@Override
	public void delete(Niveau entity) {
		NiveauRepository.delete(entity);
	}

	@Override
	public <S extends Niveau> long count(Example<S> example) {
		return NiveauRepository.count(example);
	}

	@Override
	public void delete(Iterable<? extends Niveau> entities) {
		NiveauRepository.delete(entities);
	}

	@Override
	public void deleteAll() {
		NiveauRepository.deleteAll();
	}

	@Override
	public void deleteAllInBatch() {
		NiveauRepository.deleteAllInBatch();
	}

	@Override
	public void deleteInBatch(Iterable<Niveau> arg0) {
		NiveauRepository.deleteInBatch(arg0);
	}

	@Override
	public <S extends Niveau> boolean exists(Example<S> example) {
		return NiveauRepository.exists(example);
	}

	@Override
	public List<Niveau> findAll() {
		return NiveauRepository.findAll();
	}

	@Override
	public <S extends Niveau> List<S> findAll(Example<S> arg0, Sort arg1) {
		return NiveauRepository.findAll(arg0, arg1);
	}

	@Override
	public <S extends Niveau> List<S> findAll(Example<S> arg0) {
		return NiveauRepository.findAll(arg0);
	}

	@Override
	public List<Niveau> findAll(Iterable<Integer> arg0) {
		return NiveauRepository.findAll(arg0);
	}

	@Override
	public List<Niveau> findAll(Sort arg0) {
		return NiveauRepository.findAll(arg0);
	}

	@Override
	public void flush() {
		NiveauRepository.flush();
	}

	@Override
	public Niveau getOne(Integer arg0) {
		return NiveauRepository.getOne(arg0);
	}

	@Override
	public <S extends Niveau> List<S> save(Iterable<S> arg0) {
		return NiveauRepository.save(arg0);
	}

	@Override
	public <S extends Niveau> S saveAndFlush(S arg0) {
		return NiveauRepository.saveAndFlush(arg0);
	}

	
	
	
}
