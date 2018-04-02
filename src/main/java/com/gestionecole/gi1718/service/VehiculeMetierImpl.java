package com.gestionecole.gi1718.service;

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
	public void delete(Integer arg0) {
		VehiculeRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Vehicule> arg0) {
		VehiculeRepository.delete(arg0);
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
	public boolean exists(Integer arg0) {
		return VehiculeRepository.exists(arg0);
	}

	@Override
	public Iterable<Vehicule> findAll() {
		return VehiculeRepository.findAll();
	}

	@Override
	public Iterable<Vehicule> findAll(Iterable<Integer> arg0) {
		return VehiculeRepository.findAll(arg0);
	}

	@Override
	public Vehicule findOne(Integer arg0) {
		return VehiculeRepository.findOne(arg0);
	}

	@Override
	public <S extends Vehicule> Iterable<S> save(Iterable<S> arg0) {
		return VehiculeRepository.save(arg0);
	}

	@Override
	public <S extends Vehicule> S save(S arg0) {
		return VehiculeRepository.save(arg0);
	}

	
	
}
