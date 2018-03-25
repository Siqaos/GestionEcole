package com.gestionecole.gi1718.service;

import java.util.Optional;

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
	public void delete(Transport arg0) {
		TransportRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		TransportRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Transport> arg0) {
		TransportRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		TransportRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return TransportRepository.existsById(arg0);
	}

	@Override
	public Iterable<Transport> findAll() {
		return TransportRepository.findAll();
	}

	@Override
	public Iterable<Transport> findAllById(Iterable<Integer> arg0) {
		return TransportRepository.findAllById(arg0);
	}

	@Override
	public Optional<Transport> findById(Integer arg0) {
		return TransportRepository.findById(arg0);
	}

	@Override
	public <S extends Transport> S save(S arg0) {
		return TransportRepository.save(arg0);
	}

	@Override
	public <S extends Transport> Iterable<S> saveAll(Iterable<S> arg0) {
		return TransportRepository.saveAll(arg0);
	}
	
	
}
