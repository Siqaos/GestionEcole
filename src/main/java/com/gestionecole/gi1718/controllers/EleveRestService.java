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

import com.gestionecole.gi1718.entites.Eleve;
import com.gestionecole.gi1718.service.EleveService;
import com.gestionecole.gi1718.service.PersonneService;
import com.gestionecole.gi1718.service.ResponsableService;




//@RequestMapping("/api")
@RestController
public class EleveRestService {

	//public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Autowired EleveService eleveService; //Service which will do all data retrieval/manipulation work
	@Autowired ResponsableService responsableService;
	@Autowired PersonneService personneService;
	// -------------------Retrieve All Users---------------------------------------------

	
	@RequestMapping(value="/eleves",method=RequestMethod.GET)
	public List<Eleve> listEleves(){
		return eleveService.findAll();
		
	}
	
//	@RequestMapping(value="/eleves",method=RequestMethod.GET)
//	public Page<Eleve> listEleves(int page,int size){
//		return eleveService.findAll(new PageRequest(page,size));
//	}

	
//	@RequestMapping(value = "/eleves", method = RequestMethod.POST)
//	public Eleve createEleve(@RequestBody Eleve eleve ) {
//		Responsable responsable = new Responsable();
//		responsable.setNom("dsad");
//		Set<Responsable> responsables = new HashSet<Responsable>();
//		responsables.add(responsable);
//		eleve.setResponsable(responsables);
//		return eleveService.save(eleve);
//	}
	
	
	@RequestMapping(value = "/eleves", method = RequestMethod.POST)
	public Eleve createEleve(@RequestBody Eleve eleve ) {	
		return eleveService.save(eleve);
	}
	
	@RequestMapping(value = "/chercherEleves", method = RequestMethod.GET)
	public Page<Eleve> chercherEleve(
			String mc,
			@RequestParam(name="page",defaultValue="0") int page,
			@RequestParam(name="size",defaultValue="5") int size) {	
		return eleveService.chercherEleves("%"+mc+"%",new PageRequest(page, size));
	}
	
	@RequestMapping(value = "/eleves/{id}", method = RequestMethod.GET)
	public Eleve getEleve(@PathVariable("id") int id) {
		return eleveService.findOne(id); 
	}
	
	@RequestMapping(value = "/eleves/{id}", method = RequestMethod.PUT)
	public Eleve update(@PathVariable("id") int id,@RequestBody Eleve e) {
		e.setIdPersonne(id);
		return eleveService.save(e);
	}
	
	@RequestMapping(value = "/eleves/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id) {
		eleveService.delete(id); 
	}			 

	
	
//	@RequestMapping(value={"/eleves/{id}"}, method={GET})
//	@RequestMapping(value={"/eleves/{id}"}, method={PUT})
	
}