package com.gestionecole.gi1718.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gestionecole.gi1718.entites.Niveau;

@Repository
public interface NiveauRepository extends JpaRepository<Niveau, Integer> {
	@Query("select e from Niveau e where e.niveau like :x")
	public Page<Niveau> chercherNiveau(@Param("x")String x,Pageable pageable);
}