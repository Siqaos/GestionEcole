package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.User;

public interface UserService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends User> arg0);

	void delete(User arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<User> findAll();

	Iterable<User> findAll(Iterable<Integer> arg0);

	User findOne(Integer arg0);

	<S extends User> Iterable<S> save(Iterable<S> arg0);

	<S extends User> S save(S arg0);

}