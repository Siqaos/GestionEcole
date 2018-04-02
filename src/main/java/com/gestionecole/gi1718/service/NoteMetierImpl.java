package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.NoteRepository;
import com.gestionecole.gi1718.entites.Note;

@Service
public class NoteMetierImpl implements NoteService {
	@Autowired
	private NoteRepository NoteRepository;

	@Override
	public long count() {
		return NoteRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		NoteRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Note> arg0) {
		NoteRepository.delete(arg0);
	}

	@Override
	public void delete(Note arg0) {
		NoteRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		NoteRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return NoteRepository.exists(arg0);
	}

	@Override
	public Iterable<Note> findAll() {
		return NoteRepository.findAll();
	}

	@Override
	public Iterable<Note> findAll(Iterable<Integer> arg0) {
		return NoteRepository.findAll(arg0);
	}

	@Override
	public Note findOne(Integer arg0) {
		return NoteRepository.findOne(arg0);
	}

	@Override
	public <S extends Note> Iterable<S> save(Iterable<S> arg0) {
		return NoteRepository.save(arg0);
	}

	@Override
	public <S extends Note> S save(S arg0) {
		return NoteRepository.save(arg0);
	}

	
	
	
}
