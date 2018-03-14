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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "eleve", catalog = "gestionecole")
@PrimaryKeyJoinColumn(name = "idPersonne")
public class Eleve extends Personne {

	private int idEleve;
	private Classe classe;
	private Inscription inscription;
	private Niveau niveau;
	private Personne personne;
	private Positiongps positiongps;
	private Responsable responsable;
	private String matricule;
	private Set<Retard> retards = new HashSet<Retard>(0);
	private Set<Bulletin> bulletin = new HashSet<Bulletin>(0);
	private Set<Observation> observations = new HashSet<Observation>(0);
	private Set<Absence> absences = new HashSet<Absence>(0);

	public Eleve() {
	}

	public Eleve(int idEleve, Classe classe, Inscription inscription, Niveau niveau, Personne personne,
			Positiongps positiongps, Responsable responsable) {
		this.idEleve = idEleve;
		this.classe = classe;
		this.inscription = inscription;
		this.niveau = niveau;
		this.personne = personne;
		this.positiongps = positiongps;
		this.responsable = responsable;
	}

	public Eleve(int idEleve, Classe classe, Inscription inscription, Niveau niveau, Personne personne,
			Positiongps positiongps, Responsable responsable, String matricule, Set<Retard> retards,
			Set<Bulletin> bulletin, Set<Observation> observations, Set<Absence> absences) {
		this.idEleve = idEleve;
		this.classe = classe;
		this.inscription = inscription;
		this.niveau = niveau;
		this.personne = personne;
		this.positiongps = positiongps;
		this.responsable = responsable;
		this.matricule = matricule;
		this.retards = retards;
		this.bulletin = bulletin;
		this.observations = observations;
		this.absences = absences;
	}

	@Id

	@Column(name = "idEleve", unique = true, nullable = false)
	public int getIdEleve() {
		return this.idEleve;
	}

	public void setIdEleve(int idEleve) {
		this.idEleve = idEleve;
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
	@JoinColumn(name = "inscription_idInscription", nullable = false)
	public Inscription getInscription() {
		return this.inscription;
	}

	public void setInscription(Inscription inscription) {
		this.inscription = inscription;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "niveau_idNiveau", nullable = false)
	public Niveau getNiveau() {
		return this.niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Personne_idPersonne", nullable = false)
	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "positiongps_idPosition", nullable = false)
	public Positiongps getPositiongps() {
		return this.positiongps;
	}

	public void setPositiongps(Positiongps positiongps) {
		this.positiongps = positiongps;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Responsable_idResponsable", nullable = false)
	public Responsable getResponsable() {
		return this.responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	@Column(name = "Matricule", length = 45)
	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eleve")
	public Set<Retard> getRetards() {
		return this.retards;
	}

	public void setRetards(Set<Retard> retards) {
		this.retards = retards;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eleve")
	public Set<Bulletin> getBultiens() {
		return this.bulletin;
	}

	public void setBultiens(Set<Bulletin> bulletin) {
		this.bulletin = bulletin;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eleve")
	public Set<Observation> getObservations() {
		return this.observations;
	}

	public void setObservations(Set<Observation> observations) {
		this.observations = observations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eleve")
	public Set<Absence> getAbsences() {
		return this.absences;
	}

	public void setAbsences(Set<Absence> absences) {
		this.absences = absences;
	}

	@Override
	public String toString() {
		return "Eleve [idEleve=" + idEleve + ", matricule=" + matricule + "]";
	}

}