package com.gestionecole.gi1718.entites;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "salle", catalog = "gestionecole")
public class Salle {

	private int idSalle;
	private String numSalle;
	private Set<Seance> seances = new HashSet<Seance>(0);

	public Salle() {
	}

	public Salle(int idSalle) {
		this.idSalle = idSalle;
	}

	public Salle(int idSalle, String numSalle, Set<Seance> seances) {
		this.idSalle = idSalle;
		this.numSalle = numSalle;
		this.seances = seances;
	}

	@Id

	@Column(name = "idSalle", unique = true, nullable = false)
	public int getIdSalle() {
		return this.idSalle;
	}

	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}

	@Column(name = "NumSalle", length = 45)
	public String getNumSalle() {
		return this.numSalle;
	}

	public void setNumSalle(String numSalle) {
		this.numSalle = numSalle;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salle")
	public Set<Seance> getSeances() {
		return this.seances;
	}

	public void setSeances(Set<Seance> seances) {
		this.seances = seances;
	}

	@Override
	public String toString() {
		return "Salle [idSalle=" + idSalle + ", numSalle=" + numSalle + "]";
	}

}
