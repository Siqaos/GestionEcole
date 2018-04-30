package com.gestionecole.gi1718.controllers;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.gestionecole.gi1718.entites.Professeur;
import com.gestionecole.gi1718.service.ProfesseurService;




@RestController
public class ProfesseurRestService {


	@Autowired ProfesseurService professeurService;

	
	@RequestMapping(value="/professeurs",method=RequestMethod.GET)
	public Page<Professeur> listProfesseurs(int page,int size){
		return professeurService.findAll(new PageRequest(page,size));
	}
	
	
	@RequestMapping(value = "/professeurs", method = RequestMethod.POST)
	public Professeur createProfesseur(@RequestBody Professeur professeur) {
		return professeurService.save(professeur);
	}
	
	
	@RequestMapping(value = "/chercherProfesseurs", method = RequestMethod.GET)
	public Page<Professeur> chercherProfesseurs(
			String mc,
			@RequestParam(name="page",defaultValue="0") int page,
			@RequestParam(name="size",defaultValue="5") int size) {	
		return professeurService.chercherProfesseurs("%"+mc+"%",new PageRequest(page, size));
	}
	
	@RequestMapping(value = "/professeurs/{id}", method = RequestMethod.GET)
	public Professeur getProfesseur(@PathVariable("id") int id) {
		return professeurService.findOne(id); 
	}
	
	@RequestMapping(value = "/professeurs/{id}", method = RequestMethod.PUT)
	public Professeur updateProfesseur(@RequestBody Professeur p,@PathVariable("id") long id) {
		p.setIdPersonne(id);
		return professeurService.save(p);
	}
	
	@RequestMapping(value = "/professeurs/{id}", method = RequestMethod.DELETE)
	public void deleteProfesseur(@PathVariable("id") int id) {
		professeurService.delete(id); 
	}			 

}