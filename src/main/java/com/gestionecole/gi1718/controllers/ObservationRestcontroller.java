package com.gestionecole.gi1718.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionecole.gi1718.entites.Observation;
import com.gestionecole.gi1718.service.ObservationService;


@RestController
public class ObservationRestcontroller {
	
	@Autowired
	ObservationService observationService;
	
	@RequestMapping(value = "/observations/{matiere}/{eleve}", method = RequestMethod.POST)
	public Observation createObservation(@RequestBody Observation observation,@PathVariable String matiere,@PathVariable String eleve ) {
	 

		/*if (EleveService.isEleveExist(eleve)) {
			logger.error("Unable to create. A User with name {} already exist", user.getName());
			return new ResponseEntity(new CustomErrorType("Unable to create. A User with name " + 
			user.getName() + " already exist."),HttpStatus.CONFLICT);
		}*/
		
		observationService.saveObservation(observation,matiere,eleve);
		//HttpHeaders headers = new HttpHeaders();
		//headers.setLocation(ucBuilder.path("/api/eleve/{id}").buildAndExpand(eleve.getIdPersonne()).toUri());
		return observation;
	}

}
