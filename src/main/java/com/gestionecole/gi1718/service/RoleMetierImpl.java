package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.RoleRepository;
import com.gestionecole.gi1718.entites.Role;

@Service
public class RoleMetierImpl implements RoleService {
	@Autowired
	private RoleRepository RoleRepository;

	@Override
	public long count() {
		return RoleRepository.count();
	}

	@Override
	public void delete(Role arg0) {
		RoleRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		RoleRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Role> arg0) {
		RoleRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		RoleRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return RoleRepository.existsById(arg0);
	}

	@Override
	public Iterable<Role> findAll() {
		return RoleRepository.findAll();
	}

	@Override
	public Iterable<Role> findAllById(Iterable<Integer> arg0) {
		return RoleRepository.findAllById(arg0);
	}

	@Override
	public Optional<Role> findById(Integer arg0) {
		return RoleRepository.findById(arg0);
	}

	@Override
	public <S extends Role> S save(S arg0) {
		return RoleRepository.save(arg0);
	}

	@Override
	public <S extends Role> Iterable<S> saveAll(Iterable<S> arg0) {
		return RoleRepository.saveAll(arg0);
	}
	
	
}
