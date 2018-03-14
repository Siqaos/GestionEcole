package com.gestionecole.gi1718.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestionecole.gi1718.entites.Directeur;






@Repository
public interface DirecteurRepository extends CrudRepository<Directeur, Integer> {

}

