package com.gestionecole.gi1718.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionecole.gi1718.entites.Examen;
import com.gestionecole.gi1718.service.ExamenService;


@RestController
public class ExamenRestController {
	
	@Autowired
	ExamenService examenService;
	
	@RequestMapping(value = "/examens/{matiere}/{classe}", method = RequestMethod.POST)
	public Examen createContact(@RequestBody Examen examen,@PathVariable String matiere,@PathVariable String classe ) {
	 

		/*if (EleveService.isEleveExist(eleve)) {
			logger.error("Unable to create. A User with name {} already exist", user.getName());
			return new ResponseEntity(new CustomErrorType("Unable to create. A User with name " + 
			user.getName() + " already exist."),HttpStatus.CONFLICT);
		}*/
		
		examenService.saveExam(examen,matiere,classe);
		//HttpHeaders headers = new HttpHeaders();
		//headers.setLocation(ucBuilder.path("/api/eleve/{id}").buildAndExpand(eleve.getIdPersonne()).toUri());
		return examen;
	}


}
