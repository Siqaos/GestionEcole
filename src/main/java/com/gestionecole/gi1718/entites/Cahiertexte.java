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
@Table(name = "cahiertexte", catalog = "gestionecole")
public class Cahiertexte {

	private int idCahiertexte;
	private Professeur professeur;
	private Date date;
	private String heure;
	private String tache;
	private Set<Seance> seances = new HashSet<Seance>(0);

	public Cahiertexte() {
	}

	public Cahiertexte(int idCahiertexte, Professeur professeur) {
		this.idCahiertexte = idCahiertexte;
		this.professeur = professeur;
	}

	public Cahiertexte(int idCahiertexte, Professeur professeur, Date date, String heure, String tache,
			Set<Seance> seances) {
		this.idCahiertexte = idCahiertexte;
		this.professeur = professeur;
		this.date = date;
		this.heure = heure;
		this.tache = tache;
		this.seances = seances;
	}

	@Id

	@Column(name = "idCahiertexte", unique = true, nullable = false)
	public int getIdCahiertexte() {
		return this.idCahiertexte;
	}

	public void setIdCahiertexte(int idCahiertexte) {
		this.idCahiertexte = idCahiertexte;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "professeur_idProfesseur", nullable = false)
	public Professeur getProfesseur() {
		return this.professeur;
	}

	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Date", length = 10)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "Heure", length = 45)
	public String getHeure() {
		return this.heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	@Column(name = "Tache")
	public String getTache() {
		return this.tache;
	}

	public void setTache(String tache) {
		this.tache = tache;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cahiertexte")
	public Set<Seance> getSeances() {
		return this.seances;
	}

	public void setSeances(Set<Seance> seances) {
		this.seances = seances;
	}

}
