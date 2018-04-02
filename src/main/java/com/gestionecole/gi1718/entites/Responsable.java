package com.gestionecole.gi1718.entites;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "responsable", catalog = "gestionecole")
@PrimaryKeyJoinColumn(name = "idPersonne")
public class Responsable extends Personne {

	private Personne personne;
	private String cin;
	private Set<Eleve> eleves = new HashSet<Eleve>(0);

	public Responsable() {
	}

	public Responsable( Personne personne) {
		this.personne = personne;
	}

	public Responsable( Personne personne, String cin, Set<Eleve> eleves) {
		this.personne = personne;
		this.cin = cin;
		this.eleves = eleves;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "personne_idPersonne", nullable = false)
	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Column(name = "CIN", length = 45)
	public String getCin() {
		return this.cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	@Override
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "responsable")
	public Set<Eleve> getEleves() {
		return this.eleves;
	}

	@Override
	public void setEleves(Set<Eleve> eleves) {
		this.eleves = eleves;
	}

}
