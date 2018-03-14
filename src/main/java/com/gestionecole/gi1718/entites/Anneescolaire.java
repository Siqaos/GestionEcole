package com.gestionecole.gi1718.entites;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "anneescolaire", catalog = "gestionecole")
public class Anneescolaire {

	private int idAnneeScolaire;
	private String anneeScolaire;
	private Set<Inscription> inscriptions = new HashSet<Inscription>(0);
	private Set<Session> sessions = new HashSet<Session>(0);

	public Anneescolaire() {
	}

	public Anneescolaire(int idAnneeScolaire) {
		this.idAnneeScolaire = idAnneeScolaire;
	}

	public Anneescolaire(int idAnneeScolaire, String anneeScolaire, Set<Inscription> inscriptions,
			Set<Session> sessions) {
		this.idAnneeScolaire = idAnneeScolaire;
		this.anneeScolaire = anneeScolaire;
		this.inscriptions = inscriptions;
		this.sessions = sessions;
	}

	@Id

	@Column(name = "idAnneeScolaire", unique = true, nullable = false)
	public int getIdAnneeScolaire() {
		return this.idAnneeScolaire;
	}

	public void setIdAnneeScolaire(int idAnneeScolaire) {
		this.idAnneeScolaire = idAnneeScolaire;
	}

	@Column(name = "AnneeScolaire", length = 45)
	public String getAnneeScolaire() {
		return this.anneeScolaire;
	}

	public void setAnneeScolaire(String anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "anneescolaire")
	public Set<Inscription> getInscriptions() {
		return this.inscriptions;
	}

	public void setInscriptions(Set<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "anneescolaire")
	public Set<Session> getSessions() {
		return this.sessions;
	}

	public void setSessions(Set<Session> sessions) {
		this.sessions = sessions;
	}

	@Override
	public String toString() {
		return "Anneescolaire [idAnneeScolaire=" + idAnneeScolaire + ", anneeScolaire=" + anneeScolaire + "]";
	}

}
