package com.gestionecole.gi1718.service;

import java.util.Optional;

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
	public void delete(User arg0) {
		UserRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		UserRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends User> arg0) {
		UserRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		UserRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return UserRepository.existsById(arg0);
	}

	@Override
	public Iterable<User> findAll() {
		return UserRepository.findAll();
	}

	@Override
	public Iterable<User> findAllById(Iterable<Integer> arg0) {
		return UserRepository.findAllById(arg0);
	}

	@Override
	public Optional<User> findById(Integer arg0) {
		return UserRepository.findById(arg0);
	}

	@Override
	public <S extends User> S save(S arg0) {
		return UserRepository.save(arg0);
	}

	@Override
	public <S extends User> Iterable<S> saveAll(Iterable<S> arg0) {
		return UserRepository.saveAll(arg0);
	}
	
	
}
