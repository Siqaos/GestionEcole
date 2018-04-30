package com.gestionecole.gi1718.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionecole.gi1718.entites.Fournisseur;
import com.gestionecole.gi1718.service.FournisseurService;


@RestController
public class FournisseurRestService {

	@Autowired
	FournisseurService fournisseurService; //Service which will do all data retrieval/manipulation work
	// -------------------Retrieve All Users---------------------------------------------

	@RequestMapping(value="/fournisseurs",method=RequestMethod.GET)
	public Page<Fournisseur> listEleves(int page ,int size){
		return fournisseurService.findAll( new PageRequest(page,size));
	}
	 

	// -------------------Retrieve Single User------------------------------------------

	/*@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getUser(@PathVariable("id") long id) {
		logger.info("Fetching User with id {}", id);
		User user = userService.findById(id);
		if (user == null) {
			logger.error("User with id {} not found.", id);
			return new ResponseEntity(new CustomErrorType("User with id " + id 
					+ " not found"), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}*/

	// -------------------Create a User-------------------------------------------

	@RequestMapping(value = "/fournisseurs/", method = RequestMethod.POST)
	public Fournisseur createEleve(@RequestBody Fournisseur fournisseur ) {
	 

		/*if (EleveService.isEleveExist(eleve)) {
			logger.error("Unable to create. A User with name {} already exist", user.getName());
			return new ResponseEntity(new CustomErrorType("Unable to create. A User with name " + 
			user.getName() + " already exist."),HttpStatus.CONFLICT);
		}*/
		
		fournisseurService.save(fournisseur);
		//HttpHeaders headers = new HttpHeaders();
		//headers.setLocation(ucBuilder.path("/api/eleve/{id}").buildAndExpand(eleve.getIdPersonne()).toUri());
		return fournisseur;
	}
	
}
