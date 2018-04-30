package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.ContactRepository;
import com.gestionecole.gi1718.entites.Contact;

@Service
public class ContactMetierImpl implements ContactService{
	@Autowired
	private ContactRepository ContactRepository;
	@Autowired
	private FournisseurService fournisseur;

	@Override
	public long count() {
		return ContactRepository.count();
	}

	@Override
	public <S extends Contact> long count(Example<S> arg0) {
		return ContactRepository.count(arg0);
	}

	@Override
	public void delete(Contact arg0) {
		ContactRepository.delete(arg0);
	}

	@Override
	public void delete(Integer arg0) {
		ContactRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Contact> arg0) {
		ContactRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		ContactRepository.deleteAll();
	}

	@Override
	public void deleteAllInBatch() {
		ContactRepository.deleteAllInBatch();
	}

	@Override
	public void deleteInBatch(Iterable<Contact> arg0) {
		ContactRepository.deleteInBatch(arg0);
	}

	@Override
	public <S extends Contact> boolean exists(Example<S> arg0) {
		return ContactRepository.exists(arg0);
	}

	@Override
	public boolean exists(Integer arg0) {
		return ContactRepository.exists(arg0);
	}

	@Override
	public List<Contact> findAll() {
		return ContactRepository.findAll();
	}

	@Override
	public <S extends Contact> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		return ContactRepository.findAll(arg0, arg1);
	}

	@Override
	public <S extends Contact> List<S> findAll(Example<S> arg0, Sort arg1) {
		return ContactRepository.findAll(arg0, arg1);
	}

	@Override
	public <S extends Contact> List<S> findAll(Example<S> arg0) {
		return ContactRepository.findAll(arg0);
	}

	@Override
	public List<Contact> findAll(Iterable<Integer> arg0) {
		return ContactRepository.findAll(arg0);
	}

	@Override
	public Page<Contact> findAll(Pageable arg0) {
		return ContactRepository.findAll(arg0);
	}

	@Override
	public List<Contact> findAll(Sort arg0) {
		return ContactRepository.findAll(arg0);
	}

	@Override
	public <S extends Contact> S findOne(Example<S> arg0) {
		return ContactRepository.findOne(arg0);
	}

	@Override
	public Contact findOne(Integer arg0) {
		return ContactRepository.findOne(arg0);
	}

	@Override
	public void flush() {
		ContactRepository.flush();
	}

	@Override
	public Contact getOne(Integer arg0) {
		return ContactRepository.getOne(arg0);
	}

	@Override
	public <S extends Contact> List<S> save(Iterable<S> arg0) {
		return ContactRepository.save(arg0);
	}

	@Override
	public <S extends Contact> S save(S arg0) {
		return ContactRepository.save(arg0);
	}

	@Override
	public <S extends Contact> S saveAndFlush(S arg0) {
		return ContactRepository.saveAndFlush(arg0);
	}

	@Override
	public <S extends Contact> S saveContact(S arg0,String nom) {
		
		arg0.setFournisseur(fournisseur.findByNom(nom));
		return ContactRepository.save(arg0);
	}
	
	
	
}
