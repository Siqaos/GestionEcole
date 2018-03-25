package com.gestionecole.gi1718.entites;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "inscription", catalog = "gestionecole")
public class Inscription {

	private int idInscription;
	private Anneescolaire anneescolaire;
	private Paiement paiement;
	private Tarifs tarifs;
	private Date dateInscription;
	private Set<Eleve> eleves = new HashSet<Eleve>(0);

	public Inscription() {
	}

	public Inscription(int idInscription, Anneescolaire anneescolaire, Paiement paiement, Tarifs tarifs) {
		this.idInscription = idInscription;
		this.anneescolaire = anneescolaire;
		this.paiement = paiement;
		this.tarifs = tarifs;
	}

	public Inscription(int idInscription, Anneescolaire anneescolaire, Paiement paiement, Tarifs tarifs,
			Date dateInscription, Set<Eleve> eleves) {
		this.idInscription = idInscription;
		this.anneescolaire = anneescolaire;
		this.paiement = paiement;
		this.tarifs = tarifs;
		this.dateInscription = dateInscription;
		this.eleves = eleves;
	}

	@Id

	@Column(name = "idInscription", unique = true, nullable = false)
	public int getIdInscription() {
		return this.idInscription;
	}

	public void setIdInscription(int idInscription) {
		this.idInscription = idInscription;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AnneeScolaire_idAnneeScolaire", nullable = false)
	public Anneescolaire getAnneescolaire() {
		return this.anneescolaire;
	}

	public void setAnneescolaire(Anneescolaire anneescolaire) {
		this.anneescolaire = anneescolaire;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paiement_idPaiement", nullable = false)
	public Paiement getPaiement() {
		return this.paiement;
	}

	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tarifs_idTarifs", nullable = false)
	public Tarifs getTarifs() {
		return this.tarifs;
	}

	public void setTarifs(Tarifs tarifs) {
		this.tarifs = tarifs;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateInscription", length = 19)
	public Date getDateInscription() {
		return this.dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "inscription")
	public Set<Eleve> getEleves() {
		return this.eleves;
	}

	public void setEleves(Set<Eleve> eleves) {
		this.eleves = eleves;
	}

}
