package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.VehiculeRepository;
import com.gestionecole.gi1718.entites.Vehicule;

@Service
public class VehiculeMetierImpl implements VehiculeService {
	@Autowired
	private VehiculeRepository VehiculeRepository;

	@Override
	public long count() {
		return VehiculeRepository.count();
	}

	@Override
	public void delete(Vehicule arg0) {
		VehiculeRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		VehiculeRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Vehicule> arg0) {
		VehiculeRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		VehiculeRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return VehiculeRepository.existsById(arg0);
	}

	@Override
	public Iterable<Vehicule> findAll() {
		return VehiculeRepository.findAll();
	}

	@Override
	public Iterable<Vehicule> findAllById(Iterable<Integer> arg0) {
		return VehiculeRepository.findAllById(arg0);
	}

	@Override
	public Optional<Vehicule> findById(Integer arg0) {
		return VehiculeRepository.findById(arg0);
	}

	@Override
	public <S extends Vehicule> S save(S arg0) {
		return VehiculeRepository.save(arg0);
	}

	@Override
	public <S extends Vehicule> Iterable<S> saveAll(Iterable<S> arg0) {
		return VehiculeRepository.saveAll(arg0);
	}
	
	
}
