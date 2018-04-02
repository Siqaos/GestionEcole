package com.gestionecole.gi1718.entites;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "directeur", catalog = "gestionecole")
@PrimaryKeyJoinColumn(name = "idPersonne")
public class Directeur extends Personne  {

	private Salaire salaire;
	private String matricule;
	private String cin;
	private Set<Personne> personnes = new HashSet<Personne>(0);

	public Directeur() {
	}

	public Directeur( Salaire salaire) {
		this.salaire = salaire;
	}

	public Directeur(Salaire salaire, String matricule, String cin, Set<Personne> personnes) {
		this.salaire = salaire;
		this.matricule = matricule;
		this.cin = cin;
		this.personnes = personnes;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "directeur")
	public Set<Personne> getPersonnes() {
		return this.personnes;
	}

	public void setPersonnes(Set<Personne> personnes) {
		this.personnes = personnes;
	}

}
