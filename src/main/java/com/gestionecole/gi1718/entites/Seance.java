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
@Table(name = "seance", catalog = "gestionecole")
public class Seance {

	private int idSeance;
	private Cahiertexte cahiertexte;
	private Classe classe;
	private Horaire horaire;
	private Matiere matiere;
	private Professeur professeur;
	private Salle salle;
	private Set<Absence> absences = new HashSet<Absence>(0);
	private Set<Retard> retards = new HashSet<Retard>(0);
	private Set<Devoir> devoirs = new HashSet<Devoir>(0);
	private Set<Observation> observations = new HashSet<Observation>(0);

	public Seance() {
	}

	public Seance(int idSeance, Cahiertexte cahiertexte, Classe classe, Horaire horaire, Matiere matiere,
			Professeur professeur, Salle salle) {
		this.idSeance = idSeance;
		this.cahiertexte = cahiertexte;
		this.classe = classe;
		this.horaire = horaire;
		this.matiere = matiere;
		this.professeur = professeur;
		this.salle = salle;
	}

	public Seance(int idSeance, Cahiertexte cahiertexte, Classe classe, Horaire horaire, Matiere matiere,
			Professeur professeur, Salle salle, Set<Absence> absences, Set<Retard> retards, Set<Devoir> devoirs,
			Set<Observation> observations) {
		this.idSeance = idSeance;
		this.cahiertexte = cahiertexte;
		this.classe = classe;
		this.horaire = horaire;
		this.matiere = matiere;
		this.professeur = professeur;
		this.salle = salle;
		this.absences = absences;
		this.retards = retards;
		this.devoirs = devoirs;
		this.observations = observations;
	}

	@Id

	@Column(name = "idSeance", unique = true, nullable = false)
	public int getIdSeance() {
		return this.idSeance;
	}

	public void setIdSeance(int idSeance) {
		this.idSeance = idSeance;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cahiertexte_idCahiertexte", nullable = false)
	public Cahiertexte getCahiertexte() {
		return this.cahiertexte;
	}

	public void setCahiertexte(Cahiertexte cahiertexte) {
		this.cahiertexte = cahiertexte;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Classe_idClasse", nullable = false)
	public Classe getClasse() {
		return this.classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
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
	@JoinColumn(name = "matiere_idMatiere", nullable = false)
	public Matiere getMatiere() {
		return this.matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "professeur_idProfesseur", nullable = false)
	public Professeur getProfesseur() {
		return this.professeur;
	}

	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "salle_idSalle", nullable = false)
	public Salle getSalle() {
		return this.salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "seance")
	public Set<Absence> getAbsences() {
		return this.absences;
	}

	public void setAbsences(Set<Absence> absences) {
		this.absences = absences;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "seance")
	public Set<Retard> getRetards() {
		return this.retards;
	}

	public void setRetards(Set<Retard> retards) {
		this.retards = retards;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "seance")
	public Set<Devoir> getDevoirs() {
		return this.devoirs;
	}

	public void setDevoirs(Set<Devoir> devoirs) {
		this.devoirs = devoirs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "seance")
	public Set<Observation> getObservations() {
		return this.observations;
	}

	public void setObservations(Set<Observation> observations) {
		this.observations = observations;
	}

}
