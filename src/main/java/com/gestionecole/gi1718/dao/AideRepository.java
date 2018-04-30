package com.gestionecole.gi1718.dao;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.gestionecole.gi1718.entites.Aide;



@Repository
public interface AideRepository extends CrudRepository<Aide, Integer> {
	@Query("select p from Aide p where p.matricule=:x ")                                        
	Aide findByMatricule(@Param("x") String matricule);
}
