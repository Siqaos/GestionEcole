package com.gestionecole.gi1718.entites;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EnseignementId  {

	private int idEmploidutemps;
	private int classeIdClasse;

	public EnseignementId() {
	}

	public EnseignementId(int idEmploidutemps, int classeIdClasse) {
		this.idEmploidutemps = idEmploidutemps;
		this.classeIdClasse = classeIdClasse;
	}

	@Column(name = "idEmploidutemps", nullable = false)
	public int getIdEmploidutemps() {
		return this.idEmploidutemps;
	}

	public void setIdEmploidutemps(int idEmploidutemps) {
		this.idEmploidutemps = idEmploidutemps;
	}

	@Column(name = "Classe_idClasse", nullable = false)
	public int getClasseIdClasse() {
		return this.classeIdClasse;
	}

	public void setClasseIdClasse(int classeIdClasse) {
		this.classeIdClasse = classeIdClasse;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EnseignementId))
			return false;
		EnseignementId castOther = (EnseignementId) other;

		return (this.getIdEmploidutemps() == castOther.getIdEmploidutemps())
				&& (this.getClasseIdClasse() == castOther.getClasseIdClasse());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdEmploidutemps();
		result = 37 * result + this.getClasseIdClasse();
		return result;
	}

	@Override
	public String toString() {
		return "EnseignementId [idEmploidutemps=" + idEmploidutemps + ", classeIdClasse=" + classeIdClasse + "]";
	}

}
