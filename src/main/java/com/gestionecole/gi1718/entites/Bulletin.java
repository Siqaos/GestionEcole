package com.gestionecole.gi1718.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bulletin", catalog = "gestionecole")
public class Bulletin {

	private int idBulletin;
	private Eleve eleve;
	private Note note;
	private Session session;
	private String moyenne;
	private String remarque;

	public Bulletin() {
	}

	public Bulletin(int idBulletin, Eleve eleve, Note note, Session session) {
		this.idBulletin = idBulletin;
		this.eleve = eleve;
		this.note = note;
		this.session = session;
	}

	public Bulletin(int idBulletin, Eleve eleve, Note note, Session session, String moyenne, String remarque) {
		this.idBulletin = idBulletin;
		this.eleve = eleve;
		this.note = note;
		this.session = session;
		this.moyenne = moyenne;
		this.remarque = remarque;
	}

	@Id

	@Column(name = "idBulletin", unique = true, nullable = false)
	public int getIdBulletin() {
		return this.idBulletin;
	}

	public void setIdBulletin(int idBulletin) {
		this.idBulletin = idBulletin;
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
	@JoinColumn(name = "note_idNote", nullable = false)
	public Note getNote() {
		return this.note;
	}

	public void setNote(Note note) {
		this.note = note;
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

}
