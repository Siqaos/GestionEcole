package com.gestionecole.gi1718.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestionecole.gi1718.entites.Personne;








@Repository
public interface PersonneRepository extends CrudRepository<Personne, Integer> {

}
