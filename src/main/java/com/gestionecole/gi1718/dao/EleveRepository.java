package com.gestionecole.gi1718.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gestionecole.gi1718.entites.Eleve;



@Repository
public interface EleveRepository extends JpaRepository<Eleve, Integer> {
    @Query("select p from Personne p where p.idPersonne=:x ")                                        
	Eleve findLast(@Param("x") long id);
    
	@Query("select max(p.idPersonne) from Personne p") 
	int getMax();
	
	@Query("select e from Eleve e where e.nom like :x")
	public Page<Eleve> chercherEleves(@Param("x")String x,Pageable pageable); 
	
	@Query("select p from Eleve p where p.matricule=:x ")                                        
	Eleve findByMatricule(@Param("x") String matricule);
  
       
      
}
