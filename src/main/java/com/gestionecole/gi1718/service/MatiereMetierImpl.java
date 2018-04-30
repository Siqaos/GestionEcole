package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.MatiereRepository;
import com.gestionecole.gi1718.entites.Matiere;

@Service
public class MatiereMetierImpl implements MatiereService {
	@Autowired
	private MatiereRepository MatiereRepository;

	@Override
	public Page<Matiere> chercherMatiere(String x, Pageable pageable) {
		return MatiereRepository.chercherMatiere(x, pageable);
	}

	@Override
	public <S extends Matiere> S save(S entity) {
		return MatiereRepository.save(entity);
	}

	@Override
	public <S extends Matiere> S findOne(Example<S> example) {
		return MatiereRepository.findOne(example);
	}

	@Override
	public Page<Matiere> findAll(Pageable pageable) {
		return MatiereRepository.findAll(pageable);
	}

	@Override
	public Matiere findOne(Integer id) {
		return MatiereRepository.findOne(id);
	}

	@Override
	public boolean exists(Integer id) {
		return MatiereRepository.exists(id);
	}

	@Override
	public long count() {
		return MatiereRepository.count();
	}

	@Override
	public <S extends Matiere> Page<S> findAll(Example<S> example, Pageable pageable) {
		return MatiereRepository.findAll(example, pageable);
	}

	@Override
	public void delete(Integer id) {
		MatiereRepository.delete(id);
	}

	@Override
	public void delete(Matiere entity) {
		MatiereRepository.delete(entity);
	}

	@Override
	public <S extends Matiere> long count(Example<S> example) {
		return MatiereRepository.count(example);
	}

	@Override
	public void delete(Iterable<? extends Matiere> entities) {
		MatiereRepository.delete(entities);
	}

	@Override
	public void deleteAll() {
		MatiereRepository.deleteAll();
	}

	@Override
	public void deleteAllInBatch() {
		MatiereRepository.deleteAllInBatch();
	}

	@Override
	public void deleteInBatch(Iterable<Matiere> arg0) {
		MatiereRepository.deleteInBatch(arg0);
	}

	@Override
	public <S extends Matiere> boolean exists(Example<S> example) {
		return MatiereRepository.exists(example);
	}

	@Override
	public List<Matiere> findAll() {
		return MatiereRepository.findAll();
	}

	@Override
	public <S extends Matiere> List<S> findAll(Example<S> arg0, Sort arg1) {
		return MatiereRepository.findAll(arg0, arg1);
	}

	@Override
	public <S extends Matiere> List<S> findAll(Example<S> arg0) {
		return MatiereRepository.findAll(arg0);
	}

	@Override
	public List<Matiere> findAll(Iterable<Integer> arg0) {
		return MatiereRepository.findAll(arg0);
	}

	@Override
	public List<Matiere> findAll(Sort arg0) {
		return MatiereRepository.findAll(arg0);
	}

	@Override
	public void flush() {
		MatiereRepository.flush();
	}

	@Override
	public Matiere getOne(Integer arg0) {
		return MatiereRepository.getOne(arg0);
	}

	@Override
	public <S extends Matiere> List<S> save(Iterable<S> arg0) {
		return MatiereRepository.save(arg0);
	}

	@Override
	public <S extends Matiere> S saveAndFlush(S arg0) {
		return MatiereRepository.saveAndFlush(arg0);
	}


	
}
