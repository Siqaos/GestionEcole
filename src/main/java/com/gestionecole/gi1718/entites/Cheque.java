package com.gestionecole.gi1718.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cheque", catalog = "gestionecole")
public class Cheque {

	private int idCheque;
	private Typepaiement typepaiement;
	private String numeroCheque;
	private String nomCheque;

	public Cheque() {
	}

	public Cheque(int idCheque, Typepaiement typepaiement) {
		this.idCheque = idCheque;
		this.typepaiement = typepaiement;
	}

	public Cheque(int idCheque, Typepaiement typepaiement, String numeroCheque, String nomCheque) {
		this.idCheque = idCheque;
		this.typepaiement = typepaiement;
		this.numeroCheque = numeroCheque;
		this.nomCheque = nomCheque;
	}

	@Id

	@Column(name = "idCheque", unique = true, nullable = false)
	public int getIdCheque() {
		return this.idCheque;
	}

	public void setIdCheque(int idCheque) {
		this.idCheque = idCheque;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TypePaiement_idTypePaye", nullable = false)
	public Typepaiement getTypepaiement() {
		return this.typepaiement;
	}

	public void setTypepaiement(Typepaiement typepaiement) {
		this.typepaiement = typepaiement;
	}

	@Column(name = "NumeroCheque", length = 45)
	public String getNumeroCheque() {
		return this.numeroCheque;
	}

	public void setNumeroCheque(String numeroCheque) {
		this.numeroCheque = numeroCheque;
	}

	@Column(name = "NomCheque", length = 200)
	public String getNomCheque() {
		return this.nomCheque;
	}

	public void setNomCheque(String nomCheque) {
		this.nomCheque = nomCheque;
	}

}
