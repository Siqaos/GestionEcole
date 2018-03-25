package com.gestionecole.gi1718.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.BulletinRepository;
import com.gestionecole.gi1718.entites.Bulletin;

@Service
public class BulletinMetierImpl implements BulletinService {
	@Autowired
	private BulletinRepository BulletinRepository;

	@Override
	public long count() {
		return BulletinRepository.count();
	}

	@Override
	public void delete(Bulletin arg0) {
		BulletinRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		BulletinRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Bulletin> arg0) {
		BulletinRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		BulletinRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return BulletinRepository.existsById(arg0);
	}

	@Override
	public Iterable<Bulletin> findAll() {
		return BulletinRepository.findAll();
	}

	@Override
	public Iterable<Bulletin> findAllById(Iterable<Integer> arg0) {
		return BulletinRepository.findAllById(arg0);
	}

	@Override
	public Optional<Bulletin> findById(Integer arg0) {
		return BulletinRepository.findById(arg0);
	}

	@Override
	public <S extends Bulletin> S save(S arg0) {
		return BulletinRepository.save(arg0);
	}

	@Override
	public <S extends Bulletin> Iterable<S> saveAll(Iterable<S> arg0) {
		return BulletinRepository.saveAll(arg0);
	}
	
	
}
