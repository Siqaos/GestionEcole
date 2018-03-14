package com.gestionecole.gi1718.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestionecole.gi1718.entites.Gardien;






@Repository
public interface GardienRepository extends CrudRepository<Gardien, Integer> {

}
