package com.gestionecole.gi1718.entites;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "note", catalog = "gestionecole")
public class Note {

	private int idNote;
	private Examen examen;
	private String noteExam;
	private String remarque;
	private Eleve eleve;
	private Matiere matiere;
	private Set<Bulletin> bulletins = new HashSet<Bulletin>(0);

	public Note() {
	}

	public Note(int idNote, Examen examen) {
		this.idNote = idNote;
		this.examen = examen;
	}

	public Note(int idNote, Examen examen, String noteExam, String remarque, Set<Bulletin> bulletins) {
		this.idNote = idNote;
		this.examen = examen;
		this.noteExam = noteExam;
		this.remarque = remarque;
		this.bulletins = bulletins;
	}

	@Id

	@Column(name = "idNote", unique = true, nullable = false)
	public int getIdNote() {
		return this.idNote;
	}

	public void setIdNote(int idNote) {
		this.idNote = idNote;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Examen_idExamen", nullable = false)
	public Examen getExamen() {
		return this.examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}

	@Column(name = "NoteExam", length = 45)
	public String getNoteExam() {
		return this.noteExam;
	}

	public void setNoteExam(String noteExam) {
		this.noteExam = noteExam;
	}

	@Column(name = "Remarque", length = 45)
	public String getRemarque() {
		return this.remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "note")
	public Set<Bulletin> getBulletins() {
		return this.bulletins;
	}

	public void setBulletins(Set<Bulletin> bulletins) {
		this.bulletins = bulletins;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Eleve_idPersonne", nullable = false)
	public Eleve getEleve() {
		return eleve;
	}

	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "matiere_idMatiere", nullable = false)
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	
}
