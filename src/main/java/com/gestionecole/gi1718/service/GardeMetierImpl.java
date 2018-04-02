package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.GardeRepository;
import com.gestionecole.gi1718.entites.Garde;

@Service
public class GardeMetierImpl implements GardeService   {
	@Autowired
	private GardeRepository GardeRepository;

	@Override
	public long count() {
		return GardeRepository.count();
	}

	@Override
	public void delete(Garde arg0) {
		GardeRepository.delete(arg0);
	}

	@Override
	public void delete(Integer arg0) {
		GardeRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Garde> arg0) {
		GardeRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		GardeRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return GardeRepository.exists(arg0);
	}

	@Override
	public Iterable<Garde> findAll() {
		return GardeRepository.findAll();
	}

	@Override
	public Iterable<Garde> findAll(Iterable<Integer> arg0) {
		return GardeRepository.findAll(arg0);
	}

	@Override
	public Garde findOne(Integer arg0) {
		return GardeRepository.findOne(arg0);
	}

	@Override
	public <S extends Garde> Iterable<S> save(Iterable<S> arg0) {
		return GardeRepository.save(arg0);
	}

	@Override
	public <S extends Garde> S save(S arg0) {
		return GardeRepository.save(arg0);
	}

	
	
	
}
