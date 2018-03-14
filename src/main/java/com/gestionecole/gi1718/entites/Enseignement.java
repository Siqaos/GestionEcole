package com.gestionecole.gi1718.entites;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "enseignement", catalog = "gestionecole")
public class Enseignement {

	private EnseignementId id;
	private Classe classe;
	private Horaire horaire;
	private Matiere matiere;
	private Professeur professeur;
	private Seance seance;

	public Enseignement() {
	}

	public Enseignement(EnseignementId id, Classe classe, Horaire horaire, Matiere matiere, Professeur professeur,
			Seance seance) {
		this.id = id;
		this.classe = classe;
		this.horaire = horaire;
		this.matiere = matiere;
		this.professeur = professeur;
		this.seance = seance;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idEmploidutemps", column = @Column(name = "idEmploidutemps", nullable = false)),
			@AttributeOverride(name = "classeIdClasse", column = @Column(name = "Classe_idClasse", nullable = false)) })
	public EnseignementId getId() {
		return this.id;
	}

	public void setId(EnseignementId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Classe_idClasse", nullable = false, insertable = false, updatable = false)
	public Classe getClasse() {
		return this.classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
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
	@JoinColumn(name = "matiere_idMatiere", nullable = false)
	public Matiere getMatiere() {
		return this.matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
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
	@JoinColumn(name = "seance_idSeance", nullable = false)
	public Seance getSeance() {
		return this.seance;
	}

	public void setSeance(Seance seance) {
		this.seance = seance;
	}

	@Override
	public String toString() {
		return "Enseignement [id=" + id + ", classe=" + classe + "]";
	}

}
