package com.gestionecole.gi1718.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestionecole.gi1718.entites.Tarifs;








@Repository
public interface TarifsRepository extends CrudRepository<Tarifs, Integer> {

}
