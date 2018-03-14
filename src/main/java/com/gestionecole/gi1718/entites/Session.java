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
@Table(name = "session", catalog = "gestionecole")
public class Session {

	private int idSession;
	private Anneescolaire anneescolaire;
	private Set<Bulletin> bulletin = new HashSet<Bulletin>(0);

	public Session() {
	}

	public Session(int idSession, Anneescolaire anneescolaire) {
		this.idSession = idSession;
		this.anneescolaire = anneescolaire;
	}

	public Session(int idSession, Anneescolaire anneescolaire, Set<Bulletin> bulletin) {
		this.idSession = idSession;
		this.anneescolaire = anneescolaire;
		this.bulletin = bulletin;
	}

	@Id

	@Column(name = "idSession", unique = true, nullable = false)
	public int getIdSession() {
		return this.idSession;
	}

	public void setIdSession(int idSession) {
		this.idSession = idSession;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AnneeScolaire_idAnneeScolaire", nullable = false)
	public Anneescolaire getAnneescolaire() {
		return this.anneescolaire;
	}

	public void setAnneescolaire(Anneescolaire anneescolaire) {
		this.anneescolaire = anneescolaire;
	}

	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "session")
	public Set<Bulletin> getBultiens() {
		return this.bulletin;
	}

	public void setBultiens(Set<Bulletin> bulletin) {
		this.bulletin = bulletin;
	}

	@Override
	public String toString() {
		return "Session [idSession=" + idSession + ", anneescolaire=" + anneescolaire + "]";
	}

}
