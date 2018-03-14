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
@Table(name = "examen", catalog = "gestionecole")
public class Examen {

	private int idExamen;
	private Horaire horaire;
	private Matiere matiere;
	private String numExamen;
	private Integer pourcentage;
	private Set<Note> notes = new HashSet<Note>(0);

	public Examen() {
	}

	public Examen(int idExamen, Horaire horaire, Matiere matiere) {
		this.idExamen = idExamen;
		this.horaire = horaire;
		this.matiere = matiere;
	}

	public Examen(int idExamen, Horaire horaire, Matiere matiere, String numExamen, Integer pourcentage,
			Set<Note> notes) {
		this.idExamen = idExamen;
		this.horaire = horaire;
		this.matiere = matiere;
		this.numExamen = numExamen;
		this.pourcentage = pourcentage;
		this.notes = notes;
	}

	@Id

	@Column(name = "idExamen", unique = true, nullable = false)
	public int getIdExamen() {
		return this.idExamen;
	}

	public void setIdExamen(int idExamen) {
		this.idExamen = idExamen;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "horaire_idHoraire", nullable = false)
	public Horaire getHoraire() {
		return this.horaire;
	}

	public void setHoraire(Horaire horaire) {
		this.horaire = horaire;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Matiere_idMatiere", nullable = false)
	public Matiere getMatiere() {
		return this.matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	@Column(name = "NumExamen", length = 45)
	public String getNumExamen() {
		return this.numExamen;
	}

	public void setNumExamen(String numExamen) {
		this.numExamen = numExamen;
	}

	@Column(name = "Pourcentage")
	public Integer getPourcentage() {
		return this.pourcentage;
	}

	public void setPourcentage(Integer pourcentage) {
		this.pourcentage = pourcentage;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "examen")
	public Set<Note> getNotes() {
		return this.notes;
	}

	public void setNotes(Set<Note> notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Examen [idExamen=" + idExamen + ", numExamen=" + numExamen + ", pourcentage=" + pourcentage + "]";
	}

}
