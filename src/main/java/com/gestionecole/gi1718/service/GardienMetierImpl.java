package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.GardienRepository;
import com.gestionecole.gi1718.entites.Gardien;

@Service
public class GardienMetierImpl implements GardienService    {
	@Autowired
	private GardienRepository GardienRepository;

	@Override
	public long count() {
		return GardienRepository.count();
	}

	@Override
	public void delete(Gardien arg0) {
		GardienRepository.delete(arg0);
	}

	@Override
	public void delete(Integer arg0) {
		GardienRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Gardien> arg0) {
		GardienRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		GardienRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return GardienRepository.exists(arg0);
	}

	@Override
	public Iterable<Gardien> findAll() {
		return GardienRepository.findAll();
	}

	@Override
	public Iterable<Gardien> findAll(Iterable<Integer> arg0) {
		return GardienRepository.findAll(arg0);
	}

	@Override
	public Gardien findOne(Integer arg0) {
		return GardienRepository.findOne(arg0);
	}

	@Override
	public <S extends Gardien> Iterable<S> save(Iterable<S> arg0) {
		return GardienRepository.save(arg0);
	}

	@Override
	public <S extends Gardien> S save(S arg0) {
		return GardienRepository.save(arg0);
	}

	
	
	
}
