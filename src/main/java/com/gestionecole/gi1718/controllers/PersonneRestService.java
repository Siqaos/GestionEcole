package com.gestionecole.gi1718.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionecole.gi1718.entites.Personne;
import com.gestionecole.gi1718.service.PersonneService;


//@RequestMapping("/api")
@RestController
public class PersonneRestService {

	//public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Autowired
	PersonneService personneService; //Service which will do all data retrieval/manipulation work
//	@Autowired ResponsableService responsableService;
	// -------------------Retrieve All Users---------------------------------------------

	@RequestMapping(value = "/personnes", method = RequestMethod.GET)
	public List<Personne> listAllUsers() {
	 	List<Personne> personnes = personneService.findAll();
		return  personnes;
	}
	
	@RequestMapping(value = "/personnes", method = RequestMethod.POST)
	public Personne createPersonne(@RequestBody Personne personne ) {
		personneService.save(personne);
		return personne;
	}
	
	@RequestMapping(value = "/personnes/{idPersonne}/", method = RequestMethod.GET)
	public Personne getPersonne(@PathVariable("idPersonne") long idPersonne) {
		return personneService.findOne(idPersonne);
	}
	
	@RequestMapping(value = "/personnes/{idPersonne}/", method = RequestMethod.POST)
	public Personne getPersonnepost(@PathVariable("idPersonne") long idPersonne) {
		Personne p=personneService.findOne(idPersonne);
		return p;
	}

}