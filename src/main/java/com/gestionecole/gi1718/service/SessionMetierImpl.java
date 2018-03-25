package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.SessionRepository;
import com.gestionecole.gi1718.entites.Session;

@Service
public class SessionMetierImpl implements SessionService {
	@Autowired
	private SessionRepository SessionRepository;

	@Override
	public long count() {
		return SessionRepository.count();
	}

	@Override
	public void delete(Session arg0) {
		SessionRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		SessionRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Session> arg0) {
		SessionRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		SessionRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return SessionRepository.existsById(arg0);
	}

	@Override
	public Iterable<Session> findAll() {
		return SessionRepository.findAll();
	}

	@Override
	public Iterable<Session> findAllById(Iterable<Integer> arg0) {
		return SessionRepository.findAllById(arg0);
	}

	@Override
	public Optional<Session> findById(Integer arg0) {
		return SessionRepository.findById(arg0);
	}

	@Override
	public <S extends Session> S save(S arg0) {
		return SessionRepository.save(arg0);
	}

	@Override
	public <S extends Session> Iterable<S> saveAll(Iterable<S> arg0) {
		return SessionRepository.saveAll(arg0);
	}
	
	
}
