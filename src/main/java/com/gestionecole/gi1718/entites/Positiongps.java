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
@Table(name = "positiongps", catalog = "gestionecole")
public class Positiongps  {

	private int idPosition;
	private Transport transport;
	private String latitude;
	private String longitude;
	private String altitude;
	private int elevePositionGpsIdPosition;
	private int elevePersonneIdPersonne;
	private Set<Eleve> eleves = new HashSet<Eleve>(0);

	public Positiongps() {
	}

	public Positiongps(int idPosition, Transport transport, int elevePositionGpsIdPosition,
			int elevePersonneIdPersonne) {
		this.idPosition = idPosition;
		this.transport = transport;
		this.elevePositionGpsIdPosition = elevePositionGpsIdPosition;
		this.elevePersonneIdPersonne = elevePersonneIdPersonne;
	}

	public Positiongps(int idPosition, Transport transport, String latitude, String longitude, String altitude,
			int elevePositionGpsIdPosition, int elevePersonneIdPersonne, Set<Eleve> eleves) {
		this.idPosition = idPosition;
		this.transport = transport;
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.elevePositionGpsIdPosition = elevePositionGpsIdPosition;
		this.elevePersonneIdPersonne = elevePersonneIdPersonne;
		this.eleves = eleves;
	}

	@Id

	@Column(name = "idPosition", unique = true, nullable = false)
	public int getIdPosition() {
		return this.idPosition;
	}

	public void setIdPosition(int idPosition) {
		this.idPosition = idPosition;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "transport_idTransport", nullable = false)
	public Transport getTransport() {
		return this.transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	@Column(name = "latitude", length = 45)
	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Column(name = "longitude", length = 45)
	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Column(name = "altitude", length = 45)
	public String getAltitude() {
		return this.altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "positiongps")
	public Set<Eleve> getEleves() {
		return this.eleves;
	}

	public void setEleves(Set<Eleve> eleves) {
		this.eleves = eleves;
	}

}
