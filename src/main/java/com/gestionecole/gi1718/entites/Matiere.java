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
@Table(name = "matiere", catalog = "gestionecole")
public class Matiere {

	private int idMatiere;
	private Unite unite;
	private String nomMatiere;
	private String coeficient;
	private String nombreHeure;
	private String nombreExamen;
	private Set<Seance> seances = new HashSet<Seance>(0);
	private Set<Examen> examens = new HashSet<Examen>(0);
	private Set<Absence> absences = new HashSet<Absence>(0);
	private Set<Devoir> devoirs = new HashSet<Devoir>(0);

	public Matiere() {
	}

	public Matiere(int idMatiere, Unite unite) {
		this.idMatiere = idMatiere;
		this.unite = unite;
	}

	public Matiere(int idMatiere, Unite unite, String nomMatiere, String coeficient, String nombreHeure,
			String nombreExamen, Set<Seance> seances, Set<Examen> examens) {
		this.idMatiere = idMatiere;
		this.unite = unite;
		this.nomMatiere = nomMatiere;
		this.coeficient = coeficient;
		this.nombreHeure = nombreHeure;
		this.nombreExamen = nombreExamen;
		this.seances = seances;
		this.examens = examens;
	}

	@Id

	@Column(name = "idMatiere", unique = true, nullable = false)
	public int getIdMatiere() {
		return this.idMatiere;
	}

	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Unite_idUnite1", nullable = false)
	public Unite getUnite() {
		return this.unite;
	}

	public void setUnite(Unite unite) {
		this.unite = unite;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "matiere")
	public Set<Absence> getAbsences() {
		return this.absences;
	}

	public void setAbsences(Set<Absence> absences) {
		this.absences = absences;
	}

	@Column(name = "NomMatiere", length = 45)
	public String getNomMatiere() {
		return this.nomMatiere;
	}

	public void setNomMatiere(String nomMatiere) {
		this.nomMatiere = nomMatiere;
	}

	@Column(name = "Coeficient", length = 45)
	public String getCoeficient() {
		return this.coeficient;
	}

	public void setCoeficient(String coeficient) {
		this.coeficient = coeficient;
	}

	@Column(name = "NombreHeure", length = 45)
	public String getNombreHeure() {
		return this.nombreHeure;
	}

	public void setNombreHeure(String nombreHeure) {
		this.nombreHeure = nombreHeure;
	}

	@Column(name = "nombreExamen", length = 45)
	public String getNombreExamen() {
		return this.nombreExamen;
	}

	public void setNombreExamen(String nombreExamen) {
		this.nombreExamen = nombreExamen;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "matiere")
	public Set<Seance> getSeances() {
		return this.seances;
	}

	public void setSeances(Set<Seance> seances) {
		this.seances = seances;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "matiere")
	public Set<Examen> getExamens() {
		return this.examens;
	}

	public void setExamens(Set<Examen> examens) {
		this.examens = examens;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "matiere")
	public Set<Devoir> getDevoirs() {
		return this.devoirs;
	}

	public void setDevoirs(Set<Devoir> devoirs) {
		this.devoirs = devoirs;
	}
}
