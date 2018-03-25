package com.gestionecole.gi1718.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "facture", catalog = "gestionecole")
public class Facture  {

	private int idFacture;
	private Fournisseur fournisseur;
	private Paiement paiement;
	private String date;

	public Facture() {
	}

	public Facture(int idFacture, Fournisseur fournisseur, Paiement paiement) {
		this.idFacture = idFacture;
		this.fournisseur = fournisseur;
		this.paiement = paiement;
	}

	public Facture(int idFacture, Fournisseur fournisseur, Paiement paiement, String date) {
		this.idFacture = idFacture;
		this.fournisseur = fournisseur;
		this.paiement = paiement;
		this.date = date;
	}

	@Id

	@Column(name = "idFacture", unique = true, nullable = false)
	public int getIdFacture() {
		return this.idFacture;
	}

	public void setIdFacture(int idFacture) {
		this.idFacture = idFacture;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Fournisseur_idFournisseur", nullable = false)
	public Fournisseur getFournisseur() {
		return this.fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paiement_idPaiement", nullable = false)
	public Paiement getPaiement() {
		return this.paiement;
	}

	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}

	@Column(name = "Date", length = 45)
	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
