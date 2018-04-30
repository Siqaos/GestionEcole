package com.gestionecole.gi1718.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionecole.gi1718.entites.Contact;
import com.gestionecole.gi1718.service.ContactService;



@RestController
public class ContactRestService {
	
	@Autowired
	ContactService contactService;
	
	@RequestMapping(value = "/contacts/{nom}", method = RequestMethod.POST)
	public Contact createContact(@RequestBody Contact contact,@PathVariable String nom ) {
	 

		/*if (EleveService.isEleveExist(eleve)) {
			logger.error("Unable to create. A User with name {} already exist", user.getName());
			return new ResponseEntity(new CustomErrorType("Unable to create. A User with name " + 
			user.getName() + " already exist."),HttpStatus.CONFLICT);
		}*/
		
		contactService.saveContact(contact, nom);
		//HttpHeaders headers = new HttpHeaders();
		//headers.setLocation(ucBuilder.path("/api/eleve/{id}").buildAndExpand(eleve.getIdPersonne()).toUri());
		return contact;
	}

}
