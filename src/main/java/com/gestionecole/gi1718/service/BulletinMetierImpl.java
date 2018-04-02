package com.gestionecole.gi1718.service;

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
	public void delete(Integer arg0) {
		BulletinRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Bulletin> arg0) {
		BulletinRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		BulletinRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return BulletinRepository.exists(arg0);
	}

	@Override
	public Iterable<Bulletin> findAll() {
		return BulletinRepository.findAll();
	}

	@Override
	public Iterable<Bulletin> findAll(Iterable<Integer> arg0) {
		return BulletinRepository.findAll(arg0);
	}

	@Override
	public Bulletin findOne(Integer arg0) {
		return BulletinRepository.findOne(arg0);
	}

	@Override
	public <S extends Bulletin> Iterable<S> save(Iterable<S> arg0) {
		return BulletinRepository.save(arg0);
	}

	@Override
	public <S extends Bulletin> S save(S arg0) {
		return BulletinRepository.save(arg0);
	}

	
	
}
