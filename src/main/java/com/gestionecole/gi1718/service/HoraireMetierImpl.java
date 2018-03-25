package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.HoraireRepository;
import com.gestionecole.gi1718.entites.Horaire;

@Service
public class HoraireMetierImpl implements HoraireService {
	@Autowired
	private HoraireRepository HoraireRepository;

	@Override
	public long count() {
		return HoraireRepository.count();
	}

	@Override
	public void delete(Horaire arg0) {
		HoraireRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		HoraireRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Horaire> arg0) {
		HoraireRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		HoraireRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return HoraireRepository.existsById(arg0);
	}

	@Override
	public Iterable<Horaire> findAll() {
		return HoraireRepository.findAll();
	}

	@Override
	public Iterable<Horaire> findAllById(Iterable<Integer> arg0) {
		return HoraireRepository.findAllById(arg0);
	}

	@Override
	public Optional<Horaire> findById(Integer arg0) {
		return HoraireRepository.findById(arg0);
	}

	@Override
	public <S extends Horaire> S save(S arg0) {
		return HoraireRepository.save(arg0);
	}

	@Override
	public <S extends Horaire> Iterable<S> saveAll(Iterable<S> arg0) {
		return HoraireRepository.saveAll(arg0);
	}
	
	
}
