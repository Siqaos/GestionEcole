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
@Table(name = "typepaiement", catalog = "gestionecole")
public class Typepaiement {

	private int idTypePaye;
	private Paiement paiement;
	private String typePaiement;
	private Set<Cheque> cheques = new HashSet<Cheque>(0);

	public Typepaiement() {
	}

	public Typepaiement(int idTypePaye, Paiement paiement) {
		this.idTypePaye = idTypePaye;
		this.paiement = paiement;
	}

	public Typepaiement(int idTypePaye, Paiement paiement, String typePaiement, Set<Cheque> cheques) {
		this.idTypePaye = idTypePaye;
		this.paiement = paiement;
		this.typePaiement = typePaiement;
		this.cheques = cheques;
	}

	@Id

	@Column(name = "idTypePaye", unique = true, nullable = false)
	public int getIdTypePaye() {
		return this.idTypePaye;
	}

	public void setIdTypePaye(int idTypePaye) {
		this.idTypePaye = idTypePaye;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Paiement_idPaiement", nullable = false)
	public Paiement getPaiement() {
		return this.paiement;
	}

	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}

	@Column(name = "TypePaiement", length = 45)
	public String getTypePaiementcol() {
		return this.typePaiement;
	}

	public void setTypePaiement(String typePaiement) {
		this.typePaiement = typePaiement;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typepaiement")
	public Set<Cheque> getCheques() {
		return this.cheques;
	}

	public void setCheques(Set<Cheque> cheques) {
		this.cheques = cheques;
	}

	@Override
	public String toString() {
		return "Typepaiement [idTypePaye=" + idTypePaye + ", typePaiement=" + typePaiement + "]";
	}

}
