package com.gestionecole.gi1718.entites;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "aide", catalog = "gestionecole")
@PrimaryKeyJoinColumn(name = "idPersonne")
public class Aide  extends Personne {

	private Personne personne;
	private Transport transport;
	private String matricule;
	private String cin;
	private Date dateDebutTravail;
	private Set<Garde> gardes = new HashSet<Garde>(0);

	public Aide() {
	}

	public Aide(Personne personne, Transport transport) {
		this.personne = personne;
		this.transport = transport;
	}

	public Aide( Personne personne, Transport transport, String matricule, String cin, Date dateDebutTravail,
			Set<Garde> gardes) {
		this.personne = personne;
		this.transport = transport;
		this.matricule = matricule;
		this.cin = cin;
		this.dateDebutTravail = dateDebutTravail;
		this.gardes = gardes;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "personne_idPersonne", nullable = false)
	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "transport_idTransport", nullable = false)
	public Transport getTransport() {
		return this.transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	@Column(name = "Matricule", length = 45)
	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	@Column(name = "CIN", length = 45)
	public String getCin() {
		return this.cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DateDebutTravail", length = 10)
	public Date getDateDebutTravail() {
		return this.dateDebutTravail;
	}

	public void setDateDebutTravail(Date dateDebutTravail) {
		this.dateDebutTravail = dateDebutTravail;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aide")
	public Set<Garde> getGardes() {
		return this.gardes;
	}

	public void setGardes(Set<Garde> gardes) {
		this.gardes = gardes;
	}

}
