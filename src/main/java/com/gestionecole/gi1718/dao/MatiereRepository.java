package com.gestionecole.gi1718.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestionecole.gi1718.entites.Matiere;








@Repository
public interface MatiereRepository extends CrudRepository<Matiere, Integer> {

}

