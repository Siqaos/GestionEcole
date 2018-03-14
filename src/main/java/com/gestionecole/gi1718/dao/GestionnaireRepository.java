package com.gestionecole.gi1718.dao;

import com.gestionecole.gi1718.entites.Gestionnaire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;








@Repository
public interface GestionnaireRepository extends CrudRepository<Gestionnaire, Integer> {

}
