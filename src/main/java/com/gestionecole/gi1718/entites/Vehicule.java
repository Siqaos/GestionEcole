package com.gestionecole.gi1718.entites;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "vehicule", catalog = "gestionecole")
public class Vehicule {

	private int idVehicule;
	private Transport transport;
	private String matricule;
	private String modele;
	private Date dateDachat;
	private Set<Chauffeur> chauffeurs = new HashSet<Chauffeur>(0);

	public Vehicule() {
	}

	public Vehicule(int idVehicule, Transport transport) {
		this.idVehicule = idVehicule;
		this.transport = transport;
	}

	public Vehicule(int idVehicule, Transport transport, String matricule, String modele, Date dateDachat,
			Set<Chauffeur> chauffeurs) {
		this.idVehicule = idVehicule;
		this.transport = transport;
		this.matricule = matricule;
		this.modele = modele;
		this.dateDachat = dateDachat;
		this.chauffeurs = chauffeurs;
	}

	@Id

	@Column(name = "idVehicule", unique = true, nullable = false)
	public int getIdVehicule() {
		return this.idVehicule;
	}

	public void setIdVehicule(int idVehicule) {
		this.idVehicule = idVehicule;
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

	@Column(name = "Modele", length = 45)
	public String getModele() {
		return this.modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Date_dachat", length = 10)
	public Date getDateDachat() {
		return this.dateDachat;
	}

	public void setDateDachat(Date dateDachat) {
		this.dateDachat = dateDachat;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehicule")
	public Set<Chauffeur> getChauffeurs() {
		return this.chauffeurs;
	}

	public void setChauffeurs(Set<Chauffeur> chauffeurs) {
		this.chauffeurs = chauffeurs;
	}

	@Override
	public String toString() {
		return "Vehicule [idVehicule=" + idVehicule + ", matricule=" + matricule + ", modele=" + modele
				+ ", dateDachat=" + dateDachat + "]";
	}

}
