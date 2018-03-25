package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Role;

public interface RoleService {

	long count();

	void delete(Role arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Role> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Role> findAll();

	Iterable<Role> findAllById(Iterable<Integer> arg0);

	Optional<Role> findById(Integer arg0);

	<S extends Role> S save(S arg0);

	<S extends Role> Iterable<S> saveAll(Iterable<S> arg0);

}