package com.gestionecole.gi1718.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gestionecole.gi1718.entites.Cahiertexte;




@Repository
public interface CahiertexteRepository extends JpaRepository<Cahiertexte, Integer> {

}
