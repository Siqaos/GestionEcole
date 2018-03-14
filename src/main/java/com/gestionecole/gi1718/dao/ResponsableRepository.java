package com.gestionecole.gi1718.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestionecole.gi1718.entites.Responsable;








@Repository
public interface ResponsableRepository extends CrudRepository<Responsable, Integer> {

}
