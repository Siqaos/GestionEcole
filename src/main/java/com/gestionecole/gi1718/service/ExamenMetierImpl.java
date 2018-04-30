package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.ClasseRepository;
import com.gestionecole.gi1718.dao.ExamenRepository;
import com.gestionecole.gi1718.dao.MatiereRepository;
import com.gestionecole.gi1718.entites.Classe;
import com.gestionecole.gi1718.entites.Examen;

@Service
public class ExamenMetierImpl implements  ExamenService  {
	@Autowired
	private ExamenRepository examenRepository;
	@Autowired
	private MatiereRepository matiereRepository;
	@Autowired
	private ClasseRepository classeRepository;

	@Override
	public <S extends Examen> S saveExam(S arg0,String matiere,String classe) {
		//arg0.setEleve(eleveRepository.findByMatricule(matriculeEleve));
		arg0.setMatiere(matiereRepository.findByNom(matiere));
		arg0.setClasse(classeRepository.findByNom(classe));
		arg0.setValide(false);
		return examenRepository.save(arg0);
	}

	@Override
	public Classe findByNom(String classe) {
		return classeRepository.findByNom(classe);
	}

	@Override
	public <S extends Classe> S save(S entity) {
		return classeRepository.save(entity);
	}

	@Override
	public <S extends Classe> S findOne(Example<S> example) {
		return classeRepository.findOne(example);
	}

	@Override
	public Page<Classe> findAll(Pageable pageable) {
		return classeRepository.findAll(pageable);
	}

	@Override
	public Classe findOne(Integer id) {
		return classeRepository.findOne(id);
	}

	@Override
	public boolean exists(Integer id) {
		return classeRepository.exists(id);
	}

	@Override
	public long count() {
		return classeRepository.count();
	}

	@Override
	public <S extends Classe> Page<S> findAll(Example<S> example, Pageable pageable) {
		return classeRepository.findAll(example, pageable);
	}

	@Override
	public void delete(Integer id) {
		classeRepository.delete(id);
	}

	@Override
	public void delete(Classe entity) {
		classeRepository.delete(entity);
	}

	@Override
	public <S extends Classe> long count(Example<S> example) {
		return classeRepository.count(example);
	}

	@Override
	public void delete(Iterable<? extends Classe> entities) {
		classeRepository.delete(entities);
	}

	@Override
	public void deleteAll() {
		classeRepository.deleteAll();
	}

	@Override
	public void deleteAllInBatch() {
		classeRepository.deleteAllInBatch();
	}

	@Override
	public void deleteInBatch(Iterable<Classe> arg0) {
		classeRepository.deleteInBatch(arg0);
	}

	@Override
	public <S extends Classe> boolean exists(Example<S> example) {
		return classeRepository.exists(example);
	}

	@Override
	public List<Classe> findAll() {
		return classeRepository.findAll();
	}

	@Override
	public <S extends Classe> List<S> findAll(Example<S> arg0, Sort arg1) {
		return classeRepository.findAll(arg0, arg1);
	}

	@Override
	public <S extends Classe> List<S> findAll(Example<S> arg0) {
		return classeRepository.findAll(arg0);
	}

	@Override
	public List<Classe> findAll(Iterable<Integer> arg0) {
		return classeRepository.findAll(arg0);
	}

	@Override
	public List<Classe> findAll(Sort arg0) {
		return classeRepository.findAll(arg0);
	}

	@Override
	public void flush() {
		classeRepository.flush();
	}

	@Override
	public Classe getOne(Integer arg0) {
		return classeRepository.getOne(arg0);
	}

	@Override
	public <S extends Classe> List<S> save(Iterable<S> arg0) {
		return classeRepository.save(arg0);
	}

	@Override
	public <S extends Classe> S saveAndFlush(S arg0) {
		return classeRepository.saveAndFlush(arg0);
	}
	
	
	
}
