package com.gestionecole.gi1718.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reduction", catalog = "gestionecole")
public class Reduction  {

	private int idReduction;
	private Tarifs tarifs;
	private String prctageReduction;
	private String typeReduction;

	public Reduction() {
	}

	public Reduction(int idReduction, Tarifs tarifs) {
		this.idReduction = idReduction;
		this.tarifs = tarifs;
	}

	public Reduction(int idReduction, Tarifs tarifs, String prctageReduction, String typeReduction) {
		this.idReduction = idReduction;
		this.tarifs = tarifs;
		this.prctageReduction = prctageReduction;
		this.typeReduction = typeReduction;
	}

	@Id

	@Column(name = "idReduction", unique = true, nullable = false)
	public int getIdReduction() {
		return this.idReduction;
	}

	public void setIdReduction(int idReduction) {
		this.idReduction = idReduction;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Tarifs_idTarifs", nullable = false)
	public Tarifs getTarifs() {
		return this.tarifs;
	}

	public void setTarifs(Tarifs tarifs) {
		this.tarifs = tarifs;
	}

	@Column(name = "prctageReduction", length = 45)
	public String getPrctageReduction() {
		return this.prctageReduction;
	}

	public void setPrctageReduction(String prctageReduction) {
		this.prctageReduction = prctageReduction;
	}

	@Column(name = "typeReduction", length = 45)
	public String getTypeReduction() {
		return this.typeReduction;
	}

	public void setTypeReduction(String typeReduction) {
		this.typeReduction = typeReduction;
	}

	@Override
	public String toString() {
		return "Reduction [idReduction=" + idReduction + ", tarifs=" + tarifs + ", prctageReduction=" + prctageReduction
				+ ", typeReduction=" + typeReduction + "]";
	}

}
