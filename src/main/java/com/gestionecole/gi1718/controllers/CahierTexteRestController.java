package com.gestionecole.gi1718.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionecole.gi1718.entites.Cahiertexte;
import com.gestionecole.gi1718.service.CahiertexteService;


@RestController
public class CahierTexteRestController {
	
	@Autowired
	CahiertexteService cahierTexteService;
	
	@RequestMapping(value = "/cahierTextes/{matiere}/{classe}", method = RequestMethod.POST)
	public Cahiertexte createContact(@RequestBody Cahiertexte cahierTexte,@PathVariable String matiere,@PathVariable String classe ) {
	 

		/*if (EleveService.isEleveExist(eleve)) {
			logger.error("Unable to create. A User with name {} already exist", user.getName());
			return new ResponseEntity(new CustomErrorType("Unable to create. A User with name " + 
			user.getName() + " already exist."),HttpStatus.CONFLICT);
		}*/
		
		cahierTexteService.saveCahierText(cahierTexte,matiere,classe);
		//HttpHeaders headers = new HttpHeaders();
		//headers.setLocation(ucBuilder.path("/api/eleve/{id}").buildAndExpand(eleve.getIdPersonne()).toUri());
		return cahierTexte;
	}


}
