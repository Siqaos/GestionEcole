package com.gestionecole.gi1718.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gestionecole.gi1718.entites.Professeur;

@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur, Integer> {
	@Query("select p from Professeur p where p.matricule=:x ")                                        
	Professeur findByMatricule(@Param("x") String matricule);
}
