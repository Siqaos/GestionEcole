package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.SessionRepository;
import com.gestionecole.gi1718.entites.Session;

@Service
public class SessionMetierImpl implements SessionService  {
	@Autowired
	private SessionRepository SessionRepository;

	@Override
	public long count() {
		return SessionRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		SessionRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Session> arg0) {
		SessionRepository.delete(arg0);
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
	public boolean exists(Integer arg0) {
		return SessionRepository.exists(arg0);
	}

	@Override
	public Iterable<Session> findAll() {
		return SessionRepository.findAll();
	}

	@Override
	public Iterable<Session> findAll(Iterable<Integer> arg0) {
		return SessionRepository.findAll(arg0);
	}

	@Override
	public Session findOne(Integer arg0) {
		return SessionRepository.findOne(arg0);
	}

	@Override
	public <S extends Session> Iterable<S> save(Iterable<S> arg0) {
		return SessionRepository.save(arg0);
	}

	@Override
	public <S extends Session> S save(S arg0) {
		return SessionRepository.save(arg0);
	}

	
	
	
}
