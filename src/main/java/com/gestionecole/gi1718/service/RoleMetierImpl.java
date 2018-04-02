package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.RoleRepository;
import com.gestionecole.gi1718.entites.Role;

@Service
public class RoleMetierImpl implements RoleService  {
	@Autowired
	private RoleRepository RoleRepository;

	@Override
	public long count() {
		return RoleRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		RoleRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Role> arg0) {
		RoleRepository.delete(arg0);
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
	public boolean exists(Integer arg0) {
		return RoleRepository.exists(arg0);
	}

	@Override
	public Iterable<Role> findAll() {
		return RoleRepository.findAll();
	}

	@Override
	public Iterable<Role> findAll(Iterable<Integer> arg0) {
		return RoleRepository.findAll(arg0);
	}

	@Override
	public Role findOne(Integer arg0) {
		return RoleRepository.findOne(arg0);
	}

	@Override
	public <S extends Role> Iterable<S> save(Iterable<S> arg0) {
		return RoleRepository.save(arg0);
	}

	@Override
	public <S extends Role> S save(S arg0) {
		return RoleRepository.save(arg0);
	}

	
	
	
}
