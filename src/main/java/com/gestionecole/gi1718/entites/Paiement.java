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
@Table(name = "paiement", catalog = "gestionecole")
public class Paiement  {

	private int idPaiement;
	private Garde garde;
	private boolean paye;
	private Set<Inscription> inscriptions = new HashSet<Inscription>(0);
	private Set<Typepaiement> typepaiements = new HashSet<Typepaiement>(0);
	private Set<Facture> factures = new HashSet<Facture>(0);
	private Set<Transport> transports = new HashSet<Transport>(0);

	public Paiement() {
	}

	public Paiement(int idPaiement, Garde garde, boolean paye) {
		this.idPaiement = idPaiement;
		this.garde = garde;
		this.paye = paye;
	}

	public Paiement(int idPaiement, Garde garde, boolean paye, Set<Inscription> inscriptions,
			Set<Typepaiement> typepaiements, Set<Facture> factures, Set<Transport> transports) {
		this.idPaiement = idPaiement;
		this.garde = garde;
		this.paye = paye;
		this.inscriptions = inscriptions;
		this.typepaiements = typepaiements;
		this.factures = factures;
		this.transports = transports;
	}

	@Id

	@Column(name = "idPaiement", unique = true, nullable = false)
	public int getIdPaiement() {
		return this.idPaiement;
	}

	public void setIdPaiement(int idPaiement) {
		this.idPaiement = idPaiement;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "garde_idGarde", nullable = false)
	public Garde getGarde() {
		return this.garde;
	}

	public void setGarde(Garde garde) {
		this.garde = garde;
	}

	@Column(name = "Paye", nullable = false)
	public boolean isPaye() {
		return this.paye;
	}

	public void setPaye(boolean paye) {
		this.paye = paye;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paiement")
	public Set<Inscription> getInscriptions() {
		return this.inscriptions;
	}

	public void setInscriptions(Set<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paiement")
	public Set<Typepaiement> getTypepaiements() {
		return this.typepaiements;
	}

	public void setTypepaiements(Set<Typepaiement> typepaiements) {
		this.typepaiements = typepaiements;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paiement")
	public Set<Facture> getFactures() {
		return this.factures;
	}

	public void setFactures(Set<Facture> factures) {
		this.factures = factures;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paiement")
	public Set<Transport> getTransports() {
		return this.transports;
	}

	public void setTransports(Set<Transport> transports) {
		this.transports = transports;
	}

}
