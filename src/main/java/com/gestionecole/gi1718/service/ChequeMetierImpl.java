package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.ChequeRepository;
import com.gestionecole.gi1718.entites.Cheque;

@Service
public class ChequeMetierImpl implements ChequeService {
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
	public void deleteAll() {
		ChequeRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Cheque> arg0) {
		ChequeRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		ChequeRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return ChequeRepository.existsById(arg0);
	}

	@Override
	public Iterable<Cheque> findAll() {
		return ChequeRepository.findAll();
	}

	@Override
	public Iterable<Cheque> findAllById(Iterable<Integer> arg0) {
		return ChequeRepository.findAllById(arg0);
	}

	@Override
	public Optional<Cheque> findById(Integer arg0) {
		return ChequeRepository.findById(arg0);
	}

	@Override
	public <S extends Cheque> S save(S arg0) {
		return ChequeRepository.save(arg0);
	}

	@Override
	public <S extends Cheque> Iterable<S> saveAll(Iterable<S> arg0) {
		return ChequeRepository.saveAll(arg0);
	}
	
	
}
