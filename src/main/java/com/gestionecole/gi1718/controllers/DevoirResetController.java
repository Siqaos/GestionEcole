package com.gestionecole.gi1718.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionecole.gi1718.entites.Devoir;
import com.gestionecole.gi1718.service.DevoirService;




@RestController
public class DevoirResetController {
	@Autowired
	DevoirService devoirService;
	
	@RequestMapping(value = "/devoirs/{matiere}/{classe}", method = RequestMethod.POST)
	public Devoir createContact(@RequestBody Devoir devoir,@PathVariable String matiere,@PathVariable String classe ) {
	 

		/*if (EleveService.isEleveExist(eleve)) {
			logger.error("Unable to create. A User with name {} already exist", user.getName());
			return new ResponseEntity(new CustomErrorType("Unable to create. A User with name " + 
			user.getName() + " already exist."),HttpStatus.CONFLICT);
		}*/
		
		devoirService.saveDevoir(devoir,matiere,classe);
		//HttpHeaders headers = new HttpHeaders();
		//headers.setLocation(ucBuilder.path("/api/eleve/{id}").buildAndExpand(eleve.getIdPersonne()).toUri());
		return devoir;
	}

}
