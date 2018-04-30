package com.gestionecole.gi1718.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gestionecole.gi1718.entites.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {

}
