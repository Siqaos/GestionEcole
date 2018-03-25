package com.gestionecole.gi1718.service;

import java.util.Optional;

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
	public void delete(Note arg0) {
		NoteRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		NoteRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Note> arg0) {
		NoteRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		NoteRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return NoteRepository.existsById(arg0);
	}

	@Override
	public Iterable<Note> findAll() {
		return NoteRepository.findAll();
	}

	@Override
	public Iterable<Note> findAllById(Iterable<Integer> arg0) {
		return NoteRepository.findAllById(arg0);
	}

	@Override
	public Optional<Note> findById(Integer arg0) {
		return NoteRepository.findById(arg0);
	}

	@Override
	public <S extends Note> S save(S arg0) {
		return NoteRepository.save(arg0);
	}

	@Override
	public <S extends Note> Iterable<S> saveAll(Iterable<S> arg0) {
		return NoteRepository.saveAll(arg0);
	}
	
	
}
