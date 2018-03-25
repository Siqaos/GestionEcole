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
@Table(name = "responsable", catalog = "gestionecole")
@PrimaryKeyJoinColumn(name = "idPersonne")
public class Responsable extends Personne {

	private int idResponsable;
	private Personne personne;
	private String cin;
	private Set<Eleve> eleves = new HashSet<Eleve>(0);

	public Responsable() {
	}

	public Responsable(int idResponsable, Personne personne) {
		this.idResponsable = idResponsable;
		this.personne = personne;
	}

	public Responsable(int idResponsable, Personne personne, String cin, Set<Eleve> eleves) {
		this.idResponsable = idResponsable;
		this.personne = personne;
		this.cin = cin;
		this.eleves = eleves;
	}

	@Id

	@Column(name = "idResponsable", unique = true, nullable = false)
	public int getIdResponsable() {
		return this.idResponsable;
	}

	public void setIdResponsable(int idResponsable) {
		this.idResponsable = idResponsable;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "responsable")
	public Set<Eleve> getEleves() {
		return this.eleves;
	}

	public void setEleves(Set<Eleve> eleves) {
		this.eleves = eleves;
	}

}
