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
@Table(name = "salaire", catalog = "gestionecole")
public class Salaire  {

	private int idSalaire;
	private Integer salaire;
	private Set<Professeur> professeurs = new HashSet<Professeur>(0);
	private Set<Chauffeur> chauffeurs = new HashSet<Chauffeur>(0);
	private Set<Secretaire> secretaires = new HashSet<Secretaire>(0);
	private Set<Gardien> gardiens = new HashSet<Gardien>(0);
	private Set<Directeur> directeurs = new HashSet<Directeur>(0);
	private Set<Femmedemenage> femmedemenages = new HashSet<Femmedemenage>(0);
	private Set<Gestionnaire> gestionnaires = new HashSet<Gestionnaire>(0);

	public Salaire() {
	}

	public Salaire(int idSalaire) {
		this.idSalaire = idSalaire;
	}

	public Salaire(int idSalaire, Integer salaire, Set<Professeur> professeurs, Set<Chauffeur> chauffeurs,
			Set<Secretaire> secretaires, Set<Gardien> gardiens, Set<Directeur> directeurs,
			Set<Femmedemenage> femmedemenages, Set<Gestionnaire> gestionnaires) {
		this.idSalaire = idSalaire;
		this.salaire = salaire;
		this.professeurs = professeurs;
		this.chauffeurs = chauffeurs;
		this.secretaires = secretaires;
		this.gardiens = gardiens;
		this.directeurs = directeurs;
		this.femmedemenages = femmedemenages;
		this.gestionnaires = gestionnaires;
	}

	@Id

	@Column(name = "idSalaire", unique = true, nullable = false)
	public int getIdSalaire() {
		return this.idSalaire;
	}

	public void setIdSalaire(int idSalaire) {
		this.idSalaire = idSalaire;
	}

	@Column(name = "Salaire")
	public Integer getSalaire() {
		return this.salaire;
	}

	public void setSalaire(Integer salaire) {
		this.salaire = salaire;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salaire")
	public Set<Professeur> getProfesseurs() {
		return this.professeurs;
	}

	public void setProfesseurs(Set<Professeur> professeurs) {
		this.professeurs = professeurs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salaire")
	public Set<Chauffeur> getChauffeurs() {
		return this.chauffeurs;
	}

	public void setChauffeurs(Set<Chauffeur> chauffeurs) {
		this.chauffeurs = chauffeurs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salaire")
	public Set<Secretaire> getSecretaires() {
		return this.secretaires;
	}

	public void setSecretaires(Set<Secretaire> secretaires) {
		this.secretaires = secretaires;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salaire")
	public Set<Gardien> getGardiens() {
		return this.gardiens;
	}

	public void setGardiens(Set<Gardien> gardiens) {
		this.gardiens = gardiens;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salaire")
	public Set<Directeur> getDirecteurs() {
		return this.directeurs;
	}

	public void setDirecteurs(Set<Directeur> directeurs) {
		this.directeurs = directeurs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salaire")
	public Set<Femmedemenage> getFemmedemenages() {
		return this.femmedemenages;
	}

	public void setFemmedemenages(Set<Femmedemenage> femmedemenages) {
		this.femmedemenages = femmedemenages;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salaire")
	public Set<Gestionnaire> getGestionnaires() {
		return this.gestionnaires;
	}

	public void setGestionnaires(Set<Gestionnaire> gestionnaires) {
		this.gestionnaires = gestionnaires;
	}

}
