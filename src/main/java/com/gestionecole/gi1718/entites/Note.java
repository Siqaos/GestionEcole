package com.gestionecole.gi1718.entites;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "note", catalog = "gestionecole")
public class Note  {

	private NoteId id;
	private Bulletin bultien;
	private Examen examen;
	private String noteExam;
	private String remarque;

	public Note() {
	}

	public Note(NoteId id, Bulletin bultien, Examen examen) {
		this.id = id;
		this.bultien = bultien;
		this.examen = examen;
	}

	public Note(NoteId id, Bulletin bultien, Examen examen, String noteExam, String remarque) {
		this.id = id;
		this.bultien = bultien;
		this.examen = examen;
		this.noteExam = noteExam;
		this.remarque = remarque;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idNote", column = @Column(name = "idNote", nullable = false)),
			@AttributeOverride(name = "bultienIdResultats", column = @Column(name = "bultien_idResultats", nullable = false)) })
	public NoteId getId() {
		return this.id;
	}

	public void setId(NoteId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bultien_idResultats", nullable = false, insertable = false, updatable = false)
	public Bulletin getBultien() {
		return this.bultien;
	}

	public void setBultien(Bulletin bultien) {
		this.bultien = bultien;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Examen_idExamen", nullable = false)
	public Examen getExamen() {
		return this.examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}

	@Column(name = "NoteExam", length = 45)
	public String getNoteExam() {
		return this.noteExam;
	}

	public void setNoteExam(String noteExam) {
		this.noteExam = noteExam;
	}

	@Column(name = "Remarque", length = 45)
	public String getRemarque() {
		return this.remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", bultien=" + bultien + ", examen=" + examen + ", noteExam=" + noteExam
				+ ", remarque=" + remarque + "]";
	}

}
