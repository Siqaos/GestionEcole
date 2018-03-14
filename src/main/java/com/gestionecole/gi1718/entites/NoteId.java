package com.gestionecole.gi1718.entites;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NoteId {

	private int idNote;
	private int bultienIdResultats;

	public NoteId() {
	}

	public NoteId(int idNote, int bultienIdResultats) {
		this.idNote = idNote;
		this.bultienIdResultats = bultienIdResultats;
	}

	@Column(name = "idNote", nullable = false)
	public int getIdNote() {
		return this.idNote;
	}

	public void setIdNote(int idNote) {
		this.idNote = idNote;
	}

	@Column(name = "bultien_idResultats", nullable = false)
	public int getBultienIdResultats() {
		return this.bultienIdResultats;
	}

	public void setBultienIdResultats(int bultienIdResultats) {
		this.bultienIdResultats = bultienIdResultats;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NoteId))
			return false;
		NoteId castOther = (NoteId) other;

		return (this.getIdNote() == castOther.getIdNote())
				&& (this.getBultienIdResultats() == castOther.getBultienIdResultats());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdNote();
		result = 37 * result + this.getBultienIdResultats();
		return result;
	}

	@Override
	public String toString() {
		return "NoteId [idNote=" + idNote + ", bultienIdResultats=" + bultienIdResultats + "]";
	}

}
