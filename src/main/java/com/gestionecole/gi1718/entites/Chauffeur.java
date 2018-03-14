package com.gestionecole.gi1718.entites;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "chauffeur", catalog = "gestionecole")
@PrimaryKeyJoinColumn(name = "idPersonne")
public class Chauffeur extends Personne {

	private int idChauffeur;
	private Salaire salaire;
	private Vehicule vehicule;
	private String matricule;
	private String cin;
	private Date dateDebutTravail;

	public Chauffeur() {
	}

	public Chauffeur(int idChauffeur, Salaire salaire, Vehicule vehicule) {
		this.idChauffeur = idChauffeur;
		this.salaire = salaire;
		this.vehicule = vehicule;
	}

	public Chauffeur(int idChauffeur, Salaire salaire, Vehicule vehicule, String matricule, String cin,
			Date dateDebutTravail) {
		this.idChauffeur = idChauffeur;
		this.salaire = salaire;
		this.vehicule = vehicule;
		this.matricule = matricule;
		this.cin = cin;
		this.dateDebutTravail = dateDebutTravail;
	}

	@Id

	@Column(name = "idChauffeur", unique = true, nullable = false)
	public int getIdChauffeur() {
		return this.idChauffeur;
	}

	public void setIdChauffeur(int idChauffeur) {
		this.idChauffeur = idChauffeur;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "salaire_idSalaire", nullable = false)
	public Salaire getSalaire() {
		return this.salaire;
	}

	public void setSalaire(Salaire salaire) {
		this.salaire = salaire;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vehicule_idVehicule", nullable = false)
	public Vehicule getVehicule() {
		return this.vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	@Column(name = "Matricule", length = 45)
	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	@Column(name = "CIN", length = 45)
	public String getCin() {
		return this.cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DateDebutTravail", length = 10)
	public Date getDateDebutTravail() {
		return this.dateDebutTravail;
	}

	public void setDateDebutTravail(Date dateDebutTravail) {
		this.dateDebutTravail = dateDebutTravail;
	}

	@Override
	public String toString() {
		return "Chauffeur [idChauffeur=" + idChauffeur + ", matricule=" + matricule + ", cin=" + cin
				+ ", dateDebutTravail=" + dateDebutTravail + "]";
	}

}
