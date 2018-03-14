package com.gestionecole.gi1718.dao;

import com.gestionecole.gi1718.entites.Chauffeur;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;






@Repository
public interface ChauffeurRepository extends CrudRepository<Chauffeur, Integer> {

}
