package com.gestionecole.gi1718.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "retard", catalog = "gestionecole")
public class Retard  {

	private int idRetard;
	private Eleve eleve;
	private Seance seance;
	private String retardcol;

	public Retard() {
	}

	public Retard(int idRetard, Eleve eleve, Seance seance) {
		this.idRetard = idRetard;
		this.eleve = eleve;
		this.seance = seance;
	}

	public Retard(int idRetard, Eleve eleve, Seance seance, String retardcol) {
		this.idRetard = idRetard;
		this.eleve = eleve;
		this.seance = seance;
		this.retardcol = retardcol;
	}

	@Id

	@Column(name = "idRetard", unique = true, nullable = false)
	public int getIdRetard() {
		return this.idRetard;
	}

	public void setIdRetard(int idRetard) {
		this.idRetard = idRetard;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Eleve_idEleve", nullable = false)
	public Eleve getEleve() {
		return this.eleve;
	}

	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Seance_idSeance", nullable = false)
	public Seance getSeance() {
		return this.seance;
	}

	public void setSeance(Seance seance) {
		this.seance = seance;
	}

	@Column(name = "Retardcol", length = 45)
	public String getRetardcol() {
		return this.retardcol;
	}

	public void setRetardcol(String retardcol) {
		this.retardcol = retardcol;
	}

	@Override
	public String toString() {
		return "Retard [idRetard=" + idRetard + ", seance=" + seance + ", retardcol=" + retardcol + "]";
	}

}
