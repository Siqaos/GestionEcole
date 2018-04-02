package com.gestionecole.gi1718.service;

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
	public void delete(Integer arg0) {
		PositiongpsRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Positiongps> arg0) {
		PositiongpsRepository.delete(arg0);
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
	public boolean exists(Integer arg0) {
		return PositiongpsRepository.exists(arg0);
	}

	@Override
	public Iterable<Positiongps> findAll() {
		return PositiongpsRepository.findAll();
	}

	@Override
	public Iterable<Positiongps> findAll(Iterable<Integer> arg0) {
		return PositiongpsRepository.findAll(arg0);
	}

	@Override
	public Positiongps findOne(Integer arg0) {
		return PositiongpsRepository.findOne(arg0);
	}

	@Override
	public <S extends Positiongps> Iterable<S> save(Iterable<S> arg0) {
		return PositiongpsRepository.save(arg0);
	}

	@Override
	public <S extends Positiongps> S save(S arg0) {
		return PositiongpsRepository.save(arg0);
	}

	
	
	
}
