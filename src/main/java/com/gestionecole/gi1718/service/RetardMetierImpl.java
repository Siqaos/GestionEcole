package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.RetardRepository;
import com.gestionecole.gi1718.entites.Retard;

@Service
public class RetardMetierImpl implements RetardService  {
	@Autowired
	private RetardRepository RetardRepository;

	@Override
	public long count() {
		return RetardRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		RetardRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Retard> arg0) {
		RetardRepository.delete(arg0);
	}

	@Override
	public void delete(Retard arg0) {
		RetardRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		RetardRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return RetardRepository.exists(arg0);
	}

	@Override
	public Iterable<Retard> findAll() {
		return RetardRepository.findAll();
	}

	@Override
	public Iterable<Retard> findAll(Iterable<Integer> arg0) {
		return RetardRepository.findAll(arg0);
	}

	@Override
	public Retard findOne(Integer arg0) {
		return RetardRepository.findOne(arg0);
	}

	@Override
	public <S extends Retard> Iterable<S> save(Iterable<S> arg0) {
		return RetardRepository.save(arg0);
	}

	@Override
	public <S extends Retard> S save(S arg0) {
		return RetardRepository.save(arg0);
	}

	
	
}
