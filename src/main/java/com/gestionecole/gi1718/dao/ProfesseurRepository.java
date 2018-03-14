package com.gestionecole.gi1718.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestionecole.gi1718.entites.Professeur;








@Repository
public interface ProfesseurRepository extends CrudRepository<Professeur, Integer> {

}
