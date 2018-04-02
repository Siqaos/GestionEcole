package com.gestionecole.gi1718.service;

import com.gestionecole.gi1718.entites.Note;

public interface NoteService {

	long count();

	void delete(Integer arg0);

	void delete(Iterable<? extends Note> arg0);

	void delete(Note arg0);

	void deleteAll();

	boolean exists(Integer arg0);

	Iterable<Note> findAll();

	Iterable<Note> findAll(Iterable<Integer> arg0);

	Note findOne(Integer arg0);

	<S extends Note> Iterable<S> save(Iterable<S> arg0);

	<S extends Note> S save(S arg0);

}