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
@Table(name = "fournisseur", catalog = "gestionecole")
public class Fournisseur {

	private int idFournisseur;
	private String addresse;
	private String email;
	private Set<Facture> factures = new HashSet<Facture>(0);
	private Set<Contact> contacts = new HashSet<Contact>(0);

	public Fournisseur() {
	}

	public Fournisseur(int idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public Fournisseur(int idFournisseur, String addresse, String email, Set<Facture> factures, Set<Contact> contacts) {
		this.idFournisseur = idFournisseur;
		this.addresse = addresse;
		this.email = email;
		this.factures = factures;
		this.contacts = contacts;
	}

	@Id

	@Column(name = "idFournisseur", unique = true, nullable = false)
	public int getIdFournisseur() {
		return this.idFournisseur;
	}

	public void setIdFournisseur(int idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	@Column(name = "Addresse", length = 45)
	public String getAddresse() {
		return this.addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	@Column(name = "Email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fournisseur")
	public Set<Facture> getFactures() {
		return this.factures;
	}

	public void setFactures(Set<Facture> factures) {
		this.factures = factures;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fournisseur")
	public Set<Contact> getContacts() {
		return this.contacts;
	}

	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}

}
