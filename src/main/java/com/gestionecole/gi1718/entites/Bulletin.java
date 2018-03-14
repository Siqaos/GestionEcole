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
@Table(name = "Bulletin", catalog = "gestionecole")
public class Bulletin{

	private int idResultats;
	private Eleve eleve;
	private Session session;
	private String moyenne;
	private String remarque;
	private Set<Note> notes = new HashSet<Note>(0);

	public Bulletin() {
	}

	public Bulletin(int idResultats, Eleve eleve, Session session) {
		this.idResultats = idResultats;
		this.eleve = eleve;
		this.session = session;

	}

	public Bulletin(int idResultats, Eleve eleve, Session session, String moyenne, String remarque, Set<Note> notes) {
		this.idResultats = idResultats;
		this.eleve = eleve;
		this.session = session;
		this.moyenne = moyenne;
		this.remarque = remarque;
		this.notes = notes;
	}

	@Id

	@Column(name = "idResultats", unique = true, nullable = false)
	public int getIdResultats() {
		return this.idResultats;
	}

	public void setIdResultats(int idResultats) {
		this.idResultats = idResultats;
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
	@JoinColumn(name = "session_idSession", nullable = false)
	public Session getSession() {
		return this.session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	@Column(name = "Moyenne", length = 45)
	public String getMoyenne() {
		return this.moyenne;
	}

	public void setMoyenne(String moyenne) {
		this.moyenne = moyenne;
	}

	@Column(name = "Remarque", length = 45)
	public String getRemarque() {
		return this.remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bultien")
	public Set<Note> getNotes() {
		return this.notes;
	}

	public void setNotes(Set<Note> notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Bulletin [idResultats=" + idResultats + ", moyenne=" + moyenne + ", remarque=" + remarque + "]";
	}

}
