package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Role;

public interface RoleService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Role> arg0);

	void delete(Role arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Role> findAll();

	Iterable<Role> findAll(Iterable<Integer> arg0);

	Role findOne(Integer arg0);

	<S extends Role> Iterable<S> save(Iterable<S> arg0);

	<S extends Role> S save(S arg0);

}