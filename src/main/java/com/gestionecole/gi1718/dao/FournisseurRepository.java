package com.gestionecole.gi1718.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.gestionecole.gi1718.entites.Fournisseur;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {
	@Query("Select d from Fournisseur d where d.nom=:x")
	Fournisseur findByNom(@Param("x") String nom);
}
