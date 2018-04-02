package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.UserRepository;
import com.gestionecole.gi1718.entites.User;

@Service
public class UserMetierImpl implements UserService {
	@Autowired
	private UserRepository UserRepository;

	@Override
	public long count() {
		return UserRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		UserRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends User> arg0) {
		UserRepository.delete(arg0);
	}

	@Override
	public void delete(User arg0) {
		UserRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		UserRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return UserRepository.exists(arg0);
	}

	@Override
	public Iterable<User> findAll() {
		return UserRepository.findAll();
	}

	@Override
	public Iterable<User> findAll(Iterable<Integer> arg0) {
		return UserRepository.findAll(arg0);
	}

	@Override
	public User findOne(Integer arg0) {
		return UserRepository.findOne(arg0);
	}

	@Override
	public <S extends User> Iterable<S> save(Iterable<S> arg0) {
		return UserRepository.save(arg0);
	}

	@Override
	public <S extends User> S save(S arg0) {
		return UserRepository.save(arg0);
	}

	
	
}
