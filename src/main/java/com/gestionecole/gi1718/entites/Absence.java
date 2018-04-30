package com.gestionecole.gi1718.entites;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "absence", catalog = "gestionecole")
public class Absence {

	private int idAbsence;
	private Eleve eleve;
	private Seance seance;
	private Date dateAbsence;
	private Matiere matiere;
	
	public Absence() {
	}

	public Absence(int idAbsence, Eleve eleve, Seance seance) {
		this.idAbsence = idAbsence;
		this.eleve = eleve;
		this.seance = seance;
	}

	public Absence(int idAbsence, Eleve eleve, Seance seance, Date dateAbsence) {
		this.idAbsence = idAbsence;
		this.eleve = eleve;
		this.seance = seance;
		this.dateAbsence = dateAbsence;
	}

	@Id

	@Column(name = "idAbsence", unique = true, nullable = false)
	public int getIdAbsence() {
		return this.idAbsence;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Matiere_idMatiere", nullable = false)
	public Matiere getMatiere() {
		return this.matiere;
	}

	public void setMatiere(Matiere m) {
		this.matiere = m;
	}

	public void setIdAbsence(int idAbsence) {
		this.idAbsence = idAbsence;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "DateAbsence", length = 10)
	public Date getDateAbsence() {
		return this.dateAbsence;
	}

	public void setDateAbsence(Date dateAbsence) {
		this.dateAbsence = dateAbsence;
	}

}
