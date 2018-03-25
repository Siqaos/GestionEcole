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
@Table(name = "garde", catalog = "gestionecole")
public class Garde {

	private int idGarde;
	private Aide aide;
	private Horaire horaire;
	private Professeur professeur;
	private Tarifs tarifs;
	private Set<Paiement> paiements = new HashSet<Paiement>(0);

	public Garde() {
	}

	public Garde(int idGarde, Aide aide, Horaire horaire, Professeur professeur, Tarifs tarifs) {
		this.idGarde = idGarde;
		this.aide = aide;
		this.horaire = horaire;
		this.professeur = professeur;
		this.tarifs = tarifs;
	}

	public Garde(int idGarde, Aide aide, Horaire horaire, Professeur professeur, Tarifs tarifs,
			Set<Paiement> paiements) {
		this.idGarde = idGarde;
		this.aide = aide;
		this.horaire = horaire;
		this.professeur = professeur;
		this.tarifs = tarifs;
		this.paiements = paiements;
	}

	@Id

	@Column(name = "idGarde", unique = true, nullable = false)
	public int getIdGarde() {
		return this.idGarde;
	}

	public void setIdGarde(int idGarde) {
		this.idGarde = idGarde;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "aide_idAide", nullable = false)
	public Aide getAide() {
		return this.aide;
	}

	public void setAide(Aide aide) {
		this.aide = aide;
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
	@JoinColumn(name = "professeur_idProfesseur", nullable = false)
	public Professeur getProfesseur() {
		return this.professeur;
	}

	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tarifs_idTarifs", nullable = false)
	public Tarifs getTarifs() {
		return this.tarifs;
	}

	public void setTarifs(Tarifs tarifs) {
		this.tarifs = tarifs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "garde")
	public Set<Paiement> getPaiements() {
		return this.paiements;
	}

	public void setPaiements(Set<Paiement> paiements) {
		this.paiements = paiements;
	}

}
