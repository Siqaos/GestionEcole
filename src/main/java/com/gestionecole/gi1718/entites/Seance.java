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
public class Seance  {

	private int idSeance;
	private Cahiertexte cahiertexte;
	private Salle salle;
	private Set<Absence> absences = new HashSet<Absence>(0);
	private Set<Retard> retards = new HashSet<Retard>(0);
	private Set<Enseignement> enseignements = new HashSet<Enseignement>(0);
	private Set<Devoir> devoirs = new HashSet<Devoir>(0);
	private Set<Observation> observations = new HashSet<Observation>(0);

	public Seance() {
	}

	public Seance(int idSeance, Cahiertexte cahiertexte, Salle salle) {
		this.idSeance = idSeance;
		this.cahiertexte = cahiertexte;
		this.salle = salle;
	}

	public Seance(int idSeance, Cahiertexte cahiertexte, Salle salle, Set<Absence> absences, Set<Retard> retards,
			Set<Enseignement> enseignements, Set<Devoir> devoirs, Set<Observation> observations) {
		this.idSeance = idSeance;
		this.cahiertexte = cahiertexte;
		this.salle = salle;
		this.absences = absences;
		this.retards = retards;
		this.enseignements = enseignements;
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
	public Set<Enseignement> getEnseignements() {
		return this.enseignements;
	}

	public void setEnseignements(Set<Enseignement> enseignements) {
		this.enseignements = enseignements;
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
