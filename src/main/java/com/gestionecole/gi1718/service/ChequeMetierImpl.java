package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.ChequeRepository;
import com.gestionecole.gi1718.entites.Cheque;

@Service
public class ChequeMetierImpl implements ChequeService  {
	@Autowired
	private ChequeRepository ChequeRepository;

	@Override
	public long count() {
		return ChequeRepository.count();
	}

	@Override
	public void delete(Cheque arg0) {
		ChequeRepository.delete(arg0);
	}

	@Override
	public void delete(Integer arg0) {
		ChequeRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Cheque> arg0) {
		ChequeRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		ChequeRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return ChequeRepository.exists(arg0);
	}

	@Override
	public Iterable<Cheque> findAll() {
		return ChequeRepository.findAll();
	}

	@Override
	public Iterable<Cheque> findAll(Iterable<Integer> arg0) {
		return ChequeRepository.findAll(arg0);
	}

	@Override
	public Cheque findOne(Integer arg0) {
		return ChequeRepository.findOne(arg0);
	}

	@Override
	public <S extends Cheque> Iterable<S> save(Iterable<S> arg0) {
		return ChequeRepository.save(arg0);
	}

	@Override
	public <S extends Cheque> S save(S arg0) {
		return ChequeRepository.save(arg0);
	}

	
	
	
}
