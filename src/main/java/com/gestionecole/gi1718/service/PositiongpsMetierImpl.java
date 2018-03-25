package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.PositiongpsRepository;
import com.gestionecole.gi1718.entites.Positiongps;

@Service
public class PositiongpsMetierImpl implements PositiongpsService {
	@Autowired
	private PositiongpsRepository PositiongpsRepository;

	@Override
	public long count() {
		return PositiongpsRepository.count();
	}

	@Override
	public void delete(Positiongps arg0) {
		PositiongpsRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		PositiongpsRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Positiongps> arg0) {
		PositiongpsRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		PositiongpsRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return PositiongpsRepository.existsById(arg0);
	}

	@Override
	public Iterable<Positiongps> findAll() {
		return PositiongpsRepository.findAll();
	}

	@Override
	public Iterable<Positiongps> findAllById(Iterable<Integer> arg0) {
		return PositiongpsRepository.findAllById(arg0);
	}

	@Override
	public Optional<Positiongps> findById(Integer arg0) {
		return PositiongpsRepository.findById(arg0);
	}

	@Override
	public <S extends Positiongps> S save(S arg0) {
		return PositiongpsRepository.save(arg0);
	}

	@Override
	public <S extends Positiongps> Iterable<S> saveAll(Iterable<S> arg0) {
		return PositiongpsRepository.saveAll(arg0);
	}
	
	
}
