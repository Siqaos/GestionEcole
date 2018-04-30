package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.gestionecole.gi1718.entites.Note;

public interface NoteService {

	<S extends Note> S findOne(Example<S> example);

	Page<Note> findAll(Pageable pageable);

	Note findOne(Integer id);

	boolean exists(Integer id);

	long count();

	<S extends Note> Page<S> findAll(Example<S> example, Pageable pageable);

	void delete(Integer id);

	void delete(Note entity);

	<S extends Note> long count(Example<S> example);

	void delete(Iterable<? extends Note> entities);

	void deleteAll();

	void deleteAllInBatch();

	void deleteInBatch(Iterable<Note> arg0);

	<S extends Note> boolean exists(Example<S> example);

	List<Note> findAll();

	<S extends Note> List<S> findAll(Example<S> arg0, Sort arg1);

	<S extends Note> List<S> findAll(Example<S> arg0);

	List<Note> findAll(Iterable<Integer> arg0);

	List<Note> findAll(Sort arg0);

	void flush();

	Note getOne(Integer arg0);

	<S extends Note> List<S> save(Iterable<S> arg0);

	<S extends Note> S save(S entity);

	<S extends Note> S saveAndFlush(S arg0);

	<S extends Note> S saveNote(S arg0, String matiere, String eleve);

}