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
@Table(name = "transport", catalog = "gestionecole")
public class Transport {

	private int idTransport;
	private Paiement paiement;
	private int paiementFactureIdFacture;
	private Set<Tarifs> tarifses = new HashSet<Tarifs>(0);
	private Set<Horaire> horaires = new HashSet<Horaire>(0);
	private Set<Vehicule> vehicules = new HashSet<Vehicule>(0);
	private Set<Positiongps> positiongpses = new HashSet<Positiongps>(0);
	private Set<Aide> aides = new HashSet<Aide>(0);

	public Transport() {
	}

	public Transport(int idTransport, Paiement paiement, int paiementFactureIdFacture) {
		this.idTransport = idTransport;
		this.paiement = paiement;
		this.paiementFactureIdFacture = paiementFactureIdFacture;
	}

	public Transport(int idTransport, Paiement paiement, int paiementFactureIdFacture, Set<Tarifs> tarifses,
			Set<Horaire> horaires, Set<Vehicule> vehicules, Set<Positiongps> positiongpses, Set<Aide> aides) {
		this.idTransport = idTransport;
		this.paiement = paiement;
		this.paiementFactureIdFacture = paiementFactureIdFacture;
		this.tarifses = tarifses;
		this.horaires = horaires;
		this.vehicules = vehicules;
		this.positiongpses = positiongpses;
		this.aides = aides;
	}

	@Id

	@Column(name = "idTransport", unique = true, nullable = false)
	public int getIdTransport() {
		return this.idTransport;
	}

	public void setIdTransport(int idTransport) {
		this.idTransport = idTransport;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paiement_idPaiement", nullable = false)
	public Paiement getPaiement() {
		return this.paiement;
	}

	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}

	@Column(name = "Paiement_Facture_idFacture", nullable = false)
	public int getPaiementFactureIdFacture() {
		return this.paiementFactureIdFacture;
	}

	public void setPaiementFactureIdFacture(int paiementFactureIdFacture) {
		this.paiementFactureIdFacture = paiementFactureIdFacture;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transport")
	public Set<Tarifs> getTarifses() {
		return this.tarifses;
	}

	public void setTarifses(Set<Tarifs> tarifses) {
		this.tarifses = tarifses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transport")
	public Set<Horaire> getHoraires() {
		return this.horaires;
	}

	public void setHoraires(Set<Horaire> horaires) {
		this.horaires = horaires;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transport")
	public Set<Vehicule> getVehicules() {
		return this.vehicules;
	}

	public void setVehicules(Set<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transport")
	public Set<Positiongps> getPositiongpses() {
		return this.positiongpses;
	}

	public void setPositiongpses(Set<Positiongps> positiongpses) {
		this.positiongpses = positiongpses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transport")
	public Set<Aide> getAides() {
		return this.aides;
	}

	public void setAides(Set<Aide> aides) {
		this.aides = aides;
	}

}
