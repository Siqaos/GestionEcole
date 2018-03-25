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
@Table(name = "horaire", catalog = "gestionecole")
public class Horaire  {

	private int idHoraire;
	private Transport transport;
	private String heureDebut;
	private String heureFin;
	private Set<Seance> seances = new HashSet<Seance>(0);
	private Set<Examen> examens = new HashSet<Examen>(0);
	private Set<Garde> gardes = new HashSet<Garde>(0);

	public Horaire() {
	}

	public Horaire(int idHoraire, Transport transport) {
		this.idHoraire = idHoraire;
		this.transport = transport;
	}

	public Horaire(int idHoraire, Transport transport, String heureDebut, String heureFin, Set<Seance> seances,
			Set<Examen> examens, Set<Garde> gardes) {
		this.idHoraire = idHoraire;
		this.transport = transport;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.seances = seances;
		this.examens = examens;
		this.gardes = gardes;
	}

	@Id

	@Column(name = "idHoraire", unique = true, nullable = false)
	public int getIdHoraire() {
		return this.idHoraire;
	}

	public void setIdHoraire(int idHoraire) {
		this.idHoraire = idHoraire;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Transport_idTransport", nullable = false)
	public Transport getTransport() {
		return this.transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	@Column(name = "HeureDebut", length = 45)
	public String getHeureDebut() {
		return this.heureDebut;
	}

	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}

	@Column(name = "HeureFin", length = 45)
	public String getHeureFin() {
		return this.heureFin;
	}

	public void setHeureFin(String heureFin) {
		this.heureFin = heureFin;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "horaire")
	public Set<Seance> getSeances() {
		return this.seances;
	}

	public void setSeances(Set<Seance> seances) {
		this.seances = seances;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "horaire")
	public Set<Examen> getExamens() {
		return this.examens;
	}

	public void setExamens(Set<Examen> examens) {
		this.examens = examens;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "horaire")
	public Set<Garde> getGardes() {
		return this.gardes;
	}

	public void setGardes(Set<Garde> gardes) {
		this.gardes = gardes;
	}

}
