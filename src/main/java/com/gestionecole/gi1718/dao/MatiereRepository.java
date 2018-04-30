package com.gestionecole.gi1718.dao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.gestionecole.gi1718.entites.Matiere;

@Repository
public interface MatiereRepository extends JpaRepository<Matiere, Integer> {
	@Query("select e from Matiere e where e.nomMatiere like :x")
	public Page<Matiere> chercherMatiere(@Param("x")String x,Pageable pageable); 
	@Query("select p from Matiere p where p.nomMatiere=:x ")                                        
	Matiere findByNom(@Param("x") String matiere);
}

