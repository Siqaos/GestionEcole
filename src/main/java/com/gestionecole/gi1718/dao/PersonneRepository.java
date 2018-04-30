package com.gestionecole.gi1718.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.gestionecole.gi1718.entites.Personne;
@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long> {
	
	@Query("select p from Personne p where p.nom like :x")
	public List<Personne> listerPersonne(@Param("x")String nom); 
}
