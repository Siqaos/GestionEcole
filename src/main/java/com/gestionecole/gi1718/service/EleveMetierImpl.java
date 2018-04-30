package com.gestionecole.gi1718.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gestionecole.gi1718.dao.EleveRepository;
import com.gestionecole.gi1718.entites.Eleve;

@Service
public class EleveMetierImpl implements EleveService {
	@Autowired
	private EleveRepository EleveRepository;

	@Override
	public void delete(Eleve arg0) {
		EleveRepository.delete(arg0);
	}

	@Override
	public void delete(int arg0) {
		EleveRepository.delete(arg0);
	}

	@Override
	public List<Eleve> findAll() {
		return EleveRepository.findAll();
	}
	
	 
	@Override
	public Page<Eleve> findAll(Pageable arg0) {
			return EleveRepository.findAll(arg0);
		}

	
	@Override
	public Eleve findOne(int arg0) {
		return EleveRepository.findOne(arg0);
	}

	@Override
	public <S extends Eleve> S save(S arg0) {
		return EleveRepository.save(arg0);
	}
	
	@Override
	public void saveEleve(Eleve e) {
		
		//Inscription i=new Inscription();
		//java.sql.Date date=new Date(12,02,2019);
		//i.setDateInscription(date);
		 
		//EleveRepository.save(e);
		
	}

	  
	
//	@Override
//	public Eleve findLast(long id) {
//		return EleveRepository.findLast(id);
//	}
//	
//	
//	@Override
//	public long getMax() {
//		return EleveRepository.getMax();
//	}
//	
	
	@Override
	public Page<Eleve> chercherEleves(String x, Pageable pageable) {
		return EleveRepository.chercherEleves(x, pageable);
	}
	
	@Override
	public Eleve findByMatricule(String arg0) {
		return EleveRepository.findByMatricule(arg0);
	}
	
	
}
