package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.ContactRepository;
import com.gestionecole.gi1718.entites.Contact;

@Service
public class ContactMetierImpl implements ContactService {
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
	public void deleteAll() {
		ContactRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Contact> arg0) {
		ContactRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		ContactRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return ContactRepository.existsById(arg0);
	}

	@Override
	public Iterable<Contact> findAll() {
		return ContactRepository.findAll();
	}

	@Override
	public Iterable<Contact> findAllById(Iterable<Integer> arg0) {
		return ContactRepository.findAllById(arg0);
	}

	@Override
	public Optional<Contact> findById(Integer arg0) {
		return ContactRepository.findById(arg0);
	}

	@Override
	public <S extends Contact> S save(S arg0) {
		return ContactRepository.save(arg0);
	}

	@Override
	public <S extends Contact> Iterable<S> saveAll(Iterable<S> arg0) {
		return ContactRepository.saveAll(arg0);
	}
	
	
}
