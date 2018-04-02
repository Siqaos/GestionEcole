package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.TransportRepository;
import com.gestionecole.gi1718.entites.Transport;

@Service
public class TransportMetierImpl implements TransportService {
	@Autowired
	private TransportRepository TransportRepository;

	@Override
	public long count() {
		return TransportRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		TransportRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Transport> arg0) {
		TransportRepository.delete(arg0);
	}

	@Override
	public void delete(Transport arg0) {
		TransportRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		TransportRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return TransportRepository.exists(arg0);
	}

	@Override
	public Iterable<Transport> findAll() {
		return TransportRepository.findAll();
	}

	@Override
	public Iterable<Transport> findAll(Iterable<Integer> arg0) {
		return TransportRepository.findAll(arg0);
	}

	@Override
	public Transport findOne(Integer arg0) {
		return TransportRepository.findOne(arg0);
	}

	@Override
	public <S extends Transport> Iterable<S> save(Iterable<S> arg0) {
		return TransportRepository.save(arg0);
	}

	@Override
	public <S extends Transport> S save(S arg0) {
		return TransportRepository.save(arg0);
	}

	
	
	
}
