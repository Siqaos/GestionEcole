package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.CahiertexteRepository;
import com.gestionecole.gi1718.dao.ClasseRepository;
import com.gestionecole.gi1718.dao.MatiereRepository;
import com.gestionecole.gi1718.entites.Cahiertexte;

@Service
public class CahiertexteMetierImpl implements CahiertexteService  {
	@Autowired
	private CahiertexteRepository CahiertexteRepository;
	@Autowired
	private MatiereRepository matiereRepository;
	
	@Autowired
	private ClasseRepository classeRepository;
	@Override
	public long count() {
		return CahiertexteRepository.count();
	}

	@Override
	public <S extends Cahiertexte> long count(Example<S> arg0) {
		return CahiertexteRepository.count(arg0);
	}

	@Override
	public void delete(Cahiertexte arg0) {
		CahiertexteRepository.delete(arg0);
	}

	@Override
	public void delete(Integer arg0) {
		CahiertexteRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Cahiertexte> arg0) {
		CahiertexteRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		CahiertexteRepository.deleteAll();
	}

	@Override
	public void deleteAllInBatch() {
		CahiertexteRepository.deleteAllInBatch();
	}

	@Override
	public void deleteInBatch(Iterable<Cahiertexte> arg0) {
		CahiertexteRepository.deleteInBatch(arg0);
	}

	@Override
	public <S extends Cahiertexte> boolean exists(Example<S> arg0) {
		return CahiertexteRepository.exists(arg0);
	}

	@Override
	public boolean exists(Integer arg0) {
		return CahiertexteRepository.exists(arg0);
	}

	@Override
	public List<Cahiertexte> findAll() {
		return CahiertexteRepository.findAll();
	}

	@Override
	public <S extends Cahiertexte> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		return CahiertexteRepository.findAll(arg0, arg1);
	}

	@Override
	public <S extends Cahiertexte> List<S> findAll(Example<S> arg0, Sort arg1) {
		return CahiertexteRepository.findAll(arg0, arg1);
	}

	@Override
	public <S extends Cahiertexte> List<S> findAll(Example<S> arg0) {
		return CahiertexteRepository.findAll(arg0);
	}

	@Override
	public List<Cahiertexte> findAll(Iterable<Integer> arg0) {
		return CahiertexteRepository.findAll(arg0);
	}

	@Override
	public Page<Cahiertexte> findAll(Pageable arg0) {
		return CahiertexteRepository.findAll(arg0);
	}

	@Override
	public List<Cahiertexte> findAll(Sort arg0) {
		return CahiertexteRepository.findAll(arg0);
	}

	@Override
	public <S extends Cahiertexte> S findOne(Example<S> arg0) {
		return CahiertexteRepository.findOne(arg0);
	}

	@Override
	public Cahiertexte findOne(Integer arg0) {
		return CahiertexteRepository.findOne(arg0);
	}

	@Override
	public void flush() {
		CahiertexteRepository.flush();
	}

	@Override
	public Cahiertexte getOne(Integer arg0) {
		return CahiertexteRepository.getOne(arg0);
	}

	@Override
	public <S extends Cahiertexte> List<S> save(Iterable<S> arg0) {
		return CahiertexteRepository.save(arg0);
	}

	@Override
	public <S extends Cahiertexte> S save(S arg0) {
		return CahiertexteRepository.save(arg0);
	}

	@Override
	public <S extends Cahiertexte> S saveAndFlush(S arg0) {
		return CahiertexteRepository.saveAndFlush(arg0);
	}

	@Override
	public <S extends Cahiertexte> S saveCahierText(S arg0,String matiere,String classe) {
		//arg0.setEleve(eleveRepository.findByMatricule(matriculeEleve));
		arg0.setMatiere(matiereRepository.findByNom(matiere));
		arg0.setClasseCahier(classeRepository.findByNom(classe));
		return CahiertexteRepository.save(arg0);
	}

	
	
	
}
