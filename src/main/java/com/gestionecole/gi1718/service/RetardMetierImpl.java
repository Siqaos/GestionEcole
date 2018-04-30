package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.gestionecole.gi1718.dao.EleveRepository;
import com.gestionecole.gi1718.dao.MatiereRepository;
import com.gestionecole.gi1718.dao.RetardRepository;
import com.gestionecole.gi1718.entites.Retard;

@Service
public class RetardMetierImpl implements RetardService  {
	@Autowired
	private RetardRepository RetardRepository;
	@Autowired
	private EleveRepository eleveRepository;
	
	@Autowired
	private MatiereRepository matiereRepository;
	public long count() {
		return RetardRepository.count();
	}

	public <S extends Retard> long count(Example<S> arg0) {
		return RetardRepository.count(arg0);
	}

	public void delete(Integer arg0) {
		RetardRepository.delete(arg0);
	}

	public void delete(Iterable<? extends Retard> arg0) {
		RetardRepository.delete(arg0);
	}

	public void delete(Retard arg0) {
		RetardRepository.delete(arg0);
	}

	public void deleteAll() {
		RetardRepository.deleteAll();
	}

	public void deleteAllInBatch() {
		RetardRepository.deleteAllInBatch();
	}

	public void deleteInBatch(Iterable<Retard> arg0) {
		RetardRepository.deleteInBatch(arg0);
	}

	public <S extends Retard> boolean exists(Example<S> arg0) {
		return RetardRepository.exists(arg0);
	}

	public boolean exists(Integer arg0) {
		return RetardRepository.exists(arg0);
	}

	public List<Retard> findAll() {
		return RetardRepository.findAll();
	}

	public <S extends Retard> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		return RetardRepository.findAll(arg0, arg1);
	}

	public <S extends Retard> List<S> findAll(Example<S> arg0, Sort arg1) {
		return RetardRepository.findAll(arg0, arg1);
	}

	public <S extends Retard> List<S> findAll(Example<S> arg0) {
		return RetardRepository.findAll(arg0);
	}

	public List<Retard> findAll(Iterable<Integer> arg0) {
		return RetardRepository.findAll(arg0);
	}

	public Page<Retard> findAll(Pageable arg0) {
		return RetardRepository.findAll(arg0);
	}

	public List<Retard> findAll(Sort arg0) {
		return RetardRepository.findAll(arg0);
	}

	public <S extends Retard> S findOne(Example<S> arg0) {
		return RetardRepository.findOne(arg0);
	}

	public Retard findOne(Integer arg0) {
		return RetardRepository.findOne(arg0);
	}

	public void flush() {
		RetardRepository.flush();
	}

	public Retard getOne(Integer arg0) {
		return RetardRepository.getOne(arg0);
	}

	public <S extends Retard> List<S> save(Iterable<S> arg0) {
		return RetardRepository.save(arg0);
	}

	public <S extends Retard> S save(S arg0) {
		return RetardRepository.save(arg0);
	}

	public <S extends Retard> S saveAndFlush(S arg0) {
		return RetardRepository.saveAndFlush(arg0);
	}
	@Override
	public <S extends Retard> S saveRetard(S arg0,String matriculeEleve,String matiere) {
		arg0.setEleve(eleveRepository.findByMatricule(matriculeEleve));
		arg0.setMatiere(matiereRepository.findByNom(matiere));
		return RetardRepository.save(arg0);
	}

	
	
}
