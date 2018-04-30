package com.gestionecole.gi1718.controllers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionecole.gi1718.entites.Niveau;
import com.gestionecole.gi1718.service.NiveauService;




@RestController
public class NiveauRestService {


	@Autowired NiveauService niveauService;

	
//	@RequestMapping(value="/niveaux",method=RequestMethod.GET)
//	public Page<Niveau> listNiveaux(int page,int size){
//		return niveauService.findAll(new PageRequest(page,size));
//	}
	
	
	@RequestMapping(value="/niveaux",method=RequestMethod.GET)
	public List<Niveau> listNiveaux(){
		return niveauService.findAll();
	}
	
	
	@RequestMapping(value = "/niveaux", method = RequestMethod.POST)
	public Niveau createNiveau(@RequestBody Niveau niveau) {
		return niveauService.save(niveau);
	}
	
	
//	@RequestMapping(value = "/chercherNiveaux", method = RequestMethod.GET)
//	public Page<Professeur> chercherProfesseurs(
//			String mc,
//			@RequestParam(name="page",defaultValue="0") int page,
//			@RequestParam(name="size",defaultValue="5") int size) {	
//		return professeurService.chercherProfesseurs("%"+mc+"%",new PageRequest(page, size));
//	}
	
	@RequestMapping(value = "/niveaux/{id}", method = RequestMethod.GET)
	public Niveau getNiveau(@PathVariable("id") Integer id) {
		return niveauService.findOne(id); 
	}
	
	@RequestMapping(value = "/niveaux/{id}", method = RequestMethod.PUT)
	public Niveau updateNiveau(@RequestBody Niveau n,@PathVariable("id") int id) {
		n.setIdNiveau(id);
		return niveauService.saveAndFlush(n);
	}
	
	@RequestMapping(value = "/niveaux/{id}", method = RequestMethod.DELETE)
	public void deleteNiveau(@PathVariable("id") int id) {
		niveauService.delete(id); 
	}			 

}