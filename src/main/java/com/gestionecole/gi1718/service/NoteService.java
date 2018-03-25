package com.gestionecole.gi1718.service;

import java.util.Optional;

import com.gestionecole.gi1718.entites.Note;

public interface NoteService {

	long count();

	void delete(Note arg0);

	void deleteAll();

	void deleteAll(Iterable<? extends Note> arg0);

	void deleteById(Integer arg0);

	boolean existsById(Integer arg0);

	Iterable<Note> findAll();

	Iterable<Note> findAllById(Iterable<Integer> arg0);

	Optional<Note> findById(Integer arg0);

	<S extends Note> S save(S arg0);

	<S extends Note> Iterable<S> saveAll(Iterable<S> arg0);

}