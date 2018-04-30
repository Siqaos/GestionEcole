package com.gestionecole.gi1718.controllers;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestionecole.gi1718.entites.Responsable;
import com.gestionecole.gi1718.service.EleveService;
import com.gestionecole.gi1718.service.ResponsableService;


//@RequestMapping("/api")
@RestController
public class ResponsableResetService {
	
	@Autowired ResponsableService responsableService;
	@Autowired EleveService eleveService;

	 		
	 	@RequestMapping(value="/responsables",method=RequestMethod.GET)
	 	public Page<Responsable> listResponsables(int page,int size){
	 		return responsableService.findAll(new PageRequest(page,size));
	 	}
	 		
	 		
	 	@RequestMapping(value = "/responsables", method = RequestMethod.POST)
	 	public Responsable createResponsable(@RequestBody Responsable responsable ) {	
	 		return responsableService.save(responsable);
	 	}

	 	
	 	
		@RequestMapping(value = "/responsables/{id}", method = RequestMethod.GET)
		public Responsable getResponsable(@PathVariable("id") long id) {
			return responsableService.findOne(id); 
		}
		
		@RequestMapping(value = "/responsables/{id}", method = RequestMethod.PUT)
		public Responsable update(@RequestBody Responsable r,@PathVariable("id") long id) {
			r.setIdPersonne(id);
			return responsableService.saveAndFlush(r);
		}
		
		@RequestMapping(value = "/responsables/{id}", method = RequestMethod.DELETE)
		public void delete(@PathVariable("id") long id) {
			responsableService.delete(id); 
		}		
	 		

}
