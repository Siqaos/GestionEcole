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
@Table(name = "professeur", catalog = "gestionecole")
@PrimaryKeyJoinColumn(name = "idPersonne")
public class Professeur extends Personne {

	private int idProfesseur;
	private Personne personne;
	private Salaire salaire;
	private String matricule;
	private String cin;
	private String diplome;
	private Set<Cahiertexte> cahiertextes = new HashSet<Cahiertexte>(0);
	private Set<Enseignement> enseignements = new HashSet<Enseignement>(0);
	private Set<Garde> gardes = new HashSet<Garde>(0);

	public Professeur() {
	}

	public Professeur(int idProfesseur, Personne personne, Salaire salaire) {
		this.idProfesseur = idProfesseur;
		this.personne = personne;
		this.salaire = salaire;
	}

	public Professeur(int idProfesseur, Personne personne, Salaire salaire, String matricule, String cin,
			String diplome, Set<Cahiertexte> cahiertextes, Set<Enseignement> enseignements, Set<Garde> gardes) {
		this.idProfesseur = idProfesseur;
		this.personne = personne;
		this.salaire = salaire;
		this.matricule = matricule;
		this.cin = cin;
		this.diplome = diplome;
		this.cahiertextes = cahiertextes;
		this.enseignements = enseignements;
		this.gardes = gardes;
	}

	@Id

	@Column(name = "idProfesseur", unique = true, nullable = false)
	public int getIdProfesseur() {
		return this.idProfesseur;
	}

	public void setIdProfesseur(int idProfesseur) {
		this.idProfesseur = idProfesseur;
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
	@JoinColumn(name = "salaire_idSalaire", nullable = false)
	public Salaire getSalaire() {
		return this.salaire;
	}

	public void setSalaire(Salaire salaire) {
		this.salaire = salaire;
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

	@Column(name = "Diplome", length = 45)
	public String getDiplome() {
		return this.diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "professeur")
	public Set<Cahiertexte> getCahiertextes() {
		return this.cahiertextes;
	}

	public void setCahiertextes(Set<Cahiertexte> cahiertextes) {
		this.cahiertextes = cahiertextes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "professeur")
	public Set<Enseignement> getEnseignements() {
		return this.enseignements;
	}

	public void setEnseignements(Set<Enseignement> enseignements) {
		this.enseignements = enseignements;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "professeur")
	public Set<Garde> getGardes() {
		return this.gardes;
	}

	public void setGardes(Set<Garde> gardes) {
		this.gardes = gardes;
	}

	@Override
	public String toString() {
		return "Professeur [idProfesseur=" + idProfesseur + ", personne=" + personne + ", salaire=" + salaire
				+ ", matricule=" + matricule + ", cin=" + cin + ", diplome=" + diplome + "]";
	}

}
