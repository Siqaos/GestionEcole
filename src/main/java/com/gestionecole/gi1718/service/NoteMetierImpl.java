package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.EleveRepository;
import com.gestionecole.gi1718.dao.MatiereRepository;
import com.gestionecole.gi1718.dao.NoteRepository;
import com.gestionecole.gi1718.entites.Note;

@Service
public class NoteMetierImpl implements NoteService  {
	@Autowired
	private NoteRepository NoteRepository;
	@Autowired
	private EleveRepository eleveRepository;
	
	@Autowired
	private MatiereRepository matiereRepository;

	@Override
	public <S extends Note> S findOne(Example<S> example) {
		return NoteRepository.findOne(example);
	}

	@Override
	public Page<Note> findAll(Pageable pageable) {
		return NoteRepository.findAll(pageable);
	}

	@Override
	public Note findOne(Integer id) {
		return NoteRepository.findOne(id);
	}

	@Override
	public boolean exists(Integer id) {
		return NoteRepository.exists(id);
	}

	@Override
	public long count() {
		return NoteRepository.count();
	}

	@Override
	public <S extends Note> Page<S> findAll(Example<S> example, Pageable pageable) {
		return NoteRepository.findAll(example, pageable);
	}

	@Override
	public void delete(Integer id) {
		NoteRepository.delete(id);
	}

	@Override
	public void delete(Note entity) {
		NoteRepository.delete(entity);
	}

	@Override
	public <S extends Note> long count(Example<S> example) {
		return NoteRepository.count(example);
	}

	@Override
	public void delete(Iterable<? extends Note> entities) {
		NoteRepository.delete(entities);
	}

	@Override
	public void deleteAll() {
		NoteRepository.deleteAll();
	}

	@Override
	public void deleteAllInBatch() {
		NoteRepository.deleteAllInBatch();
	}

	@Override
	public void deleteInBatch(Iterable<Note> arg0) {
		NoteRepository.deleteInBatch(arg0);
	}

	@Override
	public <S extends Note> boolean exists(Example<S> example) {
		return NoteRepository.exists(example);
	}

	@Override
	public List<Note> findAll() {
		return NoteRepository.findAll();
	}

	@Override
	public <S extends Note> List<S> findAll(Example<S> arg0, Sort arg1) {
		return NoteRepository.findAll(arg0, arg1);
	}

	@Override
	public <S extends Note> List<S> findAll(Example<S> arg0) {
		return NoteRepository.findAll(arg0);
	}

	@Override
	public List<Note> findAll(Iterable<Integer> arg0) {
		return NoteRepository.findAll(arg0);
	}

	@Override
	public List<Note> findAll(Sort arg0) {
		return NoteRepository.findAll(arg0);
	}

	@Override
	public void flush() {
		NoteRepository.flush();
	}

	@Override
	public Note getOne(Integer arg0) {
		return NoteRepository.getOne(arg0);
	}

	@Override
	public <S extends Note> List<S> save(Iterable<S> arg0) {
		return NoteRepository.save(arg0);
	}

	@Override
	public <S extends Note> S save(S entity) {
		return NoteRepository.save(entity);
	}

	@Override
	public <S extends Note> S saveAndFlush(S arg0) {
		return NoteRepository.saveAndFlush(arg0);
	}

	@Override
	public <S extends Note> S saveNote(S arg0,String matiere ,String eleve) {
		arg0.setEleve(eleveRepository.findByMatricule(eleve));
		arg0.setMatiere(matiereRepository.findByNom(matiere));
		return NoteRepository.save(arg0);
	}
	
	
	
	
}
