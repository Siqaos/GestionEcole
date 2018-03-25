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
public class Session  {

	private int idSession;
	private Anneescolaire anneescolaire;
	private int resultatsEtudiantIdEleve;
	private Set<Bulletin> bulletins = new HashSet<Bulletin>(0);

	public Session() {
	}

	public Session(int idSession, Anneescolaire anneescolaire, int resultatsEtudiantIdEleve) {
		this.idSession = idSession;
		this.anneescolaire = anneescolaire;
		this.resultatsEtudiantIdEleve = resultatsEtudiantIdEleve;
	}

	public Session(int idSession, Anneescolaire anneescolaire, int resultatsEtudiantIdEleve, Set<Bulletin> bulletins) {
		this.idSession = idSession;
		this.anneescolaire = anneescolaire;
		this.resultatsEtudiantIdEleve = resultatsEtudiantIdEleve;
		this.bulletins = bulletins;
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

	@Column(name = "Resultats_Etudiant_idEleve", nullable = false)
	public int getResultatsEtudiantIdEleve() {
		return this.resultatsEtudiantIdEleve;
	}

	public void setResultatsEtudiantIdEleve(int resultatsEtudiantIdEleve) {
		this.resultatsEtudiantIdEleve = resultatsEtudiantIdEleve;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "session")
	public Set<Bulletin> getBulletins() {
		return this.bulletins;
	}

	public void setBulletins(Set<Bulletin> bulletins) {
		this.bulletins = bulletins;
	}

}
