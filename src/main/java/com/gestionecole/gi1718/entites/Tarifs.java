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
@Table(name = "tarifs", catalog = "gestionecole")
public class Tarifs {

	private int idTarifs;
	private Transport transport;
	private Float montant;
	private Set<Garde> gardes = new HashSet<Garde>(0);
	private Set<Inscription> inscriptions = new HashSet<Inscription>(0);
	private Set<Reduction> reductions = new HashSet<Reduction>(0);

	public Tarifs() {
	}

	public Tarifs(int idTarifs, Transport transport) {
		this.idTarifs = idTarifs;
		this.transport = transport;
	}

	public Tarifs(int idTarifs, Transport transport, Float montant, Set<Garde> gardes, Set<Inscription> inscriptions,
			Set<Reduction> reductions) {
		this.idTarifs = idTarifs;
		this.transport = transport;
		this.montant = montant;
		this.gardes = gardes;
		this.inscriptions = inscriptions;
		this.reductions = reductions;
	}

	@Id

	@Column(name = "idTarifs", unique = true, nullable = false)
	public int getIdTarifs() {
		return this.idTarifs;
	}

	public void setIdTarifs(int idTarifs) {
		this.idTarifs = idTarifs;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "transport_idTransport", nullable = false)
	public Transport getTransport() {
		return this.transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	@Column(name = "Montant", precision = 12, scale = 0)
	public Float getMontant() {
		return this.montant;
	}

	public void setMontant(Float montant) {
		this.montant = montant;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tarifs")
	public Set<Garde> getGardes() {
		return this.gardes;
	}

	public void setGardes(Set<Garde> gardes) {
		this.gardes = gardes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tarifs")
	public Set<Inscription> getInscriptions() {
		return this.inscriptions;
	}

	public void setInscriptions(Set<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tarifs")
	public Set<Reduction> getReductions() {
		return this.reductions;
	}

	public void setReductions(Set<Reduction> reductions) {
		this.reductions = reductions;
	}

	@Override
	public String toString() {
		return "Tarifs [idTarifs=" + idTarifs + ", montant=" + montant + "]";
	}

}
