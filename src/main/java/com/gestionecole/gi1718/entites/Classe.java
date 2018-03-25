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
@Table(name = "classe", catalog = "gestionecole")
public class Classe  {

	private int idClasse;
	private Niveau niveau;
	private Set<Eleve> eleves = new HashSet<Eleve>(0);
	private Set<Seance> seances = new HashSet<Seance>(0);

	public Classe() {
	}

	public Classe(int idClasse, Niveau niveau) {
		this.idClasse = idClasse;
		this.niveau = niveau;
	}

	public Classe(int idClasse, Niveau niveau, Set<Eleve> eleves, Set<Seance> seances) {
		this.idClasse = idClasse;
		this.niveau = niveau;
		this.eleves = eleves;
		this.seances = seances;
	}

	@Id

	@Column(name = "idClasse", unique = true, nullable = false)
	public int getIdClasse() {
		return this.idClasse;
	}

	public void setIdClasse(int idClasse) {
		this.idClasse = idClasse;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "niveau_idNiveau", nullable = false)
	public Niveau getNiveau() {
		return this.niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "classe")
	public Set<Eleve> getEleves() {
		return this.eleves;
	}

	public void setEleves(Set<Eleve> eleves) {
		this.eleves = eleves;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "classe")
	public Set<Seance> getSeances() {
		return this.seances;
	}

	public void setSeances(Set<Seance> seances) {
		this.seances = seances;
	}

}
