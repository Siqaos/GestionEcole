package com.gestionecole.gi1718.controllers;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionecole.gi1718.entites.Garde;
import com.gestionecole.gi1718.service.AideService;
import com.gestionecole.gi1718.service.GardeService;
import com.gestionecole.gi1718.service.ProfesseurService;


@RestController
 
public class GardeResetService {
	
		//public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

		//@Autowired
		//ResponsableService responsableService; //Service which will do all data retrieval/manipulation work
		@Autowired AideService aideService;
		@Autowired ProfesseurService profService;
		@Autowired GardeService gardeService;
 
		
		// ------------------- Update a User ------------------------------------------------
	//
		
	 		@RequestMapping(value = "/gardes/{matricule}/{matriculeAide}", method = RequestMethod.POST)
	  		public void updateUser(@RequestBody Garde garde,@PathVariable String matricule,@PathVariable String matriculeAide) {
	        //garde.setProfesseur(matricule);
	 		 gardeService.save(garde,matricule,matriculeAide);
	 		// gardeService.save(garde);
	 		}
		//

}