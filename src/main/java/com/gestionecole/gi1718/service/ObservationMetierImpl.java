package com.gestionecole.gi1718.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.EleveRepository;
import com.gestionecole.gi1718.dao.MatiereRepository;
import com.gestionecole.gi1718.dao.ObservationRepository;
import com.gestionecole.gi1718.entites.Observation;

@Service
public class ObservationMetierImpl implements ObservationService  {
	@Autowired
	private ObservationRepository ObservationRepository;
	@Autowired
	private EleveRepository eleveRepository;
	
	@Autowired
	private MatiereRepository matiereRepository;
	@Override
	public long count() {
		return ObservationRepository.count();
	}

	@Override
	public void delete(Integer arg0) {
		ObservationRepository.delete(arg0);
	}

	@Override
	public void delete(Iterable<? extends Observation> arg0) {
		ObservationRepository.delete(arg0);
	}

	@Override
	public void delete(Observation arg0) {
		ObservationRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		ObservationRepository.deleteAll();
	}

	@Override
	public boolean exists(Integer arg0) {
		return ObservationRepository.exists(arg0);
	}

	@Override
	public Iterable<Observation> findAll() {
		return ObservationRepository.findAll();
	}

	@Override
	public Iterable<Observation> findAll(Iterable<Integer> arg0) {
		return ObservationRepository.findAll(arg0);
	}

	@Override
	public Observation findOne(Integer arg0) {
		return ObservationRepository.findOne(arg0);
	}

	@Override
	public <S extends Observation> Iterable<S> save(Iterable<S> arg0) {
		return ObservationRepository.save(arg0);
	}

	@Override
	public <S extends Observation> S save(S arg0) {
		return ObservationRepository.save(arg0);
	}
	@Override
	public <S extends Observation> S saveObservation(S arg0,String matiere ,String eleve) {
		arg0.setEleve(eleveRepository.findByMatricule(eleve));
		arg0.setMatiere(matiereRepository.findByNom(matiere));
		return ObservationRepository.save(arg0);
	}
	
}
