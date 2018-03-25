package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.User;

public interface UserService {

	long count();

	void delete(User arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends User> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<User> findAll();

	Iterable<User> findAllById(Iterable<Integer> arg0);

	Optional<User> findById(Integer arg0);

	<S extends User> S save(S arg0);

	<S extends User> Iterable<S> saveAll(Iterable<S> arg0);

}