package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.ContactRepository;
import com.gestionecole.gi1718.entites.Contact;

@Service
public class ContactMetierImpl implements Contactservice {
	@Autowired
	private ContactRepository ContactRepository;

	@Override
	public long count() {
		return ContactRepository.count();
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
	public boolean exists(Integer arg0) {
		return ContactRepository.exists(arg0);
	}

	@Override
	public Iterable<Contact> findAll() {
		return ContactRepository.findAll();
	}

	@Override
	public Iterable<Contact> findAll(Iterable<Integer> arg0) {
		return ContactRepository.findAll(arg0);
	}

	@Override
	public Contact findOne(Integer arg0) {
		return ContactRepository.findOne(arg0);
	}

	@Override
	public <S extends Contact> Iterable<S> save(Iterable<S> arg0) {
		return ContactRepository.save(arg0);
	}

	@Override
	public <S extends Contact> S save(S arg0) {
		return ContactRepository.save(arg0);
	}

	
	
}
