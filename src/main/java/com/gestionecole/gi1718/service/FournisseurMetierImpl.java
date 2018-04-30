package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.FournisseurRepository;
import com.gestionecole.gi1718.entites.Fournisseur;

@Service
public class FournisseurMetierImpl implements FournisseurService   {
	@Autowired
	private FournisseurRepository FournisseurRepository;

	@Override
	public long count() {
		return FournisseurRepository.count();
	}

	@Override
	public <S extends Fournisseur> long count(Example<S> arg0) {
		return FournisseurRepository.count(arg0);
	}

	@Override
	public void delete(Fournisseur arg0) {
		FournisseurRepository.delete(arg0);
	}

	@Override
	public void delete(Integer arg0) {
		FournisseurRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Fournisseur> arg0) {
		FournisseurRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		FournisseurRepository.deleteAll();
	}

	@Override
	public void deleteAllInBatch() {
		FournisseurRepository.deleteAllInBatch();
	}

	@Override
	public void deleteInBatch(Iterable<Fournisseur> arg0) {
		FournisseurRepository.deleteInBatch(arg0);
	}

	@Override
	public <S extends Fournisseur> boolean exists(Example<S> arg0) {
		return FournisseurRepository.exists(arg0);
	}

	@Override
	public boolean exists(Integer arg0) {
		return FournisseurRepository.exists(arg0);
	}

	@Override
	public List<Fournisseur> findAll() {
		return FournisseurRepository.findAll();
	}

	@Override
	public <S extends Fournisseur> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		return FournisseurRepository.findAll(arg0, arg1);
	}

	@Override
	public <S extends Fournisseur> List<S> findAll(Example<S> arg0, Sort arg1) {
		return FournisseurRepository.findAll(arg0, arg1);
	}

	@Override
	public <S extends Fournisseur> List<S> findAll(Example<S> arg0) {
		return FournisseurRepository.findAll(arg0);
	}

	@Override
	public List<Fournisseur> findAll(Iterable<Integer> arg0) {
		return FournisseurRepository.findAll(arg0);
	}

	@Override
	public Page<Fournisseur> findAll(Pageable arg0) {
		return FournisseurRepository.findAll(arg0);
	}

	@Override
	public List<Fournisseur> findAll(Sort arg0) {
		return FournisseurRepository.findAll(arg0);
	}

	@Override
	public Fournisseur findByNom(String nom) {
		return FournisseurRepository.findByNom(nom);
	}

	@Override
	public <S extends Fournisseur> S findOne(Example<S> arg0) {
		return FournisseurRepository.findOne(arg0);
	}

	@Override
	public Fournisseur findOne(Integer arg0) {
		return FournisseurRepository.findOne(arg0);
	}

	@Override
	public void flush() {
		FournisseurRepository.flush();
	}

	@Override
	public Fournisseur getOne(Integer arg0) {
		return FournisseurRepository.getOne(arg0);
	}

	@Override
	public <S extends Fournisseur> List<S> save(Iterable<S> arg0) {
		return FournisseurRepository.save(arg0);
	}

	@Override
	public <S extends Fournisseur> S save(S arg0) {
		return FournisseurRepository.save(arg0);
	}

	@Override
	public <S extends Fournisseur> S saveAndFlush(S arg0) {
		return FournisseurRepository.saveAndFlush(arg0);
	}

}
