package com.gestionecole.gi1718.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "observation", catalog = "gestionecole")
public class Observation  {

	private int idObservation;
	private Eleve eleve;
	private Seance seance;
	private String remarque;
	private String date;
	private int elevePositionGpsIdPosition;
	private int elevePersonneIdPersonne;

	public Observation() {
	}

	public Observation(int idObservation, Eleve eleve, Seance seance, int elevePositionGpsIdPosition,
			int elevePersonneIdPersonne) {
		this.idObservation = idObservation;
		this.eleve = eleve;
		this.seance = seance;
		this.elevePositionGpsIdPosition = elevePositionGpsIdPosition;
		this.elevePersonneIdPersonne = elevePersonneIdPersonne;
	}

	public Observation(int idObservation, Eleve eleve, Seance seance, String remarque, String date,
			int elevePositionGpsIdPosition, int elevePersonneIdPersonne) {
		this.idObservation = idObservation;
		this.eleve = eleve;
		this.seance = seance;
		this.remarque = remarque;
		this.date = date;
		this.elevePositionGpsIdPosition = elevePositionGpsIdPosition;
		this.elevePersonneIdPersonne = elevePersonneIdPersonne;
	}

	@Id

	@Column(name = "idObservation", unique = true, nullable = false)
	public int getIdObservation() {
		return this.idObservation;
	}

	public void setIdObservation(int idObservation) {
		this.idObservation = idObservation;
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
	@JoinColumn(name = "seance_idSeance", nullable = false)
	public Seance getSeance() {
		return this.seance;
	}

	public void setSeance(Seance seance) {
		this.seance = seance;
	}

	@Column(name = "Remarque")
	public String getRemarque() {
		return this.remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	@Column(name = "Date", length = 45)
	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Column(name = "Eleve_PositionGPS_idPosition", nullable = false)
	public int getElevePositionGpsIdPosition() {
		return this.elevePositionGpsIdPosition;
	}

	public void setElevePositionGpsIdPosition(int elevePositionGpsIdPosition) {
		this.elevePositionGpsIdPosition = elevePositionGpsIdPosition;
	}

	@Column(name = "Eleve_Personne_idPersonne", nullable = false)
	public int getElevePersonneIdPersonne() {
		return this.elevePersonneIdPersonne;
	}

	public void setElevePersonneIdPersonne(int elevePersonneIdPersonne) {
		this.elevePersonneIdPersonne = elevePersonneIdPersonne;
	}

}
