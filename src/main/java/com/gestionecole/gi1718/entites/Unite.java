package com.gestionecole.gi1718.entites;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "unite", catalog = "gestionecole")
public class Unite {

	private int idUnite;
	private String nomUnite;
	private Set<Niveau> niveaus = new HashSet<Niveau>(0);
	private Set<Matiere> matieres = new HashSet<Matiere>(0);

	public Unite() {
	}

	public Unite(int idUnite) {
		this.idUnite = idUnite;
	}

	public Unite(int idUnite, String nomUnite, Set<Niveau> niveaus, Set<Matiere> matieres) {
		this.idUnite = idUnite;
		this.nomUnite = nomUnite;
		this.niveaus = niveaus;
		this.matieres = matieres;
	}

	@Id

	@Column(name = "idUnite", unique = true, nullable = false)
	public int getIdUnite() {
		return this.idUnite;
	}

	public void setIdUnite(int idUnite) {
		this.idUnite = idUnite;
	}

	@Column(name = "nomUnite", length = 45)
	public String getNomUnite() {
		return this.nomUnite;
	}

	public void setNomUnite(String nomUnite) {
		this.nomUnite = nomUnite;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "niveau_has_unite", catalog = "gestionecole", joinColumns = {
			@JoinColumn(name = "unite_idUnite", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "niveau_idNiveau", nullable = false, updatable = false) })
	public Set<Niveau> getNiveaus() {
		return this.niveaus;
	}

	public void setNiveaus(Set<Niveau> niveaus) {
		this.niveaus = niveaus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unite")
	public Set<Matiere> getMatieres() {
		return this.matieres;
	}

	public void setMatieres(Set<Matiere> matieres) {
		this.matieres = matieres;
	}

	@Override
	public String toString() {
		return "Unite [idUnite=" + idUnite + ", nomUnite=" + nomUnite + "]";
	}

}
