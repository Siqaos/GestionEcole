package com.gestionecole.gi1718.controllers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestionecole.gi1718.entites.Matiere;
import com.gestionecole.gi1718.service.MatiereService;




@RestController
public class MatiereRestService {


	@Autowired MatiereService matiereService;

	
//	@RequestMapping(value="/matieres",method=RequestMethod.GET)
//	public Page<Matiere> listMatieres(int page,int size){
//		return matiereService.findAll(new PageRequest(page,size));
//	}
	
	
	@RequestMapping(value="/matieres",method=RequestMethod.GET)
	public List<Matiere> listMatieres(){
		return matiereService.findAll();
	}
	
	
	@RequestMapping(value = "/matieres", method = RequestMethod.POST)
	public Matiere createMatiere(@RequestBody Matiere matiere) {
		return matiereService.save(matiere);
	}
	
	
	@RequestMapping(value = "/chercherMatieres", method = RequestMethod.GET)
	public Page<Matiere> chercherMatieres(
			String mc,
			@RequestParam(name="page",defaultValue="0") int page,
			@RequestParam(name="size",defaultValue="5") int size) {	
		return matiereService.chercherMatiere("%"+mc+"%",new PageRequest(page, size));
	}
	
	@RequestMapping(value = "/matieres/{id}", method = RequestMethod.GET)
	public Matiere getMatiere(@PathVariable("id") int id) {
		return matiereService.findOne(id); 
	}
	
	@RequestMapping(value = "/matieres/{id}", method = RequestMethod.PUT)
	public Matiere updateMatiere(@RequestBody Matiere p,@PathVariable("id") int id) {
		p.setIdMatiere(id);
		return matiereService.save(p);
	}
	
	@RequestMapping(value = "/matieres/{id}", method = RequestMethod.DELETE)
	public void deleteMatiere(@PathVariable("id") int id) {
		matiereService.delete(id); 
	}			 

}