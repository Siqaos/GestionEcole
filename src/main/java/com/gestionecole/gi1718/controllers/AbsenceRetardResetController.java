package com.gestionecole.gi1718.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionecole.gi1718.entites.Absence;
import com.gestionecole.gi1718.entites.Retard;
import com.gestionecole.gi1718.service.AbsenceService;
import com.gestionecole.gi1718.service.RetardService;

 

@RestController
public class AbsenceRetardResetController {
	@Autowired
	AbsenceService absenceService;
	
	@Autowired
	RetardService retardService;
	
	@RequestMapping(value = "/absences/{eleve}/{matiere}", method = RequestMethod.POST)
	public Absence createContact(@RequestBody Absence absence,@PathVariable String eleve,@PathVariable String matiere ) {
	 

		/*if (EleveService.isEleveExist(eleve)) {
			logger.error("Unable to create. A User with name {} already exist", user.getName());
			return new ResponseEntity(new CustomErrorType("Unable to create. A User with name " + 
			user.getName() + " already exist."),HttpStatus.CONFLICT);
		}*/
		
		absenceService.saveAbsence(absence,eleve,matiere);
		//HttpHeaders headers = new HttpHeaders();
		//headers.setLocation(ucBuilder.path("/api/eleve/{id}").buildAndExpand(eleve.getIdPersonne()).toUri());
		return absence;
	}
	
	@RequestMapping(value = "/retards/{eleve}/{matiere}", method = RequestMethod.POST)
	public Retard createRetards(@RequestBody Retard retard,@PathVariable String eleve,@PathVariable String matiere ) {
	 

		/*if (EleveService.isEleveExist(eleve)) {
			logger.error("Unable to create. A User with name {} already exist", user.getName());
			return new ResponseEntity(new CustomErrorType("Unable to create. A User with name " + 
			user.getName() + " already exist."),HttpStatus.CONFLICT);
		}*/
		
		retardService.saveRetard(retard,eleve,matiere);
		//HttpHeaders headers = new HttpHeaders();
		//headers.setLocation(ucBuilder.path("/api/eleve/{id}").buildAndExpand(eleve.getIdPersonne()).toUri());
		return retard;
	}


}
