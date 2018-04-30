package com.gestionecole.gi1718.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.gestionecole.gi1718.entites.Classe;

@Repository
public interface ClasseRepository extends JpaRepository<Classe, Integer> {
	@Query("select p from Classe p where p.nomClasse=:x ")                          
	Classe findByNom(@Param("x") String classe);
}
